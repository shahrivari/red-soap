
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaminHistoryInquiryDetailOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaminHistoryInquiryDetailOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaysAndWage" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTaminHistoryDaysAndWage" minOccurs="0"/&gt;
 *         &lt;element name="HistoryRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistorySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkShopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkShopName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaminHistoryInquiryDetailOutputParams", propOrder = {
    "branchCode",
    "branchName",
    "daysAndWage",
    "historyRate",
    "historySDate",
    "historyStatus",
    "historyTypeCode",
    "historyTypeName",
    "id",
    "insuranceNumber",
    "month1",
    "month10",
    "month11",
    "month12",
    "month2",
    "month3",
    "month4",
    "month5",
    "month6",
    "month7",
    "month8",
    "month9",
    "workShopCode",
    "workShopName",
    "year"
})
public class TaminHistoryInquiryDetailOutputParams {

    @XmlElement(name = "BranchCode", nillable = true)
    protected String branchCode;
    @XmlElement(name = "BranchName", nillable = true)
    protected String branchName;
    @XmlElement(name = "DaysAndWage", nillable = true)
    protected ArrayOfTaminHistoryDaysAndWage daysAndWage;
    @XmlElement(name = "HistoryRate", nillable = true)
    protected String historyRate;
    @XmlElement(name = "HistorySDate", nillable = true)
    protected String historySDate;
    @XmlElement(name = "HistoryStatus", nillable = true)
    protected String historyStatus;
    @XmlElement(name = "HistoryTypeCode", nillable = true)
    protected String historyTypeCode;
    @XmlElement(name = "HistoryTypeName", nillable = true)
    protected String historyTypeName;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "InsuranceNumber", nillable = true)
    protected String insuranceNumber;
    @XmlElement(name = "Month1", nillable = true)
    protected String month1;
    @XmlElement(name = "Month10", nillable = true)
    protected String month10;
    @XmlElement(name = "Month11", nillable = true)
    protected String month11;
    @XmlElement(name = "Month12", nillable = true)
    protected String month12;
    @XmlElement(name = "Month2", nillable = true)
    protected String month2;
    @XmlElement(name = "Month3", nillable = true)
    protected String month3;
    @XmlElement(name = "Month4", nillable = true)
    protected String month4;
    @XmlElement(name = "Month5", nillable = true)
    protected String month5;
    @XmlElement(name = "Month6", nillable = true)
    protected String month6;
    @XmlElement(name = "Month7", nillable = true)
    protected String month7;
    @XmlElement(name = "Month8", nillable = true)
    protected String month8;
    @XmlElement(name = "Month9", nillable = true)
    protected String month9;
    @XmlElement(name = "WorkShopCode", nillable = true)
    protected String workShopCode;
    @XmlElement(name = "WorkShopName", nillable = true)
    protected String workShopName;
    @XmlElement(name = "Year", nillable = true)
    protected String year;

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
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the daysAndWage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaminHistoryDaysAndWage }
     *     
     */
    public ArrayOfTaminHistoryDaysAndWage getDaysAndWage() {
        return daysAndWage;
    }

    /**
     * Sets the value of the daysAndWage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaminHistoryDaysAndWage }
     *     
     */
    public void setDaysAndWage(ArrayOfTaminHistoryDaysAndWage value) {
        this.daysAndWage = value;
    }

    /**
     * Gets the value of the historyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryRate() {
        return historyRate;
    }

    /**
     * Sets the value of the historyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryRate(String value) {
        this.historyRate = value;
    }

    /**
     * Gets the value of the historySDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorySDate() {
        return historySDate;
    }

    /**
     * Sets the value of the historySDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorySDate(String value) {
        this.historySDate = value;
    }

    /**
     * Gets the value of the historyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryStatus() {
        return historyStatus;
    }

    /**
     * Sets the value of the historyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryStatus(String value) {
        this.historyStatus = value;
    }

    /**
     * Gets the value of the historyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryTypeCode() {
        return historyTypeCode;
    }

    /**
     * Sets the value of the historyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryTypeCode(String value) {
        this.historyTypeCode = value;
    }

    /**
     * Gets the value of the historyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryTypeName() {
        return historyTypeName;
    }

    /**
     * Sets the value of the historyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryTypeName(String value) {
        this.historyTypeName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
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
     * Gets the value of the month1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth1() {
        return month1;
    }

    /**
     * Sets the value of the month1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth1(String value) {
        this.month1 = value;
    }

    /**
     * Gets the value of the month10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth10() {
        return month10;
    }

    /**
     * Sets the value of the month10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth10(String value) {
        this.month10 = value;
    }

    /**
     * Gets the value of the month11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth11() {
        return month11;
    }

    /**
     * Sets the value of the month11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth11(String value) {
        this.month11 = value;
    }

    /**
     * Gets the value of the month12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth12() {
        return month12;
    }

    /**
     * Sets the value of the month12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth12(String value) {
        this.month12 = value;
    }

    /**
     * Gets the value of the month2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth2() {
        return month2;
    }

    /**
     * Sets the value of the month2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth2(String value) {
        this.month2 = value;
    }

    /**
     * Gets the value of the month3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth3() {
        return month3;
    }

    /**
     * Sets the value of the month3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth3(String value) {
        this.month3 = value;
    }

    /**
     * Gets the value of the month4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth4() {
        return month4;
    }

    /**
     * Sets the value of the month4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth4(String value) {
        this.month4 = value;
    }

    /**
     * Gets the value of the month5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth5() {
        return month5;
    }

    /**
     * Sets the value of the month5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth5(String value) {
        this.month5 = value;
    }

    /**
     * Gets the value of the month6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth6() {
        return month6;
    }

    /**
     * Sets the value of the month6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth6(String value) {
        this.month6 = value;
    }

    /**
     * Gets the value of the month7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth7() {
        return month7;
    }

    /**
     * Sets the value of the month7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth7(String value) {
        this.month7 = value;
    }

    /**
     * Gets the value of the month8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth8() {
        return month8;
    }

    /**
     * Sets the value of the month8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth8(String value) {
        this.month8 = value;
    }

    /**
     * Gets the value of the month9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth9() {
        return month9;
    }

    /**
     * Sets the value of the month9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth9(String value) {
        this.month9 = value;
    }

    /**
     * Gets the value of the workShopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkShopCode() {
        return workShopCode;
    }

    /**
     * Sets the value of the workShopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkShopCode(String value) {
        this.workShopCode = value;
    }

    /**
     * Gets the value of the workShopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkShopName() {
        return workShopName;
    }

    /**
     * Sets the value of the workShopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkShopName(String value) {
        this.workShopName = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
