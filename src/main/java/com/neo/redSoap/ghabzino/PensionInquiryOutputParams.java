
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PensionInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PensionDetailExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PensionExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PensionPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PensionInquiryOutputParams", propOrder = {
    "fatherName",
    "firstName",
    "lastName",
    "nationalID",
    "pensionDetailExtraInfo",
    "pensionExtraInfo",
    "pensionNumber",
    "pensionPdfUrl",
    "socialNumber",
    "userExtraInfo"
})
public class PensionInquiryOutputParams {

    @XmlElement(name = "FatherName", nillable = true)
    protected String fatherName;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "PensionDetailExtraInfo", nillable = true)
    protected String pensionDetailExtraInfo;
    @XmlElement(name = "PensionExtraInfo", nillable = true)
    protected String pensionExtraInfo;
    @XmlElement(name = "PensionNumber", nillable = true)
    protected String pensionNumber;
    @XmlElement(name = "PensionPdfUrl", nillable = true)
    protected String pensionPdfUrl;
    @XmlElement(name = "SocialNumber", nillable = true)
    protected String socialNumber;
    @XmlElement(name = "UserExtraInfo", nillable = true)
    protected String userExtraInfo;

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
     * Gets the value of the pensionDetailExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionDetailExtraInfo() {
        return pensionDetailExtraInfo;
    }

    /**
     * Sets the value of the pensionDetailExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionDetailExtraInfo(String value) {
        this.pensionDetailExtraInfo = value;
    }

    /**
     * Gets the value of the pensionExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionExtraInfo() {
        return pensionExtraInfo;
    }

    /**
     * Sets the value of the pensionExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionExtraInfo(String value) {
        this.pensionExtraInfo = value;
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
     * Gets the value of the pensionPdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionPdfUrl() {
        return pensionPdfUrl;
    }

    /**
     * Sets the value of the pensionPdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionPdfUrl(String value) {
        this.pensionPdfUrl = value;
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
     * Gets the value of the userExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserExtraInfo() {
        return userExtraInfo;
    }

    /**
     * Sets the value of the userExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserExtraInfo(String value) {
        this.userExtraInfo = value;
    }

}
