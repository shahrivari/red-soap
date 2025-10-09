
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponRequestOtpOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponRequestOtpOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNationalIDRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOtpRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponRequestOtpOutputParams", propOrder = {
    "isNationalIDRequired",
    "isOtpRequired"
})
public class SfaraCouponRequestOtpOutputParams {

    @XmlElement(name = "IsNationalIDRequired")
    protected Boolean isNationalIDRequired;
    @XmlElement(name = "IsOtpRequired")
    protected Boolean isOtpRequired;

    /**
     * Gets the value of the isNationalIDRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNationalIDRequired() {
        return isNationalIDRequired;
    }

    /**
     * Sets the value of the isNationalIDRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNationalIDRequired(Boolean value) {
        this.isNationalIDRequired = value;
    }

    /**
     * Gets the value of the isOtpRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOtpRequired() {
        return isOtpRequired;
    }

    /**
     * Sets the value of the isOtpRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOtpRequired(Boolean value) {
        this.isOtpRequired = value;
    }

}
