
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityBillInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityBillInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AverageConsumption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaytollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PowerPaytollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityBillInquiryOutputParams", propOrder = {
    "address",
    "amount",
    "averageConsumption",
    "billID",
    "billPdfUrl",
    "currentDate",
    "customerType",
    "cycle",
    "extraInfo",
    "fullName",
    "insuranceAmount",
    "paymentDate",
    "paymentID",
    "paytollAmount",
    "powerPaytollAmount",
    "previousDate",
    "saleYear",
    "tariffType",
    "taxAmount",
    "totalDays"
})
public class ElectricityBillInquiryOutputParams {

    @XmlElement(name = "Address", nillable = true)
    protected String address;
    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "AverageConsumption", nillable = true)
    protected String averageConsumption;
    @XmlElement(name = "BillID", nillable = true)
    protected String billID;
    @XmlElement(name = "BillPdfUrl", nillable = true)
    protected String billPdfUrl;
    @XmlElement(name = "CurrentDate", nillable = true)
    protected String currentDate;
    @XmlElement(name = "CustomerType", nillable = true)
    protected String customerType;
    @XmlElement(name = "Cycle", nillable = true)
    protected String cycle;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "InsuranceAmount", nillable = true)
    protected String insuranceAmount;
    @XmlElement(name = "PaymentDate", nillable = true)
    protected String paymentDate;
    @XmlElement(name = "PaymentID", nillable = true)
    protected String paymentID;
    @XmlElement(name = "PaytollAmount", nillable = true)
    protected String paytollAmount;
    @XmlElement(name = "PowerPaytollAmount", nillable = true)
    protected String powerPaytollAmount;
    @XmlElement(name = "PreviousDate", nillable = true)
    protected String previousDate;
    @XmlElement(name = "SaleYear", nillable = true)
    protected String saleYear;
    @XmlElement(name = "TariffType", nillable = true)
    protected String tariffType;
    @XmlElement(name = "TaxAmount", nillable = true)
    protected String taxAmount;
    @XmlElement(name = "TotalDays", nillable = true)
    protected String totalDays;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

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
     * Gets the value of the averageConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Sets the value of the averageConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageConsumption(String value) {
        this.averageConsumption = value;
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
     * Gets the value of the billPdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPdfUrl() {
        return billPdfUrl;
    }

    /**
     * Sets the value of the billPdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPdfUrl(String value) {
        this.billPdfUrl = value;
    }

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDate(String value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
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
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
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
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceAmount(String value) {
        this.insuranceAmount = value;
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
     * Gets the value of the paytollAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytollAmount() {
        return paytollAmount;
    }

    /**
     * Sets the value of the paytollAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytollAmount(String value) {
        this.paytollAmount = value;
    }

    /**
     * Gets the value of the powerPaytollAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerPaytollAmount() {
        return powerPaytollAmount;
    }

    /**
     * Sets the value of the powerPaytollAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerPaytollAmount(String value) {
        this.powerPaytollAmount = value;
    }

    /**
     * Gets the value of the previousDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDate() {
        return previousDate;
    }

    /**
     * Sets the value of the previousDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDate(String value) {
        this.previousDate = value;
    }

    /**
     * Gets the value of the saleYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleYear() {
        return saleYear;
    }

    /**
     * Sets the value of the saleYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleYear(String value) {
        this.saleYear = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the totalDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDays() {
        return totalDays;
    }

    /**
     * Sets the value of the totalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDays(String value) {
        this.totalDays = value;
    }

}
