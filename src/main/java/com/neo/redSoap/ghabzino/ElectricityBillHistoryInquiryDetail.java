
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityBillHistoryInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityBillHistoryInquiryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageConsumption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaytollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PowerPaytollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricityBillHistoryInquiryDetail", propOrder = {
    "averageConsumption",
    "currentDate",
    "cycle",
    "extraInfo",
    "insuranceAmount",
    "paytollAmount",
    "powerPaytollAmount",
    "previousDate",
    "saleYear",
    "taxAmount",
    "totalDays"
})
public class ElectricityBillHistoryInquiryDetail {

    @XmlElement(name = "AverageConsumption", nillable = true)
    protected String averageConsumption;
    @XmlElement(name = "CurrentDate", nillable = true)
    protected String currentDate;
    @XmlElement(name = "Cycle", nillable = true)
    protected String cycle;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "InsuranceAmount", nillable = true)
    protected String insuranceAmount;
    @XmlElement(name = "PaytollAmount", nillable = true)
    protected String paytollAmount;
    @XmlElement(name = "PowerPaytollAmount", nillable = true)
    protected String powerPaytollAmount;
    @XmlElement(name = "PreviousDate", nillable = true)
    protected String previousDate;
    @XmlElement(name = "SaleYear", nillable = true)
    protected String saleYear;
    @XmlElement(name = "TaxAmount", nillable = true)
    protected String taxAmount;
    @XmlElement(name = "TotalDays", nillable = true)
    protected String totalDays;

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
