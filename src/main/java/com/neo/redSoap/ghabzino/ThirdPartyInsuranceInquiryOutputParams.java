
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyInsuranceInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyInsuranceInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceAttachmentExtraInfoArray" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceAttachmentInfoArray" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfThirdPartyInsuranceAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceAttachmentInfoArrayTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceContractExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceContractInfo" type="{http://schemas.datacontract.org/2004/07/Core}ThirdPartyInsuranceContractInfo" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceVehicleExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceVehicleInfo" type="{http://schemas.datacontract.org/2004/07/Core}ThirdPartyInsuranceVehicleInfo" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceVehicleLossExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyInsuranceVehicleLossInfo" type="{http://schemas.datacontract.org/2004/07/Core}ThirdPartyInsuranceVehicleLossInfo" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyInsuranceInquiryOutputParams", propOrder = {
    "companyDocumentName",
    "companyName",
    "endDate",
    "engineNumber",
    "fullName",
    "issueDate",
    "pdfUrl",
    "plateNumber",
    "startDate",
    "thirdPartyInsuranceAttachmentExtraInfoArray",
    "thirdPartyInsuranceAttachmentInfoArray",
    "thirdPartyInsuranceAttachmentInfoArrayTotalCount",
    "thirdPartyInsuranceContractExtraInfo",
    "thirdPartyInsuranceContractInfo",
    "thirdPartyInsuranceVehicleExtraInfo",
    "thirdPartyInsuranceVehicleInfo",
    "thirdPartyInsuranceVehicleLossExtraInfo",
    "thirdPartyInsuranceVehicleLossInfo",
    "vehicleIdentificationNumber"
})
public class ThirdPartyInsuranceInquiryOutputParams {

    @XmlElement(name = "CompanyDocumentName", nillable = true)
    protected String companyDocumentName;
    @XmlElement(name = "CompanyName", nillable = true)
    protected String companyName;
    @XmlElement(name = "EndDate", nillable = true)
    protected String endDate;
    @XmlElement(name = "EngineNumber", nillable = true)
    protected String engineNumber;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "IssueDate", nillable = true)
    protected String issueDate;
    @XmlElement(name = "PdfUrl", nillable = true)
    protected String pdfUrl;
    @XmlElement(name = "PlateNumber", nillable = true)
    protected String plateNumber;
    @XmlElement(name = "StartDate", nillable = true)
    protected String startDate;
    @XmlElement(name = "ThirdPartyInsuranceAttachmentExtraInfoArray", nillable = true)
    protected ArrayOfstring thirdPartyInsuranceAttachmentExtraInfoArray;
    @XmlElement(name = "ThirdPartyInsuranceAttachmentInfoArray", nillable = true)
    protected ArrayOfThirdPartyInsuranceAttachmentInfo thirdPartyInsuranceAttachmentInfoArray;
    @XmlElement(name = "ThirdPartyInsuranceAttachmentInfoArrayTotalCount")
    protected Long thirdPartyInsuranceAttachmentInfoArrayTotalCount;
    @XmlElement(name = "ThirdPartyInsuranceContractExtraInfo", nillable = true)
    protected String thirdPartyInsuranceContractExtraInfo;
    @XmlElement(name = "ThirdPartyInsuranceContractInfo", nillable = true)
    protected ThirdPartyInsuranceContractInfo thirdPartyInsuranceContractInfo;
    @XmlElement(name = "ThirdPartyInsuranceVehicleExtraInfo", nillable = true)
    protected String thirdPartyInsuranceVehicleExtraInfo;
    @XmlElement(name = "ThirdPartyInsuranceVehicleInfo", nillable = true)
    protected ThirdPartyInsuranceVehicleInfo thirdPartyInsuranceVehicleInfo;
    @XmlElement(name = "ThirdPartyInsuranceVehicleLossExtraInfo", nillable = true)
    protected String thirdPartyInsuranceVehicleLossExtraInfo;
    @XmlElement(name = "ThirdPartyInsuranceVehicleLossInfo", nillable = true)
    protected ThirdPartyInsuranceVehicleLossInfo thirdPartyInsuranceVehicleLossInfo;
    @XmlElement(name = "VehicleIdentificationNumber", nillable = true)
    protected String vehicleIdentificationNumber;

    /**
     * Gets the value of the companyDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDocumentName() {
        return companyDocumentName;
    }

    /**
     * Sets the value of the companyDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDocumentName(String value) {
        this.companyDocumentName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
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
     * Gets the value of the pdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * Sets the value of the pdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfUrl(String value) {
        this.pdfUrl = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceAttachmentExtraInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getThirdPartyInsuranceAttachmentExtraInfoArray() {
        return thirdPartyInsuranceAttachmentExtraInfoArray;
    }

    /**
     * Sets the value of the thirdPartyInsuranceAttachmentExtraInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setThirdPartyInsuranceAttachmentExtraInfoArray(ArrayOfstring value) {
        this.thirdPartyInsuranceAttachmentExtraInfoArray = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceAttachmentInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThirdPartyInsuranceAttachmentInfo }
     *     
     */
    public ArrayOfThirdPartyInsuranceAttachmentInfo getThirdPartyInsuranceAttachmentInfoArray() {
        return thirdPartyInsuranceAttachmentInfoArray;
    }

    /**
     * Sets the value of the thirdPartyInsuranceAttachmentInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThirdPartyInsuranceAttachmentInfo }
     *     
     */
    public void setThirdPartyInsuranceAttachmentInfoArray(ArrayOfThirdPartyInsuranceAttachmentInfo value) {
        this.thirdPartyInsuranceAttachmentInfoArray = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceAttachmentInfoArrayTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdPartyInsuranceAttachmentInfoArrayTotalCount() {
        return thirdPartyInsuranceAttachmentInfoArrayTotalCount;
    }

    /**
     * Sets the value of the thirdPartyInsuranceAttachmentInfoArrayTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdPartyInsuranceAttachmentInfoArrayTotalCount(Long value) {
        this.thirdPartyInsuranceAttachmentInfoArrayTotalCount = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceContractExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyInsuranceContractExtraInfo() {
        return thirdPartyInsuranceContractExtraInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceContractExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyInsuranceContractExtraInfo(String value) {
        this.thirdPartyInsuranceContractExtraInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceContractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInsuranceContractInfo }
     *     
     */
    public ThirdPartyInsuranceContractInfo getThirdPartyInsuranceContractInfo() {
        return thirdPartyInsuranceContractInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceContractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInsuranceContractInfo }
     *     
     */
    public void setThirdPartyInsuranceContractInfo(ThirdPartyInsuranceContractInfo value) {
        this.thirdPartyInsuranceContractInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceVehicleExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyInsuranceVehicleExtraInfo() {
        return thirdPartyInsuranceVehicleExtraInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceVehicleExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyInsuranceVehicleExtraInfo(String value) {
        this.thirdPartyInsuranceVehicleExtraInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceVehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInsuranceVehicleInfo }
     *     
     */
    public ThirdPartyInsuranceVehicleInfo getThirdPartyInsuranceVehicleInfo() {
        return thirdPartyInsuranceVehicleInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceVehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInsuranceVehicleInfo }
     *     
     */
    public void setThirdPartyInsuranceVehicleInfo(ThirdPartyInsuranceVehicleInfo value) {
        this.thirdPartyInsuranceVehicleInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceVehicleLossExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyInsuranceVehicleLossExtraInfo() {
        return thirdPartyInsuranceVehicleLossExtraInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceVehicleLossExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyInsuranceVehicleLossExtraInfo(String value) {
        this.thirdPartyInsuranceVehicleLossExtraInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInsuranceVehicleLossInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInsuranceVehicleLossInfo }
     *     
     */
    public ThirdPartyInsuranceVehicleLossInfo getThirdPartyInsuranceVehicleLossInfo() {
        return thirdPartyInsuranceVehicleLossInfo;
    }

    /**
     * Sets the value of the thirdPartyInsuranceVehicleLossInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInsuranceVehicleLossInfo }
     *     
     */
    public void setThirdPartyInsuranceVehicleLossInfo(ThirdPartyInsuranceVehicleLossInfo value) {
        this.thirdPartyInsuranceVehicleLossInfo = value;
    }

    /**
     * Gets the value of the vehicleIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    /**
     * Sets the value of the vehicleIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentificationNumber(String value) {
        this.vehicleIdentificationNumber = value;
    }

}
