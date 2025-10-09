
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
 *         &lt;element name="GasBillHistoryInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}GasBillHistoryInquiryOutput" minOccurs="0"/&gt;
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
    "gasBillHistoryInquiryResult"
})
@XmlRootElement(name = "GasBillHistoryInquiryResponse", namespace = "http://tempuri.org/")
public class GasBillHistoryInquiryResponse {

    @XmlElement(name = "GasBillHistoryInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected GasBillHistoryInquiryOutput gasBillHistoryInquiryResult;

    /**
     * Gets the value of the gasBillHistoryInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GasBillHistoryInquiryOutput }
     *     
     */
    public GasBillHistoryInquiryOutput getGasBillHistoryInquiryResult() {
        return gasBillHistoryInquiryResult;
    }

    /**
     * Sets the value of the gasBillHistoryInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasBillHistoryInquiryOutput }
     *     
     */
    public void setGasBillHistoryInquiryResult(GasBillHistoryInquiryOutput value) {
        this.gasBillHistoryInquiryResult = value;
    }

}
