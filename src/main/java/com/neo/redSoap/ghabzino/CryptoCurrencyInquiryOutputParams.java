
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoCurrencyInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoCurrencyInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CryptoCurrencyInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfCryptoCurrencyInquiryDataOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoCurrencyInquiryOutputParams", propOrder = {
    "cryptoCurrencyInquiryDataList"
})
public class CryptoCurrencyInquiryOutputParams {

    @XmlElement(name = "CryptoCurrencyInquiryDataList", nillable = true)
    protected ArrayOfCryptoCurrencyInquiryDataOutput cryptoCurrencyInquiryDataList;

    /**
     * Gets the value of the cryptoCurrencyInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCryptoCurrencyInquiryDataOutput }
     *     
     */
    public ArrayOfCryptoCurrencyInquiryDataOutput getCryptoCurrencyInquiryDataList() {
        return cryptoCurrencyInquiryDataList;
    }

    /**
     * Sets the value of the cryptoCurrencyInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCryptoCurrencyInquiryDataOutput }
     *     
     */
    public void setCryptoCurrencyInquiryDataList(ArrayOfCryptoCurrencyInquiryDataOutput value) {
        this.cryptoCurrencyInquiryDataList = value;
    }

}
