
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
 *         &lt;element name="GetNationalCardOwnerImageResult" type="{http://schemas.datacontract.org/2004/07/Core}GetNationalCardOwnerImageOutput" minOccurs="0"/&gt;
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
    "getNationalCardOwnerImageResult"
})
@XmlRootElement(name = "GetNationalCardOwnerImageResponse", namespace = "http://tempuri.org/")
public class GetNationalCardOwnerImageResponse {

    @XmlElement(name = "GetNationalCardOwnerImageResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetNationalCardOwnerImageOutput getNationalCardOwnerImageResult;

    /**
     * Gets the value of the getNationalCardOwnerImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetNationalCardOwnerImageOutput }
     *     
     */
    public GetNationalCardOwnerImageOutput getGetNationalCardOwnerImageResult() {
        return getNationalCardOwnerImageResult;
    }

    /**
     * Sets the value of the getNationalCardOwnerImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNationalCardOwnerImageOutput }
     *     
     */
    public void setGetNationalCardOwnerImageResult(GetNationalCardOwnerImageOutput value) {
        this.getNationalCardOwnerImageResult = value;
    }

}
