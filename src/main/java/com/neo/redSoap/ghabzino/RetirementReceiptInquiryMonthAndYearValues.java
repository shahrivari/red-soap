
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetirementReceiptInquiryMonthAndYearValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetirementReceiptInquiryMonthAndYearValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonthAndYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonthAndYearShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetirementReceiptInquiryMonthAndYearValues", propOrder = {
    "monthAndYear",
    "monthAndYearShowName"
})
public class RetirementReceiptInquiryMonthAndYearValues {

    @XmlElement(name = "MonthAndYear", nillable = true)
    protected String monthAndYear;
    @XmlElement(name = "MonthAndYearShowName", nillable = true)
    protected String monthAndYearShowName;

    /**
     * Gets the value of the monthAndYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthAndYear() {
        return monthAndYear;
    }

    /**
     * Sets the value of the monthAndYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthAndYear(String value) {
        this.monthAndYear = value;
    }

    /**
     * Gets the value of the monthAndYearShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthAndYearShowName() {
        return monthAndYearShowName;
    }

    /**
     * Sets the value of the monthAndYearShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthAndYearShowName(String value) {
        this.monthAndYearShowName = value;
    }

}
