
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
 *         &lt;element name="DoesBillAlreadyPaidResult" type="{http://schemas.datacontract.org/2004/07/Core}DoesBillAlreadyPaidOutput" minOccurs="0"/&gt;
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
    "doesBillAlreadyPaidResult"
})
@XmlRootElement(name = "DoesBillAlreadyPaidResponse", namespace = "http://tempuri.org/")
public class DoesBillAlreadyPaidResponse {

    @XmlElement(name = "DoesBillAlreadyPaidResult", namespace = "http://tempuri.org/", nillable = true)
    protected DoesBillAlreadyPaidOutput doesBillAlreadyPaidResult;

    /**
     * Gets the value of the doesBillAlreadyPaidResult property.
     * 
     * @return
     *     possible object is
     *     {@link DoesBillAlreadyPaidOutput }
     *     
     */
    public DoesBillAlreadyPaidOutput getDoesBillAlreadyPaidResult() {
        return doesBillAlreadyPaidResult;
    }

    /**
     * Sets the value of the doesBillAlreadyPaidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoesBillAlreadyPaidOutput }
     *     
     */
    public void setDoesBillAlreadyPaidResult(DoesBillAlreadyPaidOutput value) {
        this.doesBillAlreadyPaidResult = value;
    }

}
