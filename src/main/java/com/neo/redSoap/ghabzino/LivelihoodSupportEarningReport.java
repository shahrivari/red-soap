
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LivelihoodSupportEarningReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LivelihoodSupportEarningReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixeEarningAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivelihoodSupportEarningReport", propOrder = {
    "bankProfit",
    "firstName",
    "fixeEarningAmount"
})
public class LivelihoodSupportEarningReport {

    @XmlElement(name = "BankProfit", nillable = true)
    protected String bankProfit;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "FixeEarningAmount", nillable = true)
    protected String fixeEarningAmount;

    /**
     * Gets the value of the bankProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProfit() {
        return bankProfit;
    }

    /**
     * Sets the value of the bankProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProfit(String value) {
        this.bankProfit = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fixeEarningAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixeEarningAmount() {
        return fixeEarningAmount;
    }

    /**
     * Sets the value of the fixeEarningAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixeEarningAmount(String value) {
        this.fixeEarningAmount = value;
    }

}
