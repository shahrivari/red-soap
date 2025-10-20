
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaminUnderCoveredInquiryDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaminUnderCoveredInquiryDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShenasnameSeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShenasnameSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaminUnderCoveredInquiryDetailResult", propOrder = {
    "fatherName",
    "firstName",
    "gender",
    "identificationNumber",
    "lastName",
    "nation",
    "nationalID",
    "relationDescription",
    "relationTypeDescription",
    "shenasnameSeri",
    "shenasnameSerial"
})
public class TaminUnderCoveredInquiryDetailResult {

    @XmlElement(name = "FatherName", nillable = true)
    protected String fatherName;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "Gender", nillable = true)
    protected String gender;
    @XmlElement(name = "IdentificationNumber", nillable = true)
    protected String identificationNumber;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "Nation", nillable = true)
    protected String nation;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "RelationDescription", nillable = true)
    protected String relationDescription;
    @XmlElement(name = "RelationTypeDescription", nillable = true)
    protected String relationTypeDescription;
    @XmlElement(name = "ShenasnameSeri", nillable = true)
    protected String shenasnameSeri;
    @XmlElement(name = "ShenasnameSerial", nillable = true)
    protected String shenasnameSerial;

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
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
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
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
     * Gets the value of the relationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationDescription() {
        return relationDescription;
    }

    /**
     * Sets the value of the relationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationDescription(String value) {
        this.relationDescription = value;
    }

    /**
     * Gets the value of the relationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationTypeDescription() {
        return relationTypeDescription;
    }

    /**
     * Sets the value of the relationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationTypeDescription(String value) {
        this.relationTypeDescription = value;
    }

    /**
     * Gets the value of the shenasnameSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasnameSeri() {
        return shenasnameSeri;
    }

    /**
     * Sets the value of the shenasnameSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasnameSeri(String value) {
        this.shenasnameSeri = value;
    }

    /**
     * Gets the value of the shenasnameSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasnameSerial() {
        return shenasnameSerial;
    }

    /**
     * Sets the value of the shenasnameSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasnameSerial(String value) {
        this.shenasnameSerial = value;
    }

}
