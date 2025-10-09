
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetirementReceiptInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetirementReceiptInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Advantagescollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPayable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPayableLetters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SumFractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetirementReceiptInquiryOutputParams", propOrder = {
    "accountNumber",
    "advantagescollection",
    "bankBranch",
    "extraInfo",
    "fullName",
    "issueDate",
    "nationalID",
    "netPayable",
    "netPayableLetters",
    "payerOrganization",
    "receiptPdfUrl",
    "relatedOrganization",
    "socialNumber",
    "sumFractions",
    "uniqueNumber"
})
public class RetirementReceiptInquiryOutputParams {

    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "Advantagescollection", nillable = true)
    protected String advantagescollection;
    @XmlElement(name = "BankBranch", nillable = true)
    protected String bankBranch;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "IssueDate", nillable = true)
    protected String issueDate;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "NetPayable", nillable = true)
    protected String netPayable;
    @XmlElement(name = "NetPayableLetters", nillable = true)
    protected String netPayableLetters;
    @XmlElement(name = "PayerOrganization", nillable = true)
    protected String payerOrganization;
    @XmlElement(name = "ReceiptPdfUrl", nillable = true)
    protected String receiptPdfUrl;
    @XmlElement(name = "RelatedOrganization", nillable = true)
    protected String relatedOrganization;
    @XmlElement(name = "SocialNumber", nillable = true)
    protected String socialNumber;
    @XmlElement(name = "SumFractions", nillable = true)
    protected String sumFractions;
    @XmlElement(name = "UniqueNumber", nillable = true)
    protected String uniqueNumber;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the advantagescollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvantagescollection() {
        return advantagescollection;
    }

    /**
     * Sets the value of the advantagescollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvantagescollection(String value) {
        this.advantagescollection = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalID(String value) {
        this.nationalID = value;
    }

    /**
     * Gets the value of the netPayable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPayable() {
        return netPayable;
    }

    /**
     * Sets the value of the netPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPayable(String value) {
        this.netPayable = value;
    }

    /**
     * Gets the value of the netPayableLetters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPayableLetters() {
        return netPayableLetters;
    }

    /**
     * Sets the value of the netPayableLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPayableLetters(String value) {
        this.netPayableLetters = value;
    }

    /**
     * Gets the value of the payerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerOrganization() {
        return payerOrganization;
    }

    /**
     * Sets the value of the payerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerOrganization(String value) {
        this.payerOrganization = value;
    }

    /**
     * Gets the value of the receiptPdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptPdfUrl() {
        return receiptPdfUrl;
    }

    /**
     * Sets the value of the receiptPdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptPdfUrl(String value) {
        this.receiptPdfUrl = value;
    }

    /**
     * Gets the value of the relatedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedOrganization() {
        return relatedOrganization;
    }

    /**
     * Sets the value of the relatedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedOrganization(String value) {
        this.relatedOrganization = value;
    }

    /**
     * Gets the value of the socialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialNumber() {
        return socialNumber;
    }

    /**
     * Sets the value of the socialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialNumber(String value) {
        this.socialNumber = value;
    }

    /**
     * Gets the value of the sumFractions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumFractions() {
        return sumFractions;
    }

    /**
     * Sets the value of the sumFractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumFractions(String value) {
        this.sumFractions = value;
    }

    /**
     * Gets the value of the uniqueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    /**
     * Sets the value of the uniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueNumber(String value) {
        this.uniqueNumber = value;
    }

}
