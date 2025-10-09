
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
 *         &lt;element name="IranTejaratOtpVerifyResult" type="{http://schemas.datacontract.org/2004/07/Core}IranTejaratOtpVerifyOutput" minOccurs="0"/&gt;
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
    "iranTejaratOtpVerifyResult"
})
@XmlRootElement(name = "IranTejaratOtpVerifyResponse", namespace = "http://tempuri.org/")
public class IranTejaratOtpVerifyResponse {

    @XmlElement(name = "IranTejaratOtpVerifyResult", namespace = "http://tempuri.org/", nillable = true)
    protected IranTejaratOtpVerifyOutput iranTejaratOtpVerifyResult;

    /**
     * Gets the value of the iranTejaratOtpVerifyResult property.
     * 
     * @return
     *     possible object is
     *     {@link IranTejaratOtpVerifyOutput }
     *     
     */
    public IranTejaratOtpVerifyOutput getIranTejaratOtpVerifyResult() {
        return iranTejaratOtpVerifyResult;
    }

    /**
     * Sets the value of the iranTejaratOtpVerifyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IranTejaratOtpVerifyOutput }
     *     
     */
    public void setIranTejaratOtpVerifyResult(IranTejaratOtpVerifyOutput value) {
        this.iranTejaratOtpVerifyResult = value;
    }

}
