
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
 *         &lt;element name="BillPaymentInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}BillPaymentInquiryOutput" minOccurs="0"/&gt;
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
    "billPaymentInquiryResult"
})
@XmlRootElement(name = "BillPaymentInquiryResponse", namespace = "http://tempuri.org/")
public class BillPaymentInquiryResponse {

    @XmlElement(name = "BillPaymentInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected BillPaymentInquiryOutput billPaymentInquiryResult;

    /**
     * Gets the value of the billPaymentInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentInquiryOutput }
     *     
     */
    public BillPaymentInquiryOutput getBillPaymentInquiryResult() {
        return billPaymentInquiryResult;
    }

    /**
     * Sets the value of the billPaymentInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentInquiryOutput }
     *     
     */
    public void setBillPaymentInquiryResult(BillPaymentInquiryOutput value) {
        this.billPaymentInquiryResult = value;
    }

}
