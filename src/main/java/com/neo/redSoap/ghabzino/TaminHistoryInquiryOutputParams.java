
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaminHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaminHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllHistoryPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllHistoryWithWageAfter86PdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CombinedHistoryPdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTaminHistoryInquiryDetailOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratedHistoryAllDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratedHistoryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratedHistoryMonths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratedHistoryYears" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuePlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Last2YearsAverageWage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serial1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serial2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaminHistoryInquiryOutputParams", propOrder = {
    "allHistoryPdfUrl",
    "allHistoryWithWageAfter86PdfUrl",
    "birthDate",
    "branchCode",
    "combinedHistoryPdfUrl",
    "createDateTime",
    "details",
    "fatherName",
    "firstName",
    "identityNumber",
    "insuranceNumber",
    "integratedHistoryAllDays",
    "integratedHistoryDays",
    "integratedHistoryMonths",
    "integratedHistoryYears",
    "issuePlace",
    "issuePlaceName",
    "last2YearsAverageWage",
    "lastName",
    "nationalID",
    "serial1",
    "serial2",
    "state"
})
public class TaminHistoryInquiryOutputParams {

    @XmlElement(name = "AllHistoryPdfUrl", nillable = true)
    protected String allHistoryPdfUrl;
    @XmlElement(name = "AllHistoryWithWageAfter86PdfUrl", nillable = true)
    protected String allHistoryWithWageAfter86PdfUrl;
    @XmlElement(name = "BirthDate", nillable = true)
    protected String birthDate;
    @XmlElement(name = "BranchCode", nillable = true)
    protected String branchCode;
    @XmlElement(name = "CombinedHistoryPdfUrl", nillable = true)
    protected String combinedHistoryPdfUrl;
    @XmlElement(name = "CreateDateTime", nillable = true)
    protected String createDateTime;
    @XmlElement(name = "Details", nillable = true)
    protected ArrayOfTaminHistoryInquiryDetailOutputParams details;
    @XmlElement(name = "FatherName", nillable = true)
    protected String fatherName;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "IdentityNumber", nillable = true)
    protected String identityNumber;
    @XmlElement(name = "InsuranceNumber", nillable = true)
    protected String insuranceNumber;
    @XmlElement(name = "IntegratedHistoryAllDays", nillable = true)
    protected String integratedHistoryAllDays;
    @XmlElement(name = "IntegratedHistoryDays", nillable = true)
    protected String integratedHistoryDays;
    @XmlElement(name = "IntegratedHistoryMonths", nillable = true)
    protected String integratedHistoryMonths;
    @XmlElement(name = "IntegratedHistoryYears", nillable = true)
    protected String integratedHistoryYears;
    @XmlElement(name = "IssuePlace", nillable = true)
    protected String issuePlace;
    @XmlElement(name = "IssuePlaceName", nillable = true)
    protected String issuePlaceName;
    @XmlElement(name = "Last2YearsAverageWage", nillable = true)
    protected String last2YearsAverageWage;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "Serial1", nillable = true)
    protected String serial1;
    @XmlElement(name = "Serial2", nillable = true)
    protected String serial2;
    @XmlElement(name = "State", nillable = true)
    protected String state;

    /**
     * Gets the value of the allHistoryPdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllHistoryPdfUrl() {
        return allHistoryPdfUrl;
    }

    /**
     * Sets the value of the allHistoryPdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllHistoryPdfUrl(String value) {
        this.allHistoryPdfUrl = value;
    }

    /**
     * Gets the value of the allHistoryWithWageAfter86PdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllHistoryWithWageAfter86PdfUrl() {
        return allHistoryWithWageAfter86PdfUrl;
    }

    /**
     * Sets the value of the allHistoryWithWageAfter86PdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllHistoryWithWageAfter86PdfUrl(String value) {
        this.allHistoryWithWageAfter86PdfUrl = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the combinedHistoryPdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedHistoryPdfUrl() {
        return combinedHistoryPdfUrl;
    }

    /**
     * Sets the value of the combinedHistoryPdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedHistoryPdfUrl(String value) {
        this.combinedHistoryPdfUrl = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateTime(String value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaminHistoryInquiryDetailOutputParams }
     *     
     */
    public ArrayOfTaminHistoryInquiryDetailOutputParams getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaminHistoryInquiryDetailOutputParams }
     *     
     */
    public void setDetails(ArrayOfTaminHistoryInquiryDetailOutputParams value) {
        this.details = value;
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
     * Gets the value of the identityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the insuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Sets the value of the insuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceNumber(String value) {
        this.insuranceNumber = value;
    }

    /**
     * Gets the value of the integratedHistoryAllDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratedHistoryAllDays() {
        return integratedHistoryAllDays;
    }

    /**
     * Sets the value of the integratedHistoryAllDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratedHistoryAllDays(String value) {
        this.integratedHistoryAllDays = value;
    }

    /**
     * Gets the value of the integratedHistoryDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratedHistoryDays() {
        return integratedHistoryDays;
    }

    /**
     * Sets the value of the integratedHistoryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratedHistoryDays(String value) {
        this.integratedHistoryDays = value;
    }

    /**
     * Gets the value of the integratedHistoryMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratedHistoryMonths() {
        return integratedHistoryMonths;
    }

    /**
     * Sets the value of the integratedHistoryMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratedHistoryMonths(String value) {
        this.integratedHistoryMonths = value;
    }

    /**
     * Gets the value of the integratedHistoryYears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratedHistoryYears() {
        return integratedHistoryYears;
    }

    /**
     * Sets the value of the integratedHistoryYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratedHistoryYears(String value) {
        this.integratedHistoryYears = value;
    }

    /**
     * Gets the value of the issuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePlace() {
        return issuePlace;
    }

    /**
     * Sets the value of the issuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePlace(String value) {
        this.issuePlace = value;
    }

    /**
     * Gets the value of the issuePlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePlaceName() {
        return issuePlaceName;
    }

    /**
     * Sets the value of the issuePlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePlaceName(String value) {
        this.issuePlaceName = value;
    }

    /**
     * Gets the value of the last2YearsAverageWage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast2YearsAverageWage() {
        return last2YearsAverageWage;
    }

    /**
     * Sets the value of the last2YearsAverageWage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast2YearsAverageWage(String value) {
        this.last2YearsAverageWage = value;
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
     * Gets the value of the serial1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial1() {
        return serial1;
    }

    /**
     * Sets the value of the serial1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial1(String value) {
        this.serial1 = value;
    }

    /**
     * Gets the value of the serial2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial2() {
        return serial2;
    }

    /**
     * Sets the value of the serial2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial2(String value) {
        this.serial2 = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
