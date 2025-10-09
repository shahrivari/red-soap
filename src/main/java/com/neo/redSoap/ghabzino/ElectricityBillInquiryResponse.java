
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
 *         &lt;element name="ElectricityBillInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}ElectricityBillInquiryOutput" minOccurs="0"/&gt;
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
    "electricityBillInquiryResult"
})
@XmlRootElement(name = "ElectricityBillInquiryResponse", namespace = "http://tempuri.org/")
public class ElectricityBillInquiryResponse {

    @XmlElement(name = "ElectricityBillInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected ElectricityBillInquiryOutput electricityBillInquiryResult;

    /**
     * Gets the value of the electricityBillInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityBillInquiryOutput }
     *     
     */
    public ElectricityBillInquiryOutput getElectricityBillInquiryResult() {
        return electricityBillInquiryResult;
    }

    /**
     * Sets the value of the electricityBillInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityBillInquiryOutput }
     *     
     */
    public void setElectricityBillInquiryResult(ElectricityBillInquiryOutput value) {
        this.electricityBillInquiryResult = value;
    }

}
