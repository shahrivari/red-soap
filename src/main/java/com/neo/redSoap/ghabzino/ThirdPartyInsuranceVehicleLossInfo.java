
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyInsuranceVehicleLossInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyInsuranceVehicleLossInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LossCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LossSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyInsuranceVehicleLossInfo", propOrder = {
    "lossCount",
    "lossSum"
})
public class ThirdPartyInsuranceVehicleLossInfo {

    @XmlElement(name = "LossCount", nillable = true)
    protected String lossCount;
    @XmlElement(name = "LossSum", nillable = true)
    protected String lossSum;

    /**
     * Gets the value of the lossCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossCount() {
        return lossCount;
    }

    /**
     * Sets the value of the lossCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossCount(String value) {
        this.lossCount = value;
    }

    /**
     * Gets the value of the lossSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossSum() {
        return lossSum;
    }

    /**
     * Sets the value of the lossSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossSum(String value) {
        this.lossSum = value;
    }

}
