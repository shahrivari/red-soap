
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTollBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTollBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Debt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Frazzle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Motor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Penalty" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Shasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarAnnualTollBill", propOrder = {
    "amount",
    "debt",
    "fee",
    "frazzle",
    "fullName",
    "motor",
    "paymentStatus",
    "paymentStatusShowName",
    "penalty",
    "shasi",
    "totalAmount",
    "uniqueID",
    "vehicleDescription"
})
public class CarAnnualTollBill {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "Debt")
    protected Long debt;
    @XmlElement(name = "Fee")
    protected Long fee;
    @XmlElement(name = "Frazzle")
    protected Long frazzle;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "Motor", nillable = true)
    protected String motor;
    @XmlElement(name = "PaymentStatus", nillable = true)
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusShowName", nillable = true)
    protected String paymentStatusShowName;
    @XmlElement(name = "Penalty")
    protected Long penalty;
    @XmlElement(name = "Shasi", nillable = true)
    protected String shasi;
    @XmlElement(name = "TotalAmount")
    protected Long totalAmount;
    @XmlElement(name = "UniqueID", nillable = true)
    protected String uniqueID;
    @XmlElement(name = "VehicleDescription", nillable = true)
    protected String vehicleDescription;

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
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebt(Long value) {
        this.debt = value;
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
     * Gets the value of the frazzle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrazzle() {
        return frazzle;
    }

    /**
     * Sets the value of the frazzle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrazzle(Long value) {
        this.frazzle = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the motor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Sets the value of the motor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor(String value) {
        this.motor = value;
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
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPenalty(Long value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the shasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShasi() {
        return shasi;
    }

    /**
     * Sets the value of the shasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShasi(String value) {
        this.shasi = value;
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
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescription(String value) {
        this.vehicleDescription = value;
    }

}
