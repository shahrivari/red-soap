
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
 *         &lt;element name="GoldPriceInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}GoldPriceInquiryOutput" minOccurs="0"/&gt;
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
    "goldPriceInquiryResult"
})
@XmlRootElement(name = "GoldPriceInquiryResponse", namespace = "http://tempuri.org/")
public class GoldPriceInquiryResponse {

    @XmlElement(name = "GoldPriceInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected GoldPriceInquiryOutput goldPriceInquiryResult;

    /**
     * Gets the value of the goldPriceInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GoldPriceInquiryOutput }
     *     
     */
    public GoldPriceInquiryOutput getGoldPriceInquiryResult() {
        return goldPriceInquiryResult;
    }

    /**
     * Sets the value of the goldPriceInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoldPriceInquiryOutput }
     *     
     */
    public void setGoldPriceInquiryResult(GoldPriceInquiryOutput value) {
        this.goldPriceInquiryResult = value;
    }

}
