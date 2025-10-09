
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
 *         &lt;element name="ElectronicPrescriptionDetailInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}ElectronicPrescriptionDetailInquiryOutput" minOccurs="0"/&gt;
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
    "electronicPrescriptionDetailInquiryResult"
})
@XmlRootElement(name = "ElectronicPrescriptionDetailInquiryResponse", namespace = "http://tempuri.org/")
public class ElectronicPrescriptionDetailInquiryResponse {

    @XmlElement(name = "ElectronicPrescriptionDetailInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected ElectronicPrescriptionDetailInquiryOutput electronicPrescriptionDetailInquiryResult;

    /**
     * Gets the value of the electronicPrescriptionDetailInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicPrescriptionDetailInquiryOutput }
     *     
     */
    public ElectronicPrescriptionDetailInquiryOutput getElectronicPrescriptionDetailInquiryResult() {
        return electronicPrescriptionDetailInquiryResult;
    }

    /**
     * Sets the value of the electronicPrescriptionDetailInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicPrescriptionDetailInquiryOutput }
     *     
     */
    public void setElectronicPrescriptionDetailInquiryResult(ElectronicPrescriptionDetailInquiryOutput value) {
        this.electronicPrescriptionDetailInquiryResult = value;
    }

}
