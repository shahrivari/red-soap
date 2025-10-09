
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
 *         &lt;element name="MtnMobileBillInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}MtnMobileBillInquiryOutput" minOccurs="0"/&gt;
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
    "mtnMobileBillInquiryResult"
})
@XmlRootElement(name = "MtnMobileBillInquiryResponse", namespace = "http://tempuri.org/")
public class MtnMobileBillInquiryResponse {

    @XmlElement(name = "MtnMobileBillInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected MtnMobileBillInquiryOutput mtnMobileBillInquiryResult;

    /**
     * Gets the value of the mtnMobileBillInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MtnMobileBillInquiryOutput }
     *     
     */
    public MtnMobileBillInquiryOutput getMtnMobileBillInquiryResult() {
        return mtnMobileBillInquiryResult;
    }

    /**
     * Sets the value of the mtnMobileBillInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtnMobileBillInquiryOutput }
     *     
     */
    public void setMtnMobileBillInquiryResult(MtnMobileBillInquiryOutput value) {
        this.mtnMobileBillInquiryResult = value;
    }

}
