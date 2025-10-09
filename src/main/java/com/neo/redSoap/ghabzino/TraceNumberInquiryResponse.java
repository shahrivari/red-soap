
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
 *         &lt;element name="TraceNumberInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}TraceNumberInquiryOutput" minOccurs="0"/&gt;
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
    "traceNumberInquiryResult"
})
@XmlRootElement(name = "TraceNumberInquiryResponse", namespace = "http://tempuri.org/")
public class TraceNumberInquiryResponse {

    @XmlElement(name = "TraceNumberInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected TraceNumberInquiryOutput traceNumberInquiryResult;

    /**
     * Gets the value of the traceNumberInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link TraceNumberInquiryOutput }
     *     
     */
    public TraceNumberInquiryOutput getTraceNumberInquiryResult() {
        return traceNumberInquiryResult;
    }

    /**
     * Sets the value of the traceNumberInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceNumberInquiryOutput }
     *     
     */
    public void setTraceNumberInquiryResult(TraceNumberInquiryOutput value) {
        this.traceNumberInquiryResult = value;
    }

}
