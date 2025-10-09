
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceVehicleAuthenticityByBarcodeInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceVehicleAuthenticityByBarcodeInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuyerNationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtpReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerNationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceVehicleAuthenticityByBarcodeInputParams", propOrder = {
    "barcode",
    "buyerNationalID",
    "otpCode",
    "otpReferenceNumber",
    "ownerNationalID",
    "traceNumber"
})
public class NajiServiceVehicleAuthenticityByBarcodeInputParams {

    @XmlElement(name = "Barcode", nillable = true)
    protected String barcode;
    @XmlElement(name = "BuyerNationalID", nillable = true)
    protected String buyerNationalID;
    @XmlElement(name = "OtpCode", nillable = true)
    protected String otpCode;
    @XmlElement(name = "OtpReferenceNumber", nillable = true)
    protected String otpReferenceNumber;
    @XmlElement(name = "OwnerNationalID", nillable = true)
    protected String ownerNationalID;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the buyerNationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerNationalID() {
        return buyerNationalID;
    }

    /**
     * Sets the value of the buyerNationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerNationalID(String value) {
        this.buyerNationalID = value;
    }

    /**
     * Gets the value of the otpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpCode() {
        return otpCode;
    }

    /**
     * Sets the value of the otpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpCode(String value) {
        this.otpCode = value;
    }

    /**
     * Gets the value of the otpReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpReferenceNumber() {
        return otpReferenceNumber;
    }

    /**
     * Sets the value of the otpReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpReferenceNumber(String value) {
        this.otpReferenceNumber = value;
    }

    /**
     * Gets the value of the ownerNationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerNationalID() {
        return ownerNationalID;
    }

    /**
     * Sets the value of the ownerNationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerNationalID(String value) {
        this.ownerNationalID = value;
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

}
