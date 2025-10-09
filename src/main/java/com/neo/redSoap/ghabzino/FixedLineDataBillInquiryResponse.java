
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
 *         &lt;element name="FixedLineDataBillInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}FixedLineDataBillInquiryOutput" minOccurs="0"/&gt;
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
    "fixedLineDataBillInquiryResult"
})
@XmlRootElement(name = "FixedLineDataBillInquiryResponse", namespace = "http://tempuri.org/")
public class FixedLineDataBillInquiryResponse {

    @XmlElement(name = "FixedLineDataBillInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected FixedLineDataBillInquiryOutput fixedLineDataBillInquiryResult;

    /**
     * Gets the value of the fixedLineDataBillInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link FixedLineDataBillInquiryOutput }
     *     
     */
    public FixedLineDataBillInquiryOutput getFixedLineDataBillInquiryResult() {
        return fixedLineDataBillInquiryResult;
    }

    /**
     * Sets the value of the fixedLineDataBillInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedLineDataBillInquiryOutput }
     *     
     */
    public void setFixedLineDataBillInquiryResult(FixedLineDataBillInquiryOutput value) {
        this.fixedLineDataBillInquiryResult = value;
    }

}
