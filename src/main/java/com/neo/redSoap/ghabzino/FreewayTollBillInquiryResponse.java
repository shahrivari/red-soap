
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
 *         &lt;element name="FreewayTollBillInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}FreewayTollBillInquiryOutput" minOccurs="0"/&gt;
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
    "freewayTollBillInquiryResult"
})
@XmlRootElement(name = "FreewayTollBillInquiryResponse", namespace = "http://tempuri.org/")
public class FreewayTollBillInquiryResponse {

    @XmlElement(name = "FreewayTollBillInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected FreewayTollBillInquiryOutput freewayTollBillInquiryResult;

    /**
     * Gets the value of the freewayTollBillInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link FreewayTollBillInquiryOutput }
     *     
     */
    public FreewayTollBillInquiryOutput getFreewayTollBillInquiryResult() {
        return freewayTollBillInquiryResult;
    }

    /**
     * Sets the value of the freewayTollBillInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreewayTollBillInquiryOutput }
     *     
     */
    public void setFreewayTollBillInquiryResult(FreewayTollBillInquiryOutput value) {
        this.freewayTollBillInquiryResult = value;
    }

}
