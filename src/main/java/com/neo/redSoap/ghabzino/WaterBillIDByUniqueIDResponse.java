
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
 *         &lt;element name="WaterBillIDByUniqueIDResult" type="{http://schemas.datacontract.org/2004/07/Core}WaterBillIDByUniqueIDOutput" minOccurs="0"/&gt;
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
    "waterBillIDByUniqueIDResult"
})
@XmlRootElement(name = "WaterBillIDByUniqueIDResponse", namespace = "http://tempuri.org/")
public class WaterBillIDByUniqueIDResponse {

    @XmlElement(name = "WaterBillIDByUniqueIDResult", namespace = "http://tempuri.org/", nillable = true)
    protected WaterBillIDByUniqueIDOutput waterBillIDByUniqueIDResult;

    /**
     * Gets the value of the waterBillIDByUniqueIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link WaterBillIDByUniqueIDOutput }
     *     
     */
    public WaterBillIDByUniqueIDOutput getWaterBillIDByUniqueIDResult() {
        return waterBillIDByUniqueIDResult;
    }

    /**
     * Sets the value of the waterBillIDByUniqueIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterBillIDByUniqueIDOutput }
     *     
     */
    public void setWaterBillIDByUniqueIDResult(WaterBillIDByUniqueIDOutput value) {
        this.waterBillIDByUniqueIDResult = value;
    }

}
