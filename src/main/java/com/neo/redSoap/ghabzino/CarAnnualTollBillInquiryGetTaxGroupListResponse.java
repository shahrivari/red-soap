
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
 *         &lt;element name="CarAnnualTollBillInquiryGetTaxGroupListResult" type="{http://schemas.datacontract.org/2004/07/Core}CarAnnualTollBillInquiryGetTaxGroupListOutput" minOccurs="0"/&gt;
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
    "carAnnualTollBillInquiryGetTaxGroupListResult"
})
@XmlRootElement(name = "CarAnnualTollBillInquiryGetTaxGroupListResponse", namespace = "http://tempuri.org/")
public class CarAnnualTollBillInquiryGetTaxGroupListResponse {

    @XmlElement(name = "CarAnnualTollBillInquiryGetTaxGroupListResult", namespace = "http://tempuri.org/", nillable = true)
    protected CarAnnualTollBillInquiryGetTaxGroupListOutput carAnnualTollBillInquiryGetTaxGroupListResult;

    /**
     * Gets the value of the carAnnualTollBillInquiryGetTaxGroupListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CarAnnualTollBillInquiryGetTaxGroupListOutput }
     *     
     */
    public CarAnnualTollBillInquiryGetTaxGroupListOutput getCarAnnualTollBillInquiryGetTaxGroupListResult() {
        return carAnnualTollBillInquiryGetTaxGroupListResult;
    }

    /**
     * Sets the value of the carAnnualTollBillInquiryGetTaxGroupListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarAnnualTollBillInquiryGetTaxGroupListOutput }
     *     
     */
    public void setCarAnnualTollBillInquiryGetTaxGroupListResult(CarAnnualTollBillInquiryGetTaxGroupListOutput value) {
        this.carAnnualTollBillInquiryGetTaxGroupListResult = value;
    }

}
