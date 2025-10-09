
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
 *         &lt;element name="FreewayTollBillInquiryDetailedResult" type="{http://schemas.datacontract.org/2004/07/Core}FreewayTollBillInquiryDetailedOutput" minOccurs="0"/&gt;
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
    "freewayTollBillInquiryDetailedResult"
})
@XmlRootElement(name = "FreewayTollBillInquiryDetailedResponse", namespace = "http://tempuri.org/")
public class FreewayTollBillInquiryDetailedResponse {

    @XmlElement(name = "FreewayTollBillInquiryDetailedResult", namespace = "http://tempuri.org/", nillable = true)
    protected FreewayTollBillInquiryDetailedOutput freewayTollBillInquiryDetailedResult;

    /**
     * Gets the value of the freewayTollBillInquiryDetailedResult property.
     * 
     * @return
     *     possible object is
     *     {@link FreewayTollBillInquiryDetailedOutput }
     *     
     */
    public FreewayTollBillInquiryDetailedOutput getFreewayTollBillInquiryDetailedResult() {
        return freewayTollBillInquiryDetailedResult;
    }

    /**
     * Sets the value of the freewayTollBillInquiryDetailedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreewayTollBillInquiryDetailedOutput }
     *     
     */
    public void setFreewayTollBillInquiryDetailedResult(FreewayTollBillInquiryDetailedOutput value) {
        this.freewayTollBillInquiryDetailedResult = value;
    }

}
