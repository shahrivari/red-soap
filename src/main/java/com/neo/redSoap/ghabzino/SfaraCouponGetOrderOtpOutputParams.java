
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponGetOrderOtpOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponGetOrderOtpOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Otp4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Otp8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponGetOrderOtpOutputParams", propOrder = {
    "otp4",
    "otp8"
})
public class SfaraCouponGetOrderOtpOutputParams {

    @XmlElement(name = "Otp4", nillable = true)
    protected String otp4;
    @XmlElement(name = "Otp8", nillable = true)
    protected String otp8;

    /**
     * Gets the value of the otp4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp4() {
        return otp4;
    }

    /**
     * Sets the value of the otp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp4(String value) {
        this.otp4 = value;
    }

    /**
     * Gets the value of the otp8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp8() {
        return otp8;
    }

    /**
     * Sets the value of the otp8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp8(String value) {
        this.otp8 = value;
    }

}
