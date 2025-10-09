
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovTelecomLinesInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovTelecomLinesInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TelecomLineDetails" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTelecomLineDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovTelecomLinesInquiryOutputParams", propOrder = {
    "telecomLineDetails"
})
public class MyGovTelecomLinesInquiryOutputParams {

    @XmlElement(name = "TelecomLineDetails", nillable = true)
    protected ArrayOfTelecomLineDetails telecomLineDetails;

    /**
     * Gets the value of the telecomLineDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTelecomLineDetails }
     *     
     */
    public ArrayOfTelecomLineDetails getTelecomLineDetails() {
        return telecomLineDetails;
    }

    /**
     * Sets the value of the telecomLineDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTelecomLineDetails }
     *     
     */
    public void setTelecomLineDetails(ArrayOfTelecomLineDetails value) {
        this.telecomLineDetails = value;
    }

}
