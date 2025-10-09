
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBillPaymentHistoryDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBillPaymentHistoryDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBankShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentChannelShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCompanyShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportPaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBillPaymentHistoryDetailList", propOrder = {
    "amount",
    "billID",
    "cycle",
    "paidDateTime",
    "paymentBankName",
    "paymentBankShowName",
    "paymentChannelName",
    "paymentChannelShowName",
    "paymentCompanyName",
    "paymentCompanyShowName",
    "paymentID",
    "paymentTraceNumber",
    "reportPaymentDateTime"
})
public class WaterBillPaymentHistoryDetailList {

    @XmlElement(name = "Amount")
    protected Double amount;
    @XmlElement(name = "BillID", nillable = true)
    protected String billID;
    @XmlElement(name = "Cycle", nillable = true)
    protected String cycle;
    @XmlElement(name = "PaidDateTime", nillable = true)
    protected String paidDateTime;
    @XmlElement(name = "PaymentBankName", nillable = true)
    protected String paymentBankName;
    @XmlElement(name = "PaymentBankShowName", nillable = true)
    protected String paymentBankShowName;
    @XmlElement(name = "PaymentChannelName", nillable = true)
    protected String paymentChannelName;
    @XmlElement(name = "PaymentChannelShowName", nillable = true)
    protected String paymentChannelShowName;
    @XmlElement(name = "PaymentCompanyName", nillable = true)
    protected String paymentCompanyName;
    @XmlElement(name = "PaymentCompanyShowName", nillable = true)
    protected String paymentCompanyShowName;
    @XmlElement(name = "PaymentID", nillable = true)
    protected String paymentID;
    @XmlElement(name = "PaymentTraceNumber", nillable = true)
    protected String paymentTraceNumber;
    @XmlElement(name = "ReportPaymentDateTime", nillable = true)
    protected String reportPaymentDateTime;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the billID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillID() {
        return billID;
    }

    /**
     * Sets the value of the billID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillID(String value) {
        this.billID = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycle(String value) {
        this.cycle = value;
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
     * Gets the value of the paymentBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankName() {
        return paymentBankName;
    }

    /**
     * Sets the value of the paymentBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankName(String value) {
        this.paymentBankName = value;
    }

    /**
     * Gets the value of the paymentBankShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankShowName() {
        return paymentBankShowName;
    }

    /**
     * Sets the value of the paymentBankShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankShowName(String value) {
        this.paymentBankShowName = value;
    }

    /**
     * Gets the value of the paymentChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannelName() {
        return paymentChannelName;
    }

    /**
     * Sets the value of the paymentChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannelName(String value) {
        this.paymentChannelName = value;
    }

    /**
     * Gets the value of the paymentChannelShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannelShowName() {
        return paymentChannelShowName;
    }

    /**
     * Sets the value of the paymentChannelShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannelShowName(String value) {
        this.paymentChannelShowName = value;
    }

    /**
     * Gets the value of the paymentCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCompanyName() {
        return paymentCompanyName;
    }

    /**
     * Sets the value of the paymentCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCompanyName(String value) {
        this.paymentCompanyName = value;
    }

    /**
     * Gets the value of the paymentCompanyShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCompanyShowName() {
        return paymentCompanyShowName;
    }

    /**
     * Sets the value of the paymentCompanyShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCompanyShowName(String value) {
        this.paymentCompanyShowName = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
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
     * Gets the value of the reportPaymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPaymentDateTime() {
        return reportPaymentDateTime;
    }

    /**
     * Sets the value of the reportPaymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPaymentDateTime(String value) {
        this.reportPaymentDateTime = value;
    }

}
