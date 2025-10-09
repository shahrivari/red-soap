
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovSubventionInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovSubventionInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MyGovProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}MyGovProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="Payments" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfMyGovSubventionInquiryPayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovSubventionInquiryOutputParams", propOrder = {
    "accountNumber",
    "bankName",
    "fullName",
    "ibanNumber",
    "myGovProfileInfo",
    "payments"
})
public class MyGovSubventionInquiryOutputParams {

    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "BankName", nillable = true)
    protected String bankName;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "IbanNumber", nillable = true)
    protected String ibanNumber;
    @XmlElement(name = "MyGovProfileInfo", nillable = true)
    protected MyGovProfileInfo myGovProfileInfo;
    @XmlElement(name = "Payments", nillable = true)
    protected ArrayOfMyGovSubventionInquiryPayment payments;

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
     * Gets the value of the myGovProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public MyGovProfileInfo getMyGovProfileInfo() {
        return myGovProfileInfo;
    }

    /**
     * Sets the value of the myGovProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public void setMyGovProfileInfo(MyGovProfileInfo value) {
        this.myGovProfileInfo = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMyGovSubventionInquiryPayment }
     *     
     */
    public ArrayOfMyGovSubventionInquiryPayment getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMyGovSubventionInquiryPayment }
     *     
     */
    public void setPayments(ArrayOfMyGovSubventionInquiryPayment value) {
        this.payments = value;
    }

}
