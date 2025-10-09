
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LivelihoodSupportCardPercentileReports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LivelihoodSupportCardPercentileReports"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivelihoodSupportCardPercentileReports", propOrder = {
    "fromAmount",
    "periodTitle",
    "toAmount"
})
public class LivelihoodSupportCardPercentileReports {

    @XmlElement(name = "FromAmount", nillable = true)
    protected String fromAmount;
    @XmlElement(name = "PeriodTitle", nillable = true)
    protected String periodTitle;
    @XmlElement(name = "ToAmount", nillable = true)
    protected String toAmount;

    /**
     * Gets the value of the fromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAmount() {
        return fromAmount;
    }

    /**
     * Sets the value of the fromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAmount(String value) {
        this.fromAmount = value;
    }

    /**
     * Gets the value of the periodTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodTitle() {
        return periodTitle;
    }

    /**
     * Sets the value of the periodTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodTitle(String value) {
        this.periodTitle = value;
    }

    /**
     * Gets the value of the toAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAmount() {
        return toAmount;
    }

    /**
     * Sets the value of the toAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAmount(String value) {
        this.toAmount = value;
    }

}
