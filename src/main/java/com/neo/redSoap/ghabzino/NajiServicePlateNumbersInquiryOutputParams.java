
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServicePlateNumbersInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServicePlateNumbersInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlateNumbers" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfNajiServicePlateNumberInquiryDetailOutputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServicePlateNumbersInquiryOutputParams", propOrder = {
    "plateNumbers"
})
public class NajiServicePlateNumbersInquiryOutputParams {

    @XmlElement(name = "PlateNumbers", nillable = true)
    protected ArrayOfNajiServicePlateNumberInquiryDetailOutputParams plateNumbers;

    /**
     * Gets the value of the plateNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNajiServicePlateNumberInquiryDetailOutputParams }
     *     
     */
    public ArrayOfNajiServicePlateNumberInquiryDetailOutputParams getPlateNumbers() {
        return plateNumbers;
    }

    /**
     * Sets the value of the plateNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNajiServicePlateNumberInquiryDetailOutputParams }
     *     
     */
    public void setPlateNumbers(ArrayOfNajiServicePlateNumberInquiryDetailOutputParams value) {
        this.plateNumbers = value;
    }

}
