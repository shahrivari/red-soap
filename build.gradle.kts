import com.yupzip.wsdl2java.Wsdl2JavaTask

plugins {
    java
    id("com.yupzip.wsdl2java") version "3.0.0"
    `maven-publish`
}

group = "com.neo"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}


repositories {
    mavenCentral()
}

dependencies {
    // The runtime dependencies needed by the generated CXF/JAX-WS stubs
    implementation("org.apache.cxf:cxf-rt-frontend-jaxws:4.0.0")
    implementation("org.apache.cxf:cxf-rt-transports-http-hc5:4.0.0")

    // If you need Jakarta / JAXB APIs
    implementation("jakarta.xml.ws:jakarta.xml.ws-api:4.0.0")
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.0")

    implementation("com.sun.xml.bind:jaxb-impl:4.0.1")

    // Dependencies for the code-generation task itself
    // The plugin provides a “wsdl2java” configuration for this
    wsdl2java("com.sun.xml.bind:jaxb-impl:4.0.1")
    wsdl2java("org.apache.cxf.xjc-utils:cxf-xjc-runtime:4.0.0")
    wsdl2java("org.jvnet.jaxb2_commons:jaxb2-namespace-prefix:2.0")
    wsdl2java("codes.rafael.jaxb2_commons:jaxb2-basics:3.0.0")
    wsdl2java("codes.rafael.jaxb2_commons:jaxb2-basics-runtime:3.0.0")
    wsdl2java("org.apache.cxf:cxf-tools-wsdlto-frontend-jaxws:4.0.0")
    wsdl2java("org.apache.cxf:cxf-tools-wsdlto-databinding-jaxb:4.0.0")

}

val generatedWsdlDirectory = layout.buildDirectory.dir("$projectDir/src/main/java")

// Configure the wsdl2java plugin:
wsdl2java {

    wsdlDir = file("$projectDir/src/main/resources")
    generatedWsdlDir = generatedWsdlDirectory.get().asFile.path

    // Must specify a CXF version and plugin version per plugin docs
    cxfVersion = "4.0.0"
    cxfPluginVersion = "4.0.0"

    // Whether to pull in Java 8 XML dependencies automatically (disable if you're using Jakarta)
    includeJava8XmlDependencies = false

    // List of WSDLs to generate, with arguments
    wsdlsToGenerate = listOf(
        listOf(
            "-b", "${wsdlDir}/bindings.xjb",
            "-autoNameResolution",
            "-p", "com.neo.redSoap.ghabzino",
            "-verbose",
            // the actual WSDL path (relative to wsdlDir or absolute)
            "$wsdlDir/ghabzino.wsdl",
        )
    )
}

// Make sure generated sources are part of compilation
sourceSets {
    main {
        java.srcDir(generatedWsdlDirectory)
    }
}

tasks.withType<Wsdl2JavaTask>().configureEach {
    // optional: you can set defaults here if you like
}

tasks.named("compileJava") {
    dependsOn(tasks.withType<Wsdl2JavaTask>())
}
