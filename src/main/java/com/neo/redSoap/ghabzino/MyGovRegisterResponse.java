
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MyGovRegisterResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovRegisterOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "myGovRegisterResult"
})
@XmlRootElement(name = "MyGovRegisterResponse", namespace = "http://tempuri.org/")
public class MyGovRegisterResponse {

    @XmlElement(name = "MyGovRegisterResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovRegisterOutput myGovRegisterResult;

    /**
     * Gets the value of the myGovRegisterResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovRegisterOutput }
     *     
     */
    public MyGovRegisterOutput getMyGovRegisterResult() {
        return myGovRegisterResult;
    }

    /**
     * Sets the value of the myGovRegisterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovRegisterOutput }
     *     
     */
    public void setMyGovRegisterResult(MyGovRegisterOutput value) {
        this.myGovRegisterResult = value;
    }

}
