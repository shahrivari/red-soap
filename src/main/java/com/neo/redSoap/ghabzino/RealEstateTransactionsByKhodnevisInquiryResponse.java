
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
 *         &lt;element name="RealEstateTransactionsByKhodnevisInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}RealEstateTransactionsByKhodnevisInquiryOutput" minOccurs="0"/&gt;
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
    "realEstateTransactionsByKhodnevisInquiryResult"
})
@XmlRootElement(name = "RealEstateTransactionsByKhodnevisInquiryResponse", namespace = "http://tempuri.org/")
public class RealEstateTransactionsByKhodnevisInquiryResponse {

    @XmlElement(name = "RealEstateTransactionsByKhodnevisInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected RealEstateTransactionsByKhodnevisInquiryOutput realEstateTransactionsByKhodnevisInquiryResult;

    /**
     * Gets the value of the realEstateTransactionsByKhodnevisInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateTransactionsByKhodnevisInquiryOutput }
     *     
     */
    public RealEstateTransactionsByKhodnevisInquiryOutput getRealEstateTransactionsByKhodnevisInquiryResult() {
        return realEstateTransactionsByKhodnevisInquiryResult;
    }

    /**
     * Sets the value of the realEstateTransactionsByKhodnevisInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateTransactionsByKhodnevisInquiryOutput }
     *     
     */
    public void setRealEstateTransactionsByKhodnevisInquiryResult(RealEstateTransactionsByKhodnevisInquiryOutput value) {
        this.realEstateTransactionsByKhodnevisInquiryResult = value;
    }

}
