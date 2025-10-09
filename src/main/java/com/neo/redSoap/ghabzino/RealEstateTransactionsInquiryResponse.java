
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
 *         &lt;element name="RealEstateTransactionsInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}RealEstateTransactionsInquiryOutput" minOccurs="0"/&gt;
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
    "realEstateTransactionsInquiryResult"
})
@XmlRootElement(name = "RealEstateTransactionsInquiryResponse", namespace = "http://tempuri.org/")
public class RealEstateTransactionsInquiryResponse {

    @XmlElement(name = "RealEstateTransactionsInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected RealEstateTransactionsInquiryOutput realEstateTransactionsInquiryResult;

    /**
     * Gets the value of the realEstateTransactionsInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateTransactionsInquiryOutput }
     *     
     */
    public RealEstateTransactionsInquiryOutput getRealEstateTransactionsInquiryResult() {
        return realEstateTransactionsInquiryResult;
    }

    /**
     * Sets the value of the realEstateTransactionsInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateTransactionsInquiryOutput }
     *     
     */
    public void setRealEstateTransactionsInquiryResult(RealEstateTransactionsInquiryOutput value) {
        this.realEstateTransactionsInquiryResult = value;
    }

}
