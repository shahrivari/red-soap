
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
 *         &lt;element name="ElectricityBillInquiryGetPowerBillDataResult" type="{http://schemas.datacontract.org/2004/07/Core}ElectricityBillInquiryOutput" minOccurs="0"/&gt;
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
    "electricityBillInquiryGetPowerBillDataResult"
})
@XmlRootElement(name = "ElectricityBillInquiryGetPowerBillDataResponse", namespace = "http://tempuri.org/")
public class ElectricityBillInquiryGetPowerBillDataResponse {

    @XmlElement(name = "ElectricityBillInquiryGetPowerBillDataResult", namespace = "http://tempuri.org/", nillable = true)
    protected ElectricityBillInquiryOutput electricityBillInquiryGetPowerBillDataResult;

    /**
     * Gets the value of the electricityBillInquiryGetPowerBillDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityBillInquiryOutput }
     *     
     */
    public ElectricityBillInquiryOutput getElectricityBillInquiryGetPowerBillDataResult() {
        return electricityBillInquiryGetPowerBillDataResult;
    }

    /**
     * Sets the value of the electricityBillInquiryGetPowerBillDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityBillInquiryOutput }
     *     
     */
    public void setElectricityBillInquiryGetPowerBillDataResult(ElectricityBillInquiryOutput value) {
        this.electricityBillInquiryGetPowerBillDataResult = value;
    }

}
