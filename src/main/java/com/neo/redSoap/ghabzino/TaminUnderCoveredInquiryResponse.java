
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
 *         &lt;element name="TaminUnderCoveredInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}TaminUnderCoveredInquiryOutput" minOccurs="0"/&gt;
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
    "taminUnderCoveredInquiryResult"
})
@XmlRootElement(name = "TaminUnderCoveredInquiryResponse", namespace = "http://tempuri.org/")
public class TaminUnderCoveredInquiryResponse {

    @XmlElement(name = "TaminUnderCoveredInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected TaminUnderCoveredInquiryOutput taminUnderCoveredInquiryResult;

    /**
     * Gets the value of the taminUnderCoveredInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaminUnderCoveredInquiryOutput }
     *     
     */
    public TaminUnderCoveredInquiryOutput getTaminUnderCoveredInquiryResult() {
        return taminUnderCoveredInquiryResult;
    }

    /**
     * Sets the value of the taminUnderCoveredInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaminUnderCoveredInquiryOutput }
     *     
     */
    public void setTaminUnderCoveredInquiryResult(TaminUnderCoveredInquiryOutput value) {
        this.taminUnderCoveredInquiryResult = value;
    }

}
