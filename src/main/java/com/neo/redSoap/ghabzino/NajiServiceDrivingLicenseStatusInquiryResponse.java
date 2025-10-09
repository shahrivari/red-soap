
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
 *         &lt;element name="NajiServiceDrivingLicenseStatusInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceDrivingLicensesStatusInquiryOutput" minOccurs="0"/&gt;
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
    "najiServiceDrivingLicenseStatusInquiryResult"
})
@XmlRootElement(name = "NajiServiceDrivingLicenseStatusInquiryResponse", namespace = "http://tempuri.org/")
public class NajiServiceDrivingLicenseStatusInquiryResponse {

    @XmlElement(name = "NajiServiceDrivingLicenseStatusInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected NajiServiceDrivingLicensesStatusInquiryOutput najiServiceDrivingLicenseStatusInquiryResult;

    /**
     * Gets the value of the najiServiceDrivingLicenseStatusInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceDrivingLicensesStatusInquiryOutput }
     *     
     */
    public NajiServiceDrivingLicensesStatusInquiryOutput getNajiServiceDrivingLicenseStatusInquiryResult() {
        return najiServiceDrivingLicenseStatusInquiryResult;
    }

    /**
     * Sets the value of the najiServiceDrivingLicenseStatusInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceDrivingLicensesStatusInquiryOutput }
     *     
     */
    public void setNajiServiceDrivingLicenseStatusInquiryResult(NajiServiceDrivingLicensesStatusInquiryOutput value) {
        this.najiServiceDrivingLicenseStatusInquiryResult = value;
    }

}
