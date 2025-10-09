
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovInsuranceInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovInsuranceInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuranceDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfMyGovInsuranceInquiryData" minOccurs="0"/&gt;
 *         &lt;element name="MyGovProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}MyGovProfileInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovInsuranceInquiryOutputParams", propOrder = {
    "insuranceDataList",
    "myGovProfileInfo"
})
public class MyGovInsuranceInquiryOutputParams {

    @XmlElement(name = "InsuranceDataList", nillable = true)
    protected ArrayOfMyGovInsuranceInquiryData insuranceDataList;
    @XmlElement(name = "MyGovProfileInfo", nillable = true)
    protected MyGovProfileInfo myGovProfileInfo;

    /**
     * Gets the value of the insuranceDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMyGovInsuranceInquiryData }
     *     
     */
    public ArrayOfMyGovInsuranceInquiryData getInsuranceDataList() {
        return insuranceDataList;
    }

    /**
     * Sets the value of the insuranceDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMyGovInsuranceInquiryData }
     *     
     */
    public void setInsuranceDataList(ArrayOfMyGovInsuranceInquiryData value) {
        this.insuranceDataList = value;
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

}
