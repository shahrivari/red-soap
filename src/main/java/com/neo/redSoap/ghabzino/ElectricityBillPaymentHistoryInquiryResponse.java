
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
 *         &lt;element name="ElectricityBillPaymentHistoryInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}ElectricityBillPaymentHistoryInquiryOutput" minOccurs="0"/&gt;
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
    "electricityBillPaymentHistoryInquiryResult"
})
@XmlRootElement(name = "ElectricityBillPaymentHistoryInquiryResponse", namespace = "http://tempuri.org/")
public class ElectricityBillPaymentHistoryInquiryResponse {

    @XmlElement(name = "ElectricityBillPaymentHistoryInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected ElectricityBillPaymentHistoryInquiryOutput electricityBillPaymentHistoryInquiryResult;

    /**
     * Gets the value of the electricityBillPaymentHistoryInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityBillPaymentHistoryInquiryOutput }
     *     
     */
    public ElectricityBillPaymentHistoryInquiryOutput getElectricityBillPaymentHistoryInquiryResult() {
        return electricityBillPaymentHistoryInquiryResult;
    }

    /**
     * Sets the value of the electricityBillPaymentHistoryInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityBillPaymentHistoryInquiryOutput }
     *     
     */
    public void setElectricityBillPaymentHistoryInquiryResult(ElectricityBillPaymentHistoryInquiryOutput value) {
        this.electricityBillPaymentHistoryInquiryResult = value;
    }

}
