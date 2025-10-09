
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionReceiptInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PensionReceiptInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrearsPayment" type="{http://schemas.datacontract.org/2004/07/Core}TaminReceiptItemsParams" minOccurs="0"/&gt;
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyPayment" type="{http://schemas.datacontract.org/2004/07/Core}TaminReceiptItemsParams" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewYearPayment" type="{http://schemas.datacontract.org/2004/07/Core}TaminReceiptItemsParams" minOccurs="0"/&gt;
 *         &lt;element name="PensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PensionReceiptInquiryOutputParams", propOrder = {
    "arrearsPayment",
    "fatherName",
    "firstName",
    "lastName",
    "monthlyPayment",
    "nationalID",
    "newYearPayment",
    "pensionNumber",
    "receiptPdfUrl",
    "socialNumber"
})
public class PensionReceiptInquiryOutputParams {

    @XmlElement(name = "ArrearsPayment", nillable = true)
    protected TaminReceiptItemsParams arrearsPayment;
    @XmlElement(name = "FatherName", nillable = true)
    protected String fatherName;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "MonthlyPayment", nillable = true)
    protected TaminReceiptItemsParams monthlyPayment;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "NewYearPayment", nillable = true)
    protected TaminReceiptItemsParams newYearPayment;
    @XmlElement(name = "PensionNumber", nillable = true)
    protected String pensionNumber;
    @XmlElement(name = "ReceiptPdfUrl", nillable = true)
    protected String receiptPdfUrl;
    @XmlElement(name = "SocialNumber", nillable = true)
    protected String socialNumber;

    /**
     * Gets the value of the arrearsPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public TaminReceiptItemsParams getArrearsPayment() {
        return arrearsPayment;
    }

    /**
     * Sets the value of the arrearsPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public void setArrearsPayment(TaminReceiptItemsParams value) {
        this.arrearsPayment = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the monthlyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public TaminReceiptItemsParams getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Sets the value of the monthlyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public void setMonthlyPayment(TaminReceiptItemsParams value) {
        this.monthlyPayment = value;
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
     * Gets the value of the newYearPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public TaminReceiptItemsParams getNewYearPayment() {
        return newYearPayment;
    }

    /**
     * Sets the value of the newYearPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaminReceiptItemsParams }
     *     
     */
    public void setNewYearPayment(TaminReceiptItemsParams value) {
        this.newYearPayment = value;
    }

    /**
     * Gets the value of the pensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionNumber() {
        return pensionNumber;
    }

    /**
     * Sets the value of the pensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionNumber(String value) {
        this.pensionNumber = value;
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

}
