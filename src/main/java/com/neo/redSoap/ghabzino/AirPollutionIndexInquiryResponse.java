
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
 *         &lt;element name="AirPollutionIndexInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}AirPollutionIndexInquiryOutput" minOccurs="0"/&gt;
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
    "airPollutionIndexInquiryResult"
})
@XmlRootElement(name = "AirPollutionIndexInquiryResponse", namespace = "http://tempuri.org/")
public class AirPollutionIndexInquiryResponse {

    @XmlElement(name = "AirPollutionIndexInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected AirPollutionIndexInquiryOutput airPollutionIndexInquiryResult;

    /**
     * Gets the value of the airPollutionIndexInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirPollutionIndexInquiryOutput }
     *     
     */
    public AirPollutionIndexInquiryOutput getAirPollutionIndexInquiryResult() {
        return airPollutionIndexInquiryResult;
    }

    /**
     * Sets the value of the airPollutionIndexInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPollutionIndexInquiryOutput }
     *     
     */
    public void setAirPollutionIndexInquiryResult(AirPollutionIndexInquiryOutput value) {
        this.airPollutionIndexInquiryResult = value;
    }

}
