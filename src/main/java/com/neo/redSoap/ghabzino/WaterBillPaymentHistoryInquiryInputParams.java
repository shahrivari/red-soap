
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBillPaymentHistoryInquiryInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBillPaymentHistoryInquiryInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CycleInYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaterBillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBillPaymentHistoryInquiryInputParams", propOrder = {
    "cycleInYear",
    "traceNumber",
    "waterBillID",
    "year"
})
public class WaterBillPaymentHistoryInquiryInputParams {

    @XmlElement(name = "CycleInYear", nillable = true)
    protected Long cycleInYear;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;
    @XmlElement(name = "WaterBillID", nillable = true)
    protected String waterBillID;
    @XmlElement(name = "Year", nillable = true)
    protected Long year;

    /**
     * Gets the value of the cycleInYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCycleInYear() {
        return cycleInYear;
    }

    /**
     * Sets the value of the cycleInYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCycleInYear(Long value) {
        this.cycleInYear = value;
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
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYear(Long value) {
        this.year = value;
    }

}
