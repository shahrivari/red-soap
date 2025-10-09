
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponGetOrderDetailOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponGetOrderDetailOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDetailList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfSfaraCouponGetOrderDetailListResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponGetOrderDetailOutputParams", propOrder = {
    "orderDetailList"
})
public class SfaraCouponGetOrderDetailOutputParams {

    @XmlElement(name = "OrderDetailList", nillable = true)
    protected ArrayOfSfaraCouponGetOrderDetailListResult orderDetailList;

    /**
     * Gets the value of the orderDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfaraCouponGetOrderDetailListResult }
     *     
     */
    public ArrayOfSfaraCouponGetOrderDetailListResult getOrderDetailList() {
        return orderDetailList;
    }

    /**
     * Sets the value of the orderDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfaraCouponGetOrderDetailListResult }
     *     
     */
    public void setOrderDetailList(ArrayOfSfaraCouponGetOrderDetailListResult value) {
        this.orderDetailList = value;
    }

}
