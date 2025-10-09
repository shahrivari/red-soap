
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfCurrencyInquiryDataOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInquiryOutputParams", propOrder = {
    "currencyInquiryDataList"
})
public class CurrencyInquiryOutputParams {

    @XmlElement(name = "CurrencyInquiryDataList", nillable = true)
    protected ArrayOfCurrencyInquiryDataOutput currencyInquiryDataList;

    /**
     * Gets the value of the currencyInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyInquiryDataOutput }
     *     
     */
    public ArrayOfCurrencyInquiryDataOutput getCurrencyInquiryDataList() {
        return currencyInquiryDataList;
    }

    /**
     * Sets the value of the currencyInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyInquiryDataOutput }
     *     
     */
    public void setCurrencyInquiryDataList(ArrayOfCurrencyInquiryDataOutput value) {
        this.currencyInquiryDataList = value;
    }

}
