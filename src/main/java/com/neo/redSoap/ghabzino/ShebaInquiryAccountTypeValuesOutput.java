
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShebaInquiryAccountTypeValuesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShebaInquiryAccountTypeValuesOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountTypeShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShebaInquiryAccountTypeValuesOutput", propOrder = {
    "accountTypeName",
    "accountTypeShowName"
})
public class ShebaInquiryAccountTypeValuesOutput {

    @XmlElement(name = "AccountTypeName", nillable = true)
    protected String accountTypeName;
    @XmlElement(name = "AccountTypeShowName", nillable = true)
    protected String accountTypeShowName;

    /**
     * Gets the value of the accountTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeName() {
        return accountTypeName;
    }

    /**
     * Sets the value of the accountTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeName(String value) {
        this.accountTypeName = value;
    }

    /**
     * Gets the value of the accountTypeShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeShowName() {
        return accountTypeShowName;
    }

    /**
     * Sets the value of the accountTypeShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeShowName(String value) {
        this.accountTypeShowName = value;
    }

}
