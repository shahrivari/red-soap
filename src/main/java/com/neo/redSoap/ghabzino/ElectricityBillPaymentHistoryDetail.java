
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityBillPaymentHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityBillPaymentHistoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BankShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ChanelType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ChanelTypeShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityBillPaymentHistoryDetail", propOrder = {
    "bankCode",
    "bankShowName",
    "billIdentifier",
    "chanelType",
    "chanelTypeShowName",
    "paymentAmt",
    "paymentDate",
    "trackingCode"
})
public class ElectricityBillPaymentHistoryDetail {

    @XmlElement(name = "BankCode")
    protected Long bankCode;
    @XmlElement(name = "BankShowName", nillable = true)
    protected String bankShowName;
    @XmlElement(name = "BillIdentifier")
    protected Long billIdentifier;
    @XmlElement(name = "ChanelType")
    protected Long chanelType;
    @XmlElement(name = "ChanelTypeShowName", nillable = true)
    protected String chanelTypeShowName;
    @XmlElement(name = "PaymentAmt")
    protected Long paymentAmt;
    @XmlElement(name = "PaymentDate", nillable = true)
    protected String paymentDate;
    @XmlElement(name = "TrackingCode")
    protected Long trackingCode;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankCode(Long value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankShowName() {
        return bankShowName;
    }

    /**
     * Sets the value of the bankShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankShowName(String value) {
        this.bankShowName = value;
    }

    /**
     * Gets the value of the billIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillIdentifier() {
        return billIdentifier;
    }

    /**
     * Sets the value of the billIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillIdentifier(Long value) {
        this.billIdentifier = value;
    }

    /**
     * Gets the value of the chanelType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChanelType() {
        return chanelType;
    }

    /**
     * Sets the value of the chanelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChanelType(Long value) {
        this.chanelType = value;
    }

    /**
     * Gets the value of the chanelTypeShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanelTypeShowName() {
        return chanelTypeShowName;
    }

    /**
     * Sets the value of the chanelTypeShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanelTypeShowName(String value) {
        this.chanelTypeShowName = value;
    }

    /**
     * Gets the value of the paymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Sets the value of the paymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentAmt(Long value) {
        this.paymentAmt = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrackingCode(Long value) {
        this.trackingCode = value;
    }

}
