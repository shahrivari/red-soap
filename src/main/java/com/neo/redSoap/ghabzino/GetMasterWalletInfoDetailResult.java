
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMasterWalletInfoDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMasterWalletInfoDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DailyLimit" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult.CreditLimitObject" minOccurs="0"/&gt;
 *         &lt;element name="IbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyLimit" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult.CreditLimitObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMasterWalletInfoDetailResult", propOrder = {
    "credit",
    "dailyLimit",
    "ibanNumber",
    "lastUpdateDateTime",
    "transactionBillNumber",
    "weeklyLimit"
})
public class GetMasterWalletInfoDetailResult {

    @XmlElement(name = "Credit")
    protected Long credit;
    @XmlElement(name = "DailyLimit", nillable = true)
    protected GetMasterWalletInfoDetailResultCreditLimitObject dailyLimit;
    @XmlElement(name = "IbanNumber", nillable = true)
    protected String ibanNumber;
    @XmlElement(name = "LastUpdateDateTime", nillable = true)
    protected String lastUpdateDateTime;
    @XmlElement(name = "TransactionBillNumber", nillable = true)
    protected String transactionBillNumber;
    @XmlElement(name = "WeeklyLimit", nillable = true)
    protected GetMasterWalletInfoDetailResultCreditLimitObject weeklyLimit;

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCredit(Long value) {
        this.credit = value;
    }

    /**
     * Gets the value of the dailyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResultCreditLimitObject }
     *     
     */
    public GetMasterWalletInfoDetailResultCreditLimitObject getDailyLimit() {
        return dailyLimit;
    }

    /**
     * Sets the value of the dailyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResultCreditLimitObject }
     *     
     */
    public void setDailyLimit(GetMasterWalletInfoDetailResultCreditLimitObject value) {
        this.dailyLimit = value;
    }

    /**
     * Gets the value of the ibanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanNumber() {
        return ibanNumber;
    }

    /**
     * Sets the value of the ibanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanNumber(String value) {
        this.ibanNumber = value;
    }

    /**
     * Gets the value of the lastUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Sets the value of the lastUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDateTime(String value) {
        this.lastUpdateDateTime = value;
    }

    /**
     * Gets the value of the transactionBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionBillNumber() {
        return transactionBillNumber;
    }

    /**
     * Sets the value of the transactionBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionBillNumber(String value) {
        this.transactionBillNumber = value;
    }

    /**
     * Gets the value of the weeklyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResultCreditLimitObject }
     *     
     */
    public GetMasterWalletInfoDetailResultCreditLimitObject getWeeklyLimit() {
        return weeklyLimit;
    }

    /**
     * Sets the value of the weeklyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResultCreditLimitObject }
     *     
     */
    public void setWeeklyLimit(GetMasterWalletInfoDetailResultCreditLimitObject value) {
        this.weeklyLimit = value;
    }

}
