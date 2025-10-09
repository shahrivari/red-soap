
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
 *         &lt;element name="SfaraCouponInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponInquiryOutput" minOccurs="0"/&gt;
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
    "sfaraCouponInquiryResult"
})
@XmlRootElement(name = "SfaraCouponInquiryResponse", namespace = "http://tempuri.org/")
public class SfaraCouponInquiryResponse {

    @XmlElement(name = "SfaraCouponInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected SfaraCouponInquiryOutput sfaraCouponInquiryResult;

    /**
     * Gets the value of the sfaraCouponInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link SfaraCouponInquiryOutput }
     *     
     */
    public SfaraCouponInquiryOutput getSfaraCouponInquiryResult() {
        return sfaraCouponInquiryResult;
    }

    /**
     * Sets the value of the sfaraCouponInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfaraCouponInquiryOutput }
     *     
     */
    public void setSfaraCouponInquiryResult(SfaraCouponInquiryOutput value) {
        this.sfaraCouponInquiryResult = value;
    }

}
