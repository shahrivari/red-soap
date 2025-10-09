
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityBillHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityBillHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BillHistoryList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfElectricityBillHistoryInquiryDetail" minOccurs="0"/&gt;
 *         &lt;element name="BillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityBillHistoryInquiryOutputParams", propOrder = {
    "address",
    "billCount",
    "billHistoryList",
    "billID",
    "customerType",
    "fullName",
    "subscriptionExtraInfo",
    "tariffType"
})
public class ElectricityBillHistoryInquiryOutputParams {

    @XmlElement(name = "Address", nillable = true)
    protected String address;
    @XmlElement(name = "BillCount")
    protected Long billCount;
    @XmlElement(name = "BillHistoryList", nillable = true)
    protected ArrayOfElectricityBillHistoryInquiryDetail billHistoryList;
    @XmlElement(name = "BillID", nillable = true)
    protected String billID;
    @XmlElement(name = "CustomerType", nillable = true)
    protected String customerType;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "SubscriptionExtraInfo", nillable = true)
    protected String subscriptionExtraInfo;
    @XmlElement(name = "TariffType", nillable = true)
    protected String tariffType;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the billCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillCount() {
        return billCount;
    }

    /**
     * Sets the value of the billCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillCount(Long value) {
        this.billCount = value;
    }

    /**
     * Gets the value of the billHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectricityBillHistoryInquiryDetail }
     *     
     */
    public ArrayOfElectricityBillHistoryInquiryDetail getBillHistoryList() {
        return billHistoryList;
    }

    /**
     * Sets the value of the billHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectricityBillHistoryInquiryDetail }
     *     
     */
    public void setBillHistoryList(ArrayOfElectricityBillHistoryInquiryDetail value) {
        this.billHistoryList = value;
    }

    /**
     * Gets the value of the billID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillID() {
        return billID;
    }

    /**
     * Sets the value of the billID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillID(String value) {
        this.billID = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
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
     * Gets the value of the subscriptionExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionExtraInfo() {
        return subscriptionExtraInfo;
    }

    /**
     * Sets the value of the subscriptionExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionExtraInfo(String value) {
        this.subscriptionExtraInfo = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
    }

}
