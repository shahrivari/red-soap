
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightelMobileBillInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightelMobileBillInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinalTerm" type="{http://schemas.datacontract.org/2004/07/Core}RightelMobileBillOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="MidTerm" type="{http://schemas.datacontract.org/2004/07/Core}RightelMobileBillOutputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightelMobileBillInquiryOutputParams", propOrder = {
    "finalTerm",
    "midTerm"
})
public class RightelMobileBillInquiryOutputParams {

    @XmlElement(name = "FinalTerm", nillable = true)
    protected RightelMobileBillOutputParams finalTerm;
    @XmlElement(name = "MidTerm", nillable = true)
    protected RightelMobileBillOutputParams midTerm;

    /**
     * Gets the value of the finalTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RightelMobileBillOutputParams }
     *     
     */
    public RightelMobileBillOutputParams getFinalTerm() {
        return finalTerm;
    }

    /**
     * Sets the value of the finalTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightelMobileBillOutputParams }
     *     
     */
    public void setFinalTerm(RightelMobileBillOutputParams value) {
        this.finalTerm = value;
    }

    /**
     * Gets the value of the midTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RightelMobileBillOutputParams }
     *     
     */
    public RightelMobileBillOutputParams getMidTerm() {
        return midTerm;
    }

    /**
     * Sets the value of the midTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightelMobileBillOutputParams }
     *     
     */
    public void setMidTerm(RightelMobileBillOutputParams value) {
        this.midTerm = value;
    }

}
