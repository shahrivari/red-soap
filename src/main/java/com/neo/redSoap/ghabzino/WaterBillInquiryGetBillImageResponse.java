
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
 *         &lt;element name="WaterBillInquiryGetBillImageResult" type="{http://schemas.datacontract.org/2004/07/Core}WaterBillInquiryGetBillImageOutput" minOccurs="0"/&gt;
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
    "waterBillInquiryGetBillImageResult"
})
@XmlRootElement(name = "WaterBillInquiryGetBillImageResponse", namespace = "http://tempuri.org/")
public class WaterBillInquiryGetBillImageResponse {

    @XmlElement(name = "WaterBillInquiryGetBillImageResult", namespace = "http://tempuri.org/", nillable = true)
    protected WaterBillInquiryGetBillImageOutput waterBillInquiryGetBillImageResult;

    /**
     * Gets the value of the waterBillInquiryGetBillImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link WaterBillInquiryGetBillImageOutput }
     *     
     */
    public WaterBillInquiryGetBillImageOutput getWaterBillInquiryGetBillImageResult() {
        return waterBillInquiryGetBillImageResult;
    }

    /**
     * Sets the value of the waterBillInquiryGetBillImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterBillInquiryGetBillImageOutput }
     *     
     */
    public void setWaterBillInquiryGetBillImageResult(WaterBillInquiryGetBillImageOutput value) {
        this.waterBillInquiryGetBillImageResult = value;
    }

}
