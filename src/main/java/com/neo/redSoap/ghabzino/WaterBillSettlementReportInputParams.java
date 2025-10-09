
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBillSettlementReportInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBillSettlementReportInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBankTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentChannelTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCompanyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaterBillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaterPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBillSettlementReportInputParams", propOrder = {
    "mobileNumber",
    "paidDateTime",
    "paymentBankTypeName",
    "paymentChannelTypeName",
    "paymentCompanyTypeName",
    "paymentTraceNumber",
    "traceNumber",
    "uniqueID",
    "waterBillID",
    "waterPaymentID"
})
public class WaterBillSettlementReportInputParams {

    @XmlElement(name = "MobileNumber", nillable = true)
    protected String mobileNumber;
    @XmlElement(name = "PaidDateTime", nillable = true)
    protected String paidDateTime;
    @XmlElement(name = "PaymentBankTypeName", nillable = true)
    protected String paymentBankTypeName;
    @XmlElement(name = "PaymentChannelTypeName", nillable = true)
    protected String paymentChannelTypeName;
    @XmlElement(name = "PaymentCompanyTypeName", nillable = true)
    protected String paymentCompanyTypeName;
    @XmlElement(name = "PaymentTraceNumber", nillable = true)
    protected String paymentTraceNumber;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;
    @XmlElement(name = "UniqueID", nillable = true)
    protected String uniqueID;
    @XmlElement(name = "WaterBillID", nillable = true)
    protected String waterBillID;
    @XmlElement(name = "WaterPaymentID", nillable = true)
    protected String waterPaymentID;

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
     * Gets the value of the paidDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDateTime() {
        return paidDateTime;
    }

    /**
     * Sets the value of the paidDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDateTime(String value) {
        this.paidDateTime = value;
    }

    /**
     * Gets the value of the paymentBankTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankTypeName() {
        return paymentBankTypeName;
    }

    /**
     * Sets the value of the paymentBankTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankTypeName(String value) {
        this.paymentBankTypeName = value;
    }

    /**
     * Gets the value of the paymentChannelTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannelTypeName() {
        return paymentChannelTypeName;
    }

    /**
     * Sets the value of the paymentChannelTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannelTypeName(String value) {
        this.paymentChannelTypeName = value;
    }

    /**
     * Gets the value of the paymentCompanyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCompanyTypeName() {
        return paymentCompanyTypeName;
    }

    /**
     * Sets the value of the paymentCompanyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCompanyTypeName(String value) {
        this.paymentCompanyTypeName = value;
    }

    /**
     * Gets the value of the paymentTraceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTraceNumber() {
        return paymentTraceNumber;
    }

    /**
     * Sets the value of the paymentTraceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTraceNumber(String value) {
        this.paymentTraceNumber = value;
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
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the waterBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterBillID() {
        return waterBillID;
    }

    /**
     * Sets the value of the waterBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterBillID(String value) {
        this.waterBillID = value;
    }

    /**
     * Gets the value of the waterPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterPaymentID() {
        return waterPaymentID;
    }

    /**
     * Sets the value of the waterPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterPaymentID(String value) {
        this.waterPaymentID = value;
    }

}
