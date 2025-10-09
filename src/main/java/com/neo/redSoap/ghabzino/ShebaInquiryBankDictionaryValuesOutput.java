
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShebaInquiryBankDictionaryValuesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShebaInquiryBankDictionaryValuesOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountToSheba" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardToSheba" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ColorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelimiterArray" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="DelimiterArrayTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShebaToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WhiteImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShebaInquiryBankDictionaryValuesOutput", propOrder = {
    "accountDelimiter",
    "accountToSheba",
    "bankCode",
    "bankName",
    "bankShowName",
    "cardToSheba",
    "colorCode",
    "delimiterArray",
    "delimiterArrayTotalCount",
    "imageUrl",
    "isActive",
    "shebaToAccount",
    "whiteImageUrl"
})
public class ShebaInquiryBankDictionaryValuesOutput {

    @XmlElement(name = "AccountDelimiter", nillable = true)
    protected String accountDelimiter;
    @XmlElement(name = "AccountToSheba")
    protected Boolean accountToSheba;
    @XmlElement(name = "BankCode", nillable = true)
    protected String bankCode;
    @XmlElement(name = "BankName", nillable = true)
    protected String bankName;
    @XmlElement(name = "BankShowName", nillable = true)
    protected String bankShowName;
    @XmlElement(name = "CardToSheba")
    protected Boolean cardToSheba;
    @XmlElement(name = "ColorCode", nillable = true)
    protected String colorCode;
    @XmlElement(name = "DelimiterArray", nillable = true)
    protected ArrayOflong delimiterArray;
    @XmlElement(name = "DelimiterArrayTotalCount")
    protected Long delimiterArrayTotalCount;
    @XmlElement(name = "ImageUrl", nillable = true)
    protected String imageUrl;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "ShebaToAccount")
    protected Boolean shebaToAccount;
    @XmlElement(name = "WhiteImageUrl", nillable = true)
    protected String whiteImageUrl;

    /**
     * Gets the value of the accountDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDelimiter() {
        return accountDelimiter;
    }

    /**
     * Sets the value of the accountDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDelimiter(String value) {
        this.accountDelimiter = value;
    }

    /**
     * Gets the value of the accountToSheba property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountToSheba() {
        return accountToSheba;
    }

    /**
     * Sets the value of the accountToSheba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountToSheba(Boolean value) {
        this.accountToSheba = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankShowName() {
        return bankShowName;
    }

    /**
     * Sets the value of the bankShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankShowName(String value) {
        this.bankShowName = value;
    }

    /**
     * Gets the value of the cardToSheba property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardToSheba() {
        return cardToSheba;
    }

    /**
     * Sets the value of the cardToSheba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardToSheba(Boolean value) {
        this.cardToSheba = value;
    }

    /**
     * Gets the value of the colorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Sets the value of the colorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
    }

    /**
     * Gets the value of the delimiterArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDelimiterArray() {
        return delimiterArray;
    }

    /**
     * Sets the value of the delimiterArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDelimiterArray(ArrayOflong value) {
        this.delimiterArray = value;
    }

    /**
     * Gets the value of the delimiterArrayTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelimiterArrayTotalCount() {
        return delimiterArrayTotalCount;
    }

    /**
     * Sets the value of the delimiterArrayTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelimiterArrayTotalCount(Long value) {
        this.delimiterArrayTotalCount = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the shebaToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShebaToAccount() {
        return shebaToAccount;
    }

    /**
     * Sets the value of the shebaToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShebaToAccount(Boolean value) {
        this.shebaToAccount = value;
    }

    /**
     * Gets the value of the whiteImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteImageUrl() {
        return whiteImageUrl;
    }

    /**
     * Sets the value of the whiteImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteImageUrl(String value) {
        this.whiteImageUrl = value;
    }

}
