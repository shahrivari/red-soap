
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirPollutionIndexInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPollutionIndexInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirPollutionIndexByCityList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfAirPollutionIndexInquiryCityOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPollutionIndexInquiryOutputParams", propOrder = {
    "airPollutionIndexByCityList"
})
public class AirPollutionIndexInquiryOutputParams {

    @XmlElement(name = "AirPollutionIndexByCityList", nillable = true)
    protected ArrayOfAirPollutionIndexInquiryCityOutput airPollutionIndexByCityList;

    /**
     * Gets the value of the airPollutionIndexByCityList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirPollutionIndexInquiryCityOutput }
     *     
     */
    public ArrayOfAirPollutionIndexInquiryCityOutput getAirPollutionIndexByCityList() {
        return airPollutionIndexByCityList;
    }

    /**
     * Sets the value of the airPollutionIndexByCityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirPollutionIndexInquiryCityOutput }
     *     
     */
    public void setAirPollutionIndexByCityList(ArrayOfAirPollutionIndexInquiryCityOutput value) {
        this.airPollutionIndexByCityList = value;
    }

}
