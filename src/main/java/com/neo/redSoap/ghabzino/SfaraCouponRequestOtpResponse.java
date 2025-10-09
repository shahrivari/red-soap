
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
 *         &lt;element name="SfaraCouponRequestOtpResult" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponRequestOtpOutput" minOccurs="0"/&gt;
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
    "sfaraCouponRequestOtpResult"
})
@XmlRootElement(name = "SfaraCouponRequestOtpResponse", namespace = "http://tempuri.org/")
public class SfaraCouponRequestOtpResponse {

    @XmlElement(name = "SfaraCouponRequestOtpResult", namespace = "http://tempuri.org/", nillable = true)
    protected SfaraCouponRequestOtpOutput sfaraCouponRequestOtpResult;

    /**
     * Gets the value of the sfaraCouponRequestOtpResult property.
     * 
     * @return
     *     possible object is
     *     {@link SfaraCouponRequestOtpOutput }
     *     
     */
    public SfaraCouponRequestOtpOutput getSfaraCouponRequestOtpResult() {
        return sfaraCouponRequestOtpResult;
    }

    /**
     * Sets the value of the sfaraCouponRequestOtpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfaraCouponRequestOtpOutput }
     *     
     */
    public void setSfaraCouponRequestOtpResult(SfaraCouponRequestOtpOutput value) {
        this.sfaraCouponRequestOtpResult = value;
    }

}
