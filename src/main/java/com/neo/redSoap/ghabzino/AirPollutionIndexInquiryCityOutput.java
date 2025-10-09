
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirPollutionIndexInquiryCityOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPollutionIndexInquiryCityOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirPollutionIndexResultCurrent" type="{http://schemas.datacontract.org/2004/07/Core}AirPollutionIndexOutput" minOccurs="0"/&gt;
 *         &lt;element name="AirPollutionIndexResultLast24Hours" type="{http://schemas.datacontract.org/2004/07/Core}AirPollutionIndexOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPollutionIndexInquiryCityOutput", propOrder = {
    "airPollutionIndexResultCurrent",
    "airPollutionIndexResultLast24Hours"
})
public class AirPollutionIndexInquiryCityOutput {

    @XmlElement(name = "AirPollutionIndexResultCurrent", nillable = true)
    protected AirPollutionIndexOutput airPollutionIndexResultCurrent;
    @XmlElement(name = "AirPollutionIndexResultLast24Hours", nillable = true)
    protected AirPollutionIndexOutput airPollutionIndexResultLast24Hours;

    /**
     * Gets the value of the airPollutionIndexResultCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link AirPollutionIndexOutput }
     *     
     */
    public AirPollutionIndexOutput getAirPollutionIndexResultCurrent() {
        return airPollutionIndexResultCurrent;
    }

    /**
     * Sets the value of the airPollutionIndexResultCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPollutionIndexOutput }
     *     
     */
    public void setAirPollutionIndexResultCurrent(AirPollutionIndexOutput value) {
        this.airPollutionIndexResultCurrent = value;
    }

    /**
     * Gets the value of the airPollutionIndexResultLast24Hours property.
     * 
     * @return
     *     possible object is
     *     {@link AirPollutionIndexOutput }
     *     
     */
    public AirPollutionIndexOutput getAirPollutionIndexResultLast24Hours() {
        return airPollutionIndexResultLast24Hours;
    }

    /**
     * Sets the value of the airPollutionIndexResultLast24Hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPollutionIndexOutput }
     *     
     */
    public void setAirPollutionIndexResultLast24Hours(AirPollutionIndexOutput value) {
        this.airPollutionIndexResultLast24Hours = value;
    }

}
