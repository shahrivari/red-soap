
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceDrivingLicensesStatusInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceDrivingLicensesStatusInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Licenses" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceDrivingLicensesStatusInquiryOutputParams", propOrder = {
    "licenses"
})
public class NajiServiceDrivingLicensesStatusInquiryOutputParams {

    @XmlElement(name = "Licenses", nillable = true)
    protected ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams licenses;

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams }
     *     
     */
    public ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams }
     *     
     */
    public void setLicenses(ArrayOfNajiServiceDrivingLicenseStatusInquiryDetailOutputParams value) {
        this.licenses = value;
    }

}
