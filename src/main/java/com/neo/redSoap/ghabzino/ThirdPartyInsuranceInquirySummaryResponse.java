
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
 *         &lt;element name="ThirdPartyInsuranceInquirySummaryResult" type="{http://schemas.datacontract.org/2004/07/Core}ThirdPartyInsuranceInquirySummaryOutput" minOccurs="0"/&gt;
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
    "thirdPartyInsuranceInquirySummaryResult"
})
@XmlRootElement(name = "ThirdPartyInsuranceInquirySummaryResponse", namespace = "http://tempuri.org/")
public class ThirdPartyInsuranceInquirySummaryResponse {

    @XmlElement(name = "ThirdPartyInsuranceInquirySummaryResult", namespace = "http://tempuri.org/", nillable = true)
    protected ThirdPartyInsuranceInquirySummaryOutput thirdPartyInsuranceInquirySummaryResult;

    /**
     * Gets the value of the thirdPartyInsuranceInquirySummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInsuranceInquirySummaryOutput }
     *     
     */
    public ThirdPartyInsuranceInquirySummaryOutput getThirdPartyInsuranceInquirySummaryResult() {
        return thirdPartyInsuranceInquirySummaryResult;
    }

    /**
     * Sets the value of the thirdPartyInsuranceInquirySummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInsuranceInquirySummaryOutput }
     *     
     */
    public void setThirdPartyInsuranceInquirySummaryResult(ThirdPartyInsuranceInquirySummaryOutput value) {
        this.thirdPartyInsuranceInquirySummaryResult = value;
    }

}
