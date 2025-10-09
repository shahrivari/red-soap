
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JusticeSharesPortfolioInquiryRequestOtpOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JusticeSharesPortfolioInquiryRequestOtpOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaskMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtpRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JusticeSharesPortfolioInquiryRequestOtpOutputParams", propOrder = {
    "maskMobileNumber",
    "otpRequired"
})
public class JusticeSharesPortfolioInquiryRequestOtpOutputParams {

    @XmlElement(name = "MaskMobileNumber", nillable = true)
    protected String maskMobileNumber;
    @XmlElement(name = "OtpRequired")
    protected Boolean otpRequired;

    /**
     * Gets the value of the maskMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskMobileNumber() {
        return maskMobileNumber;
    }

    /**
     * Sets the value of the maskMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskMobileNumber(String value) {
        this.maskMobileNumber = value;
    }

    /**
     * Gets the value of the otpRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtpRequired() {
        return otpRequired;
    }

    /**
     * Sets the value of the otpRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtpRequired(Boolean value) {
        this.otpRequired = value;
    }

}
