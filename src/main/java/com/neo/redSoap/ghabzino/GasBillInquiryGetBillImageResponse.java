
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
 *         &lt;element name="GasBillInquiryGetBillImageResult" type="{http://schemas.datacontract.org/2004/07/Core}GasBillInquiryGetBillImageOutput" minOccurs="0"/&gt;
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
    "gasBillInquiryGetBillImageResult"
})
@XmlRootElement(name = "GasBillInquiryGetBillImageResponse", namespace = "http://tempuri.org/")
public class GasBillInquiryGetBillImageResponse {

    @XmlElement(name = "GasBillInquiryGetBillImageResult", namespace = "http://tempuri.org/", nillable = true)
    protected GasBillInquiryGetBillImageOutput gasBillInquiryGetBillImageResult;

    /**
     * Gets the value of the gasBillInquiryGetBillImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link GasBillInquiryGetBillImageOutput }
     *     
     */
    public GasBillInquiryGetBillImageOutput getGasBillInquiryGetBillImageResult() {
        return gasBillInquiryGetBillImageResult;
    }

    /**
     * Sets the value of the gasBillInquiryGetBillImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasBillInquiryGetBillImageOutput }
     *     
     */
    public void setGasBillInquiryGetBillImageResult(GasBillInquiryGetBillImageOutput value) {
        this.gasBillInquiryGetBillImageResult = value;
    }

}
