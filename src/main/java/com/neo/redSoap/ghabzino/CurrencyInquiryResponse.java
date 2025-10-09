
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
 *         &lt;element name="CurrencyInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}CurrencyInquiryOutput" minOccurs="0"/&gt;
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
    "currencyInquiryResult"
})
@XmlRootElement(name = "CurrencyInquiryResponse", namespace = "http://tempuri.org/")
public class CurrencyInquiryResponse {

    @XmlElement(name = "CurrencyInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected CurrencyInquiryOutput currencyInquiryResult;

    /**
     * Gets the value of the currencyInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInquiryOutput }
     *     
     */
    public CurrencyInquiryOutput getCurrencyInquiryResult() {
        return currencyInquiryResult;
    }

    /**
     * Sets the value of the currencyInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInquiryOutput }
     *     
     */
    public void setCurrencyInquiryResult(CurrencyInquiryOutput value) {
        this.currencyInquiryResult = value;
    }

}
