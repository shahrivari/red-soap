
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeleKishMobileBillInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeleKishMobileBillInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinalTerm" type="{http://schemas.datacontract.org/2004/07/Core}TeleKishMobileBillOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="MidTerm" type="{http://schemas.datacontract.org/2004/07/Core}TeleKishMobileBillOutputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeleKishMobileBillInquiryOutputParams", propOrder = {
    "finalTerm",
    "midTerm"
})
public class TeleKishMobileBillInquiryOutputParams {

    @XmlElement(name = "FinalTerm", nillable = true)
    protected TeleKishMobileBillOutputParams finalTerm;
    @XmlElement(name = "MidTerm", nillable = true)
    protected TeleKishMobileBillOutputParams midTerm;

    /**
     * Gets the value of the finalTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TeleKishMobileBillOutputParams }
     *     
     */
    public TeleKishMobileBillOutputParams getFinalTerm() {
        return finalTerm;
    }

    /**
     * Sets the value of the finalTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleKishMobileBillOutputParams }
     *     
     */
    public void setFinalTerm(TeleKishMobileBillOutputParams value) {
        this.finalTerm = value;
    }

    /**
     * Gets the value of the midTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TeleKishMobileBillOutputParams }
     *     
     */
    public TeleKishMobileBillOutputParams getMidTerm() {
        return midTerm;
    }

    /**
     * Sets the value of the midTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleKishMobileBillOutputParams }
     *     
     */
    public void setMidTerm(TeleKishMobileBillOutputParams value) {
        this.midTerm = value;
    }

}
