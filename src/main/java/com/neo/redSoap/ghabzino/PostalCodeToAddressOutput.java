
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalCodeToAddressOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalCodeToAddressOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Core}PostalCodeToAddressOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Core}WebServiceStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalCodeToAddressOutput", propOrder = {
    "parameters",
    "status"
})
public class PostalCodeToAddressOutput {

    @XmlElement(name = "Parameters", nillable = true)
    protected PostalCodeToAddressOutputParams parameters;
    @XmlElement(name = "Status", nillable = true)
    protected WebServiceStatus status;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeToAddressOutputParams }
     *     
     */
    public PostalCodeToAddressOutputParams getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeToAddressOutputParams }
     *     
     */
    public void setParameters(PostalCodeToAddressOutputParams value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceStatus }
     *     
     */
    public WebServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceStatus }
     *     
     */
    public void setStatus(WebServiceStatus value) {
        this.status = value;
    }

}
