
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NajiServiceDrivingLicenseNegativePointInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceDrivingLicenseNegativePointInquiryOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "najiServiceDrivingLicenseNegativePointInquiryResult"
})
@XmlRootElement(name = "NajiServiceDrivingLicenseNegativePointInquiryResponse", namespace = "http://tempuri.org/")
public class NajiServiceDrivingLicenseNegativePointInquiryResponse {

    @XmlElement(name = "NajiServiceDrivingLicenseNegativePointInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected NajiServiceDrivingLicenseNegativePointInquiryOutput najiServiceDrivingLicenseNegativePointInquiryResult;

    /**
     * Gets the value of the najiServiceDrivingLicenseNegativePointInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceDrivingLicenseNegativePointInquiryOutput }
     *     
     */
    public NajiServiceDrivingLicenseNegativePointInquiryOutput getNajiServiceDrivingLicenseNegativePointInquiryResult() {
        return najiServiceDrivingLicenseNegativePointInquiryResult;
    }

    /**
     * Sets the value of the najiServiceDrivingLicenseNegativePointInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceDrivingLicenseNegativePointInquiryOutput }
     *     
     */
    public void setNajiServiceDrivingLicenseNegativePointInquiryResult(NajiServiceDrivingLicenseNegativePointInquiryOutput value) {
        this.najiServiceDrivingLicenseNegativePointInquiryResult = value;
    }

}
