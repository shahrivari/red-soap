
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
 *         &lt;element name="NajiServiceDrivingLicenseValidateInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceDrivingLicenseValidateInquiryOutput" minOccurs="0"/&gt;
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
    "najiServiceDrivingLicenseValidateInquiryResult"
})
@XmlRootElement(name = "NajiServiceDrivingLicenseValidateInquiryResponse", namespace = "http://tempuri.org/")
public class NajiServiceDrivingLicenseValidateInquiryResponse {

    @XmlElement(name = "NajiServiceDrivingLicenseValidateInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected NajiServiceDrivingLicenseValidateInquiryOutput najiServiceDrivingLicenseValidateInquiryResult;

    /**
     * Gets the value of the najiServiceDrivingLicenseValidateInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceDrivingLicenseValidateInquiryOutput }
     *     
     */
    public NajiServiceDrivingLicenseValidateInquiryOutput getNajiServiceDrivingLicenseValidateInquiryResult() {
        return najiServiceDrivingLicenseValidateInquiryResult;
    }

    /**
     * Sets the value of the najiServiceDrivingLicenseValidateInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceDrivingLicenseValidateInquiryOutput }
     *     
     */
    public void setNajiServiceDrivingLicenseValidateInquiryResult(NajiServiceDrivingLicenseValidateInquiryOutput value) {
        this.najiServiceDrivingLicenseValidateInquiryResult = value;
    }

}
