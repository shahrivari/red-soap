
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreewayTollBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreewayTollBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Freeway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TraverseDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FreewayTollBill", propOrder = {
    "amount",
    "fee",
    "freeway",
    "issueDateTime",
    "paymentStatus",
    "paymentStatusShowName",
    "totalAmount",
    "traverseDateTime",
    "uniqueID"
})
public class FreewayTollBill {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "Fee")
    protected Long fee;
    @XmlElement(name = "Freeway", nillable = true)
    protected String freeway;
    @XmlElement(name = "IssueDateTime", nillable = true)
    protected String issueDateTime;
    @XmlElement(name = "PaymentStatus", nillable = true)
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusShowName", nillable = true)
    protected String paymentStatusShowName;
    @XmlElement(name = "TotalAmount")
    protected Long totalAmount;
    @XmlElement(name = "TraverseDateTime", nillable = true)
    protected String traverseDateTime;
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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFee(Long value) {
        this.fee = value;
    }

    /**
     * Gets the value of the freeway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeway() {
        return freeway;
    }

    /**
     * Sets the value of the freeway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeway(String value) {
        this.freeway = value;
    }

    /**
     * Gets the value of the issueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Sets the value of the issueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDateTime(String value) {
        this.issueDateTime = value;
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
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAmount(Long value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the traverseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraverseDateTime() {
        return traverseDateTime;
    }

    /**
     * Sets the value of the traverseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraverseDateTime(String value) {
        this.traverseDateTime = value;
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
