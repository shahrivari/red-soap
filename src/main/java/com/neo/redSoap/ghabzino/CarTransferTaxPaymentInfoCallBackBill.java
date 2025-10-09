
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarTransferTaxPaymentInfoCallBackBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarTransferTaxPaymentInfoCallBackBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCertificateUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettlementUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarTransferTaxPaymentInfoCallBackBill", propOrder = {
    "amount",
    "paymentDateTime",
    "paymentStatus",
    "paymentStatusShowName",
    "paymentTraceNumber",
    "settlementCertificateUrl",
    "settlementUniqueID",
    "title",
    "type",
    "typeShowName",
    "uniqueID"
})
public class CarTransferTaxPaymentInfoCallBackBill {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "PaymentDateTime", nillable = true)
    protected String paymentDateTime;
    @XmlElement(name = "PaymentStatus", nillable = true)
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusShowName", nillable = true)
    protected String paymentStatusShowName;
    @XmlElement(name = "PaymentTraceNumber", nillable = true)
    protected String paymentTraceNumber;
    @XmlElement(name = "SettlementCertificateUrl", nillable = true)
    protected String settlementCertificateUrl;
    @XmlElement(name = "SettlementUniqueID", nillable = true)
    protected String settlementUniqueID;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "TypeShowName", nillable = true)
    protected String typeShowName;
    @XmlElement(name = "UniqueID", nillable = true)
    protected String uniqueID;

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
     * Gets the value of the paymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDateTime() {
        return paymentDateTime;
    }

    /**
     * Sets the value of the paymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDateTime(String value) {
        this.paymentDateTime = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentStatusShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusShowName() {
        return paymentStatusShowName;
    }

    /**
     * Sets the value of the paymentStatusShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusShowName(String value) {
        this.paymentStatusShowName = value;
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
     * Gets the value of the settlementCertificateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCertificateUrl() {
        return settlementCertificateUrl;
    }

    /**
     * Sets the value of the settlementCertificateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCertificateUrl(String value) {
        this.settlementCertificateUrl = value;
    }

    /**
     * Gets the value of the settlementUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementUniqueID() {
        return settlementUniqueID;
    }

    /**
     * Sets the value of the settlementUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementUniqueID(String value) {
        this.settlementUniqueID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeShowName() {
        return typeShowName;
    }

    /**
     * Sets the value of the typeShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeShowName(String value) {
        this.typeShowName = value;
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

}
