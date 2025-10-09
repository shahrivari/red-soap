
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTaxFileRegistrationRequestInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTaxFileRegistrationRequestInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GreenSheetBase64Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarAnnualTaxFileRegistrationRequestInputParams", propOrder = {
    "greenSheetBase64Image",
    "isLegal",
    "mobileNumber",
    "traceNumber",
    "userMobileNumber"
})
public class CarAnnualTaxFileRegistrationRequestInputParams {

    @XmlElement(name = "GreenSheetBase64Image", nillable = true)
    protected String greenSheetBase64Image;
    @XmlElement(name = "IsLegal", nillable = true)
    protected String isLegal;
    @XmlElement(name = "MobileNumber", nillable = true)
    protected String mobileNumber;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;
    @XmlElement(name = "UserMobileNumber", nillable = true)
    protected String userMobileNumber;

    /**
     * Gets the value of the greenSheetBase64Image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreenSheetBase64Image() {
        return greenSheetBase64Image;
    }

    /**
     * Sets the value of the greenSheetBase64Image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreenSheetBase64Image(String value) {
        this.greenSheetBase64Image = value;
    }

    /**
     * Gets the value of the isLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLegal() {
        return isLegal;
    }

    /**
     * Sets the value of the isLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLegal(String value) {
        this.isLegal = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the traceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Sets the value of the traceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

    /**
     * Gets the value of the userMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    /**
     * Sets the value of the userMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMobileNumber(String value) {
        this.userMobileNumber = value;
    }

}
