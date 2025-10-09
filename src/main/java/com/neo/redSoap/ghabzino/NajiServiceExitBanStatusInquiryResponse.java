
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
 *         &lt;element name="NajiServiceExitBanStatusInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceExitBanStatusInquiryOutput" minOccurs="0"/&gt;
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
    "najiServiceExitBanStatusInquiryResult"
})
@XmlRootElement(name = "NajiServiceExitBanStatusInquiryResponse", namespace = "http://tempuri.org/")
public class NajiServiceExitBanStatusInquiryResponse {

    @XmlElement(name = "NajiServiceExitBanStatusInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected NajiServiceExitBanStatusInquiryOutput najiServiceExitBanStatusInquiryResult;

    /**
     * Gets the value of the najiServiceExitBanStatusInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceExitBanStatusInquiryOutput }
     *     
     */
    public NajiServiceExitBanStatusInquiryOutput getNajiServiceExitBanStatusInquiryResult() {
        return najiServiceExitBanStatusInquiryResult;
    }

    /**
     * Sets the value of the najiServiceExitBanStatusInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceExitBanStatusInquiryOutput }
     *     
     */
    public void setNajiServiceExitBanStatusInquiryResult(NajiServiceExitBanStatusInquiryOutput value) {
        this.najiServiceExitBanStatusInquiryResult = value;
    }

}
