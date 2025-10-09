
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetirementReceiptInquiryGetDictionaryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetirementReceiptInquiryGetDictionaryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonthAndYears" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfRetirementReceiptInquiryMonthAndYearValues" minOccurs="0"/&gt;
 *         &lt;element name="MonthAndYearsTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetirementReceiptInquiryGetDictionaryOutputParams", propOrder = {
    "monthAndYears",
    "monthAndYearsTotalCount"
})
public class RetirementReceiptInquiryGetDictionaryOutputParams {

    @XmlElement(name = "MonthAndYears", nillable = true)
    protected ArrayOfRetirementReceiptInquiryMonthAndYearValues monthAndYears;
    @XmlElement(name = "MonthAndYearsTotalCount")
    protected Long monthAndYearsTotalCount;

    /**
     * Gets the value of the monthAndYears property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetirementReceiptInquiryMonthAndYearValues }
     *     
     */
    public ArrayOfRetirementReceiptInquiryMonthAndYearValues getMonthAndYears() {
        return monthAndYears;
    }

    /**
     * Sets the value of the monthAndYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetirementReceiptInquiryMonthAndYearValues }
     *     
     */
    public void setMonthAndYears(ArrayOfRetirementReceiptInquiryMonthAndYearValues value) {
        this.monthAndYears = value;
    }

    /**
     * Gets the value of the monthAndYearsTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthAndYearsTotalCount() {
        return monthAndYearsTotalCount;
    }

    /**
     * Sets the value of the monthAndYearsTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthAndYearsTotalCount(Long value) {
        this.monthAndYearsTotalCount = value;
    }

}
