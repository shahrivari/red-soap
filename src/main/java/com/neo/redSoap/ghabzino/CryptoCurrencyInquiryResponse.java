
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
 *         &lt;element name="CryptoCurrencyInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}CryptoCurrencyInquiryOutput" minOccurs="0"/&gt;
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
    "cryptoCurrencyInquiryResult"
})
@XmlRootElement(name = "CryptoCurrencyInquiryResponse", namespace = "http://tempuri.org/")
public class CryptoCurrencyInquiryResponse {

    @XmlElement(name = "CryptoCurrencyInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected CryptoCurrencyInquiryOutput cryptoCurrencyInquiryResult;

    /**
     * Gets the value of the cryptoCurrencyInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoCurrencyInquiryOutput }
     *     
     */
    public CryptoCurrencyInquiryOutput getCryptoCurrencyInquiryResult() {
        return cryptoCurrencyInquiryResult;
    }

    /**
     * Sets the value of the cryptoCurrencyInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoCurrencyInquiryOutput }
     *     
     */
    public void setCryptoCurrencyInquiryResult(CryptoCurrencyInquiryOutput value) {
        this.cryptoCurrencyInquiryResult = value;
    }

}
