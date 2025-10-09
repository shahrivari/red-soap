
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
 *         &lt;element name="IpAddressInfoInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}IpAddressInfoInquiryOutput" minOccurs="0"/&gt;
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
    "ipAddressInfoInquiryResult"
})
@XmlRootElement(name = "IpAddressInfoInquiryResponse", namespace = "http://tempuri.org/")
public class IpAddressInfoInquiryResponse {

    @XmlElement(name = "IpAddressInfoInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected IpAddressInfoInquiryOutput ipAddressInfoInquiryResult;

    /**
     * Gets the value of the ipAddressInfoInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link IpAddressInfoInquiryOutput }
     *     
     */
    public IpAddressInfoInquiryOutput getIpAddressInfoInquiryResult() {
        return ipAddressInfoInquiryResult;
    }

    /**
     * Sets the value of the ipAddressInfoInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddressInfoInquiryOutput }
     *     
     */
    public void setIpAddressInfoInquiryResult(IpAddressInfoInquiryOutput value) {
        this.ipAddressInfoInquiryResult = value;
    }

}
