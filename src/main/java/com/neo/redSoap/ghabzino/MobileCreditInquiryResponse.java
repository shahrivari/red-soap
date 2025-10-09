
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
 *         &lt;element name="MobileCreditInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}MobileCreditInquiryOutput" minOccurs="0"/&gt;
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
    "mobileCreditInquiryResult"
})
@XmlRootElement(name = "MobileCreditInquiryResponse", namespace = "http://tempuri.org/")
public class MobileCreditInquiryResponse {

    @XmlElement(name = "MobileCreditInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected MobileCreditInquiryOutput mobileCreditInquiryResult;

    /**
     * Gets the value of the mobileCreditInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCreditInquiryOutput }
     *     
     */
    public MobileCreditInquiryOutput getMobileCreditInquiryResult() {
        return mobileCreditInquiryResult;
    }

    /**
     * Sets the value of the mobileCreditInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCreditInquiryOutput }
     *     
     */
    public void setMobileCreditInquiryResult(MobileCreditInquiryOutput value) {
        this.mobileCreditInquiryResult = value;
    }

}
