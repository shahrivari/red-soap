
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
 *         &lt;element name="PensionReceiptInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}PensionReceiptInquiryOutput" minOccurs="0"/&gt;
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
    "pensionReceiptInquiryResult"
})
@XmlRootElement(name = "PensionReceiptInquiryResponse", namespace = "http://tempuri.org/")
public class PensionReceiptInquiryResponse {

    @XmlElement(name = "PensionReceiptInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected PensionReceiptInquiryOutput pensionReceiptInquiryResult;

    /**
     * Gets the value of the pensionReceiptInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link PensionReceiptInquiryOutput }
     *     
     */
    public PensionReceiptInquiryOutput getPensionReceiptInquiryResult() {
        return pensionReceiptInquiryResult;
    }

    /**
     * Sets the value of the pensionReceiptInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionReceiptInquiryOutput }
     *     
     */
    public void setPensionReceiptInquiryResult(PensionReceiptInquiryOutput value) {
        this.pensionReceiptInquiryResult = value;
    }

}
