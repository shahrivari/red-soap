
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
 *         &lt;element name="SfaraCouponGetOrderDetailResult" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponGetOrderDetailOutput" minOccurs="0"/&gt;
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
    "sfaraCouponGetOrderDetailResult"
})
@XmlRootElement(name = "SfaraCouponGetOrderDetailResponse", namespace = "http://tempuri.org/")
public class SfaraCouponGetOrderDetailResponse {

    @XmlElement(name = "SfaraCouponGetOrderDetailResult", namespace = "http://tempuri.org/", nillable = true)
    protected SfaraCouponGetOrderDetailOutput sfaraCouponGetOrderDetailResult;

    /**
     * Gets the value of the sfaraCouponGetOrderDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SfaraCouponGetOrderDetailOutput }
     *     
     */
    public SfaraCouponGetOrderDetailOutput getSfaraCouponGetOrderDetailResult() {
        return sfaraCouponGetOrderDetailResult;
    }

    /**
     * Sets the value of the sfaraCouponGetOrderDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfaraCouponGetOrderDetailOutput }
     *     
     */
    public void setSfaraCouponGetOrderDetailResult(SfaraCouponGetOrderDetailOutput value) {
        this.sfaraCouponGetOrderDetailResult = value;
    }

}
