
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityBillSettlementReportInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityBillSettlementReportInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ElectricityBillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBankTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentChannelTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricityBillSettlementReportInputParams", propOrder = {
    "amount",
    "electricityBillID",
    "paidDateTime",
    "paymentBankTypeID",
    "paymentChannelTypeID",
    "paymentID",
    "paymentTraceNumber",
    "traceNumber"
})
public class ElectricityBillSettlementReportInputParams {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "ElectricityBillID", nillable = true)
    protected String electricityBillID;
    @XmlElement(name = "PaidDateTime", nillable = true)
    protected String paidDateTime;
    @XmlElement(name = "PaymentBankTypeID")
    protected Long paymentBankTypeID;
    @XmlElement(name = "PaymentChannelTypeID")
    protected Long paymentChannelTypeID;
    @XmlElement(name = "PaymentID", nillable = true)
    protected String paymentID;
    @XmlElement(name = "PaymentTraceNumber", nillable = true)
    protected String paymentTraceNumber;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the electricityBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricityBillID() {
        return electricityBillID;
    }

    /**
     * Sets the value of the electricityBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricityBillID(String value) {
        this.electricityBillID = value;
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
     * Gets the value of the paymentBankTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentBankTypeID() {
        return paymentBankTypeID;
    }

    /**
     * Sets the value of the paymentBankTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentBankTypeID(Long value) {
        this.paymentBankTypeID = value;
    }

    /**
     * Gets the value of the paymentChannelTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentChannelTypeID() {
        return paymentChannelTypeID;
    }

    /**
     * Sets the value of the paymentChannelTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentChannelTypeID(Long value) {
        this.paymentChannelTypeID = value;
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
