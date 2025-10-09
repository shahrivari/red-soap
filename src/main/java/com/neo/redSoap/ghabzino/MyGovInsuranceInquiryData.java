
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovInsuranceInquiryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovInsuranceInquiryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceTypeShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurerCompanyAgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurerCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueInsurancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovInsuranceInquiryData", propOrder = {
    "beginDate",
    "endDate",
    "insuranceTypeShowName",
    "insuredName",
    "insurerCompanyAgentCode",
    "insurerCompanyName",
    "isActive",
    "issueDate",
    "policyNumber",
    "uniqueInsurancePolicy"
})
public class MyGovInsuranceInquiryData {

    @XmlElement(name = "BeginDate", nillable = true)
    protected String beginDate;
    @XmlElement(name = "EndDate", nillable = true)
    protected String endDate;
    @XmlElement(name = "InsuranceTypeShowName", nillable = true)
    protected String insuranceTypeShowName;
    @XmlElement(name = "InsuredName", nillable = true)
    protected String insuredName;
    @XmlElement(name = "InsurerCompanyAgentCode", nillable = true)
    protected String insurerCompanyAgentCode;
    @XmlElement(name = "InsurerCompanyName", nillable = true)
    protected String insurerCompanyName;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IssueDate", nillable = true)
    protected String issueDate;
    @XmlElement(name = "PolicyNumber", nillable = true)
    protected String policyNumber;
    @XmlElement(name = "UniqueInsurancePolicy", nillable = true)
    protected String uniqueInsurancePolicy;

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the insuranceTypeShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceTypeShowName() {
        return insuranceTypeShowName;
    }

    /**
     * Sets the value of the insuranceTypeShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceTypeShowName(String value) {
        this.insuranceTypeShowName = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the insurerCompanyAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerCompanyAgentCode() {
        return insurerCompanyAgentCode;
    }

    /**
     * Sets the value of the insurerCompanyAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerCompanyAgentCode(String value) {
        this.insurerCompanyAgentCode = value;
    }

    /**
     * Gets the value of the insurerCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerCompanyName() {
        return insurerCompanyName;
    }

    /**
     * Sets the value of the insurerCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerCompanyName(String value) {
        this.insurerCompanyName = value;
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
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the uniqueInsurancePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueInsurancePolicy() {
        return uniqueInsurancePolicy;
    }

    /**
     * Sets the value of the uniqueInsurancePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueInsurancePolicy(String value) {
        this.uniqueInsurancePolicy = value;
    }

}
