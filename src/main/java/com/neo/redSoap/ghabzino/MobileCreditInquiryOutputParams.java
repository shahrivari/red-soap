
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileCreditInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileCreditInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternetPackage" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfMobileCreditInquiryInternetPackage" minOccurs="0"/&gt;
 *         &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmsPackageRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmsPackageTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TalkPackageRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TalkPackageTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileCreditInquiryOutputParams", propOrder = {
    "extraInfo",
    "fullName",
    "internetPackage",
    "invoice",
    "invoiceExtraInfo",
    "simType",
    "smsPackageRemaining",
    "smsPackageTotal",
    "talkPackageRemaining",
    "talkPackageTotal"
})
public class MobileCreditInquiryOutputParams {

    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "InternetPackage", nillable = true)
    protected ArrayOfMobileCreditInquiryInternetPackage internetPackage;
    @XmlElement(name = "Invoice", nillable = true)
    protected String invoice;
    @XmlElement(name = "InvoiceExtraInfo", nillable = true)
    protected String invoiceExtraInfo;
    @XmlElement(name = "SimType", nillable = true)
    protected String simType;
    @XmlElement(name = "SmsPackageRemaining", nillable = true)
    protected String smsPackageRemaining;
    @XmlElement(name = "SmsPackageTotal", nillable = true)
    protected String smsPackageTotal;
    @XmlElement(name = "TalkPackageRemaining", nillable = true)
    protected String talkPackageRemaining;
    @XmlElement(name = "TalkPackageTotal", nillable = true)
    protected String talkPackageTotal;

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
     * Gets the value of the internetPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMobileCreditInquiryInternetPackage }
     *     
     */
    public ArrayOfMobileCreditInquiryInternetPackage getInternetPackage() {
        return internetPackage;
    }

    /**
     * Sets the value of the internetPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMobileCreditInquiryInternetPackage }
     *     
     */
    public void setInternetPackage(ArrayOfMobileCreditInquiryInternetPackage value) {
        this.internetPackage = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the invoiceExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceExtraInfo() {
        return invoiceExtraInfo;
    }

    /**
     * Sets the value of the invoiceExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceExtraInfo(String value) {
        this.invoiceExtraInfo = value;
    }

    /**
     * Gets the value of the simType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimType() {
        return simType;
    }

    /**
     * Sets the value of the simType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimType(String value) {
        this.simType = value;
    }

    /**
     * Gets the value of the smsPackageRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsPackageRemaining() {
        return smsPackageRemaining;
    }

    /**
     * Sets the value of the smsPackageRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsPackageRemaining(String value) {
        this.smsPackageRemaining = value;
    }

    /**
     * Gets the value of the smsPackageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsPackageTotal() {
        return smsPackageTotal;
    }

    /**
     * Sets the value of the smsPackageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsPackageTotal(String value) {
        this.smsPackageTotal = value;
    }

    /**
     * Gets the value of the talkPackageRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkPackageRemaining() {
        return talkPackageRemaining;
    }

    /**
     * Sets the value of the talkPackageRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkPackageRemaining(String value) {
        this.talkPackageRemaining = value;
    }

    /**
     * Gets the value of the talkPackageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalkPackageTotal() {
        return talkPackageTotal;
    }

    /**
     * Sets the value of the talkPackageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalkPackageTotal(String value) {
        this.talkPackageTotal = value;
    }

}
