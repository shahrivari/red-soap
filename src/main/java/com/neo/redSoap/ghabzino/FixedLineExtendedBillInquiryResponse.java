
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
 *         &lt;element name="FixedLineExtendedBillInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}FixedLineExtendedBillInquiryOutput" minOccurs="0"/&gt;
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
    "fixedLineExtendedBillInquiryResult"
})
@XmlRootElement(name = "FixedLineExtendedBillInquiryResponse", namespace = "http://tempuri.org/")
public class FixedLineExtendedBillInquiryResponse {

    @XmlElement(name = "FixedLineExtendedBillInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected FixedLineExtendedBillInquiryOutput fixedLineExtendedBillInquiryResult;

    /**
     * Gets the value of the fixedLineExtendedBillInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link FixedLineExtendedBillInquiryOutput }
     *     
     */
    public FixedLineExtendedBillInquiryOutput getFixedLineExtendedBillInquiryResult() {
        return fixedLineExtendedBillInquiryResult;
    }

    /**
     * Sets the value of the fixedLineExtendedBillInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedLineExtendedBillInquiryOutput }
     *     
     */
    public void setFixedLineExtendedBillInquiryResult(FixedLineExtendedBillInquiryOutput value) {
        this.fixedLineExtendedBillInquiryResult = value;
    }

}
