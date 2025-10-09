
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShebaInquiryGetDictionaryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShebaInquiryGetDictionaryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountTypes" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfShebaInquiryAccountTypeValuesOutput" minOccurs="0"/&gt;
 *         &lt;element name="AccountTypesTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Banks" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfShebaInquiryBankDictionaryValuesOutput" minOccurs="0"/&gt;
 *         &lt;element name="BanksTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShebaInquiryGetDictionaryOutputParams", propOrder = {
    "accountTypes",
    "accountTypesTotalCount",
    "banks",
    "banksTotalCount"
})
public class ShebaInquiryGetDictionaryOutputParams {

    @XmlElement(name = "AccountTypes", nillable = true)
    protected ArrayOfShebaInquiryAccountTypeValuesOutput accountTypes;
    @XmlElement(name = "AccountTypesTotalCount")
    protected Long accountTypesTotalCount;
    @XmlElement(name = "Banks", nillable = true)
    protected ArrayOfShebaInquiryBankDictionaryValuesOutput banks;
    @XmlElement(name = "BanksTotalCount")
    protected Long banksTotalCount;

    /**
     * Gets the value of the accountTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShebaInquiryAccountTypeValuesOutput }
     *     
     */
    public ArrayOfShebaInquiryAccountTypeValuesOutput getAccountTypes() {
        return accountTypes;
    }

    /**
     * Sets the value of the accountTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShebaInquiryAccountTypeValuesOutput }
     *     
     */
    public void setAccountTypes(ArrayOfShebaInquiryAccountTypeValuesOutput value) {
        this.accountTypes = value;
    }

    /**
     * Gets the value of the accountTypesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountTypesTotalCount() {
        return accountTypesTotalCount;
    }

    /**
     * Sets the value of the accountTypesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountTypesTotalCount(Long value) {
        this.accountTypesTotalCount = value;
    }

    /**
     * Gets the value of the banks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShebaInquiryBankDictionaryValuesOutput }
     *     
     */
    public ArrayOfShebaInquiryBankDictionaryValuesOutput getBanks() {
        return banks;
    }

    /**
     * Sets the value of the banks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShebaInquiryBankDictionaryValuesOutput }
     *     
     */
    public void setBanks(ArrayOfShebaInquiryBankDictionaryValuesOutput value) {
        this.banks = value;
    }

    /**
     * Gets the value of the banksTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBanksTotalCount() {
        return banksTotalCount;
    }

    /**
     * Sets the value of the banksTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBanksTotalCount(Long value) {
        this.banksTotalCount = value;
    }

}
