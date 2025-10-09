
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
 *         &lt;element name="TrafficFinesInquiryByPlateNumberSummaryResult" type="{http://schemas.datacontract.org/2004/07/Core}TrafficFinesInquiryByPlateNumberSummaryOutput" minOccurs="0"/&gt;
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
    "trafficFinesInquiryByPlateNumberSummaryResult"
})
@XmlRootElement(name = "TrafficFinesInquiryByPlateNumberSummaryResponse", namespace = "http://tempuri.org/")
public class TrafficFinesInquiryByPlateNumberSummaryResponse {

    @XmlElement(name = "TrafficFinesInquiryByPlateNumberSummaryResult", namespace = "http://tempuri.org/", nillable = true)
    protected TrafficFinesInquiryByPlateNumberSummaryOutput trafficFinesInquiryByPlateNumberSummaryResult;

    /**
     * Gets the value of the trafficFinesInquiryByPlateNumberSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficFinesInquiryByPlateNumberSummaryOutput }
     *     
     */
    public TrafficFinesInquiryByPlateNumberSummaryOutput getTrafficFinesInquiryByPlateNumberSummaryResult() {
        return trafficFinesInquiryByPlateNumberSummaryResult;
    }

    /**
     * Sets the value of the trafficFinesInquiryByPlateNumberSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficFinesInquiryByPlateNumberSummaryOutput }
     *     
     */
    public void setTrafficFinesInquiryByPlateNumberSummaryResult(TrafficFinesInquiryByPlateNumberSummaryOutput value) {
        this.trafficFinesInquiryByPlateNumberSummaryResult = value;
    }

}
