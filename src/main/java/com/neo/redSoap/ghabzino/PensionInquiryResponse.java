
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
 *         &lt;element name="PensionInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}PensionInquiryOutput" minOccurs="0"/&gt;
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
    "pensionInquiryResult"
})
@XmlRootElement(name = "PensionInquiryResponse", namespace = "http://tempuri.org/")
public class PensionInquiryResponse {

    @XmlElement(name = "PensionInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected PensionInquiryOutput pensionInquiryResult;

    /**
     * Gets the value of the pensionInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link PensionInquiryOutput }
     *     
     */
    public PensionInquiryOutput getPensionInquiryResult() {
        return pensionInquiryResult;
    }

    /**
     * Sets the value of the pensionInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionInquiryOutput }
     *     
     */
    public void setPensionInquiryResult(PensionInquiryOutput value) {
        this.pensionInquiryResult = value;
    }

}
