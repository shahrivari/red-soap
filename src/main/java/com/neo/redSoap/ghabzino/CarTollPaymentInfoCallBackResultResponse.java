
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
 *         &lt;element name="CarTollPaymentInfoCallBackResultResult" type="{http://schemas.datacontract.org/2004/07/Core}CarTollPaymentInfoCallBackResultOutput" minOccurs="0"/&gt;
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
    "carTollPaymentInfoCallBackResultResult"
})
@XmlRootElement(name = "CarTollPaymentInfoCallBackResultResponse", namespace = "http://tempuri.org/")
public class CarTollPaymentInfoCallBackResultResponse {

    @XmlElement(name = "CarTollPaymentInfoCallBackResultResult", namespace = "http://tempuri.org/", nillable = true)
    protected CarTollPaymentInfoCallBackResultOutput carTollPaymentInfoCallBackResultResult;

    /**
     * Gets the value of the carTollPaymentInfoCallBackResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link CarTollPaymentInfoCallBackResultOutput }
     *     
     */
    public CarTollPaymentInfoCallBackResultOutput getCarTollPaymentInfoCallBackResultResult() {
        return carTollPaymentInfoCallBackResultResult;
    }

    /**
     * Sets the value of the carTollPaymentInfoCallBackResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTollPaymentInfoCallBackResultOutput }
     *     
     */
    public void setCarTollPaymentInfoCallBackResultResult(CarTollPaymentInfoCallBackResultOutput value) {
        this.carTollPaymentInfoCallBackResultResult = value;
    }

}
