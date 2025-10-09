
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
 *         &lt;element name="TaminHistoryInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}TaminHistoryInquiryOutput" minOccurs="0"/&gt;
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
    "taminHistoryInquiryResult"
})
@XmlRootElement(name = "TaminHistoryInquiryResponse", namespace = "http://tempuri.org/")
public class TaminHistoryInquiryResponse {

    @XmlElement(name = "TaminHistoryInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected TaminHistoryInquiryOutput taminHistoryInquiryResult;

    /**
     * Gets the value of the taminHistoryInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaminHistoryInquiryOutput }
     *     
     */
    public TaminHistoryInquiryOutput getTaminHistoryInquiryResult() {
        return taminHistoryInquiryResult;
    }

    /**
     * Sets the value of the taminHistoryInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaminHistoryInquiryOutput }
     *     
     */
    public void setTaminHistoryInquiryResult(TaminHistoryInquiryOutput value) {
        this.taminHistoryInquiryResult = value;
    }

}
