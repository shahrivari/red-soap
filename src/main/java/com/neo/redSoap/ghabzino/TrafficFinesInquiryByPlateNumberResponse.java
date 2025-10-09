
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
 *         &lt;element name="TrafficFinesInquiryByPlateNumberResult" type="{http://schemas.datacontract.org/2004/07/Core}TrafficFinesInquiryByPlateNumberOutput" minOccurs="0"/&gt;
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
    "trafficFinesInquiryByPlateNumberResult"
})
@XmlRootElement(name = "TrafficFinesInquiryByPlateNumberResponse", namespace = "http://tempuri.org/")
public class TrafficFinesInquiryByPlateNumberResponse {

    @XmlElement(name = "TrafficFinesInquiryByPlateNumberResult", namespace = "http://tempuri.org/", nillable = true)
    protected TrafficFinesInquiryByPlateNumberOutput trafficFinesInquiryByPlateNumberResult;

    /**
     * Gets the value of the trafficFinesInquiryByPlateNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficFinesInquiryByPlateNumberOutput }
     *     
     */
    public TrafficFinesInquiryByPlateNumberOutput getTrafficFinesInquiryByPlateNumberResult() {
        return trafficFinesInquiryByPlateNumberResult;
    }

    /**
     * Sets the value of the trafficFinesInquiryByPlateNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficFinesInquiryByPlateNumberOutput }
     *     
     */
    public void setTrafficFinesInquiryByPlateNumberResult(TrafficFinesInquiryByPlateNumberOutput value) {
        this.trafficFinesInquiryByPlateNumberResult = value;
    }

}
