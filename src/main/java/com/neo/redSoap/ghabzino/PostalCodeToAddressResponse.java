
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
 *         &lt;element name="PostalCodeToAddressResult" type="{http://schemas.datacontract.org/2004/07/Core}PostalCodeToAddressOutput" minOccurs="0"/&gt;
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
    "postalCodeToAddressResult"
})
@XmlRootElement(name = "PostalCodeToAddressResponse", namespace = "http://tempuri.org/")
public class PostalCodeToAddressResponse {

    @XmlElement(name = "PostalCodeToAddressResult", namespace = "http://tempuri.org/", nillable = true)
    protected PostalCodeToAddressOutput postalCodeToAddressResult;

    /**
     * Gets the value of the postalCodeToAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeToAddressOutput }
     *     
     */
    public PostalCodeToAddressOutput getPostalCodeToAddressResult() {
        return postalCodeToAddressResult;
    }

    /**
     * Sets the value of the postalCodeToAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeToAddressOutput }
     *     
     */
    public void setPostalCodeToAddressResult(PostalCodeToAddressOutput value) {
        this.postalCodeToAddressResult = value;
    }

}
