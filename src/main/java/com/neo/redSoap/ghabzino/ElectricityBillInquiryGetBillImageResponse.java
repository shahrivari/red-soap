
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
 *         &lt;element name="ElectricityBillInquiryGetBillImageResult" type="{http://schemas.datacontract.org/2004/07/Core}ElectricityBillInquiryGetBillImageOutput" minOccurs="0"/&gt;
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
    "electricityBillInquiryGetBillImageResult"
})
@XmlRootElement(name = "ElectricityBillInquiryGetBillImageResponse", namespace = "http://tempuri.org/")
public class ElectricityBillInquiryGetBillImageResponse {

    @XmlElement(name = "ElectricityBillInquiryGetBillImageResult", namespace = "http://tempuri.org/", nillable = true)
    protected ElectricityBillInquiryGetBillImageOutput electricityBillInquiryGetBillImageResult;

    /**
     * Gets the value of the electricityBillInquiryGetBillImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityBillInquiryGetBillImageOutput }
     *     
     */
    public ElectricityBillInquiryGetBillImageOutput getElectricityBillInquiryGetBillImageResult() {
        return electricityBillInquiryGetBillImageResult;
    }

    /**
     * Sets the value of the electricityBillInquiryGetBillImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityBillInquiryGetBillImageOutput }
     *     
     */
    public void setElectricityBillInquiryGetBillImageResult(ElectricityBillInquiryGetBillImageOutput value) {
        this.electricityBillInquiryGetBillImageResult = value;
    }

}
