
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSfaraCouponGetOrderDetailListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSfaraCouponGetOrderDetailListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SfaraCouponGetOrderDetailListResult" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponGetOrderDetailListResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSfaraCouponGetOrderDetailListResult", propOrder = {
    "sfaraCouponGetOrderDetailListResult"
})
public class ArrayOfSfaraCouponGetOrderDetailListResult {

    @XmlElement(name = "SfaraCouponGetOrderDetailListResult", nillable = true)
    protected List<SfaraCouponGetOrderDetailListResult> sfaraCouponGetOrderDetailListResult;

    /**
     * Gets the value of the sfaraCouponGetOrderDetailListResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sfaraCouponGetOrderDetailListResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfaraCouponGetOrderDetailListResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SfaraCouponGetOrderDetailListResult }
     * 
     * 
     */
    public List<SfaraCouponGetOrderDetailListResult> getSfaraCouponGetOrderDetailListResult() {
        if (sfaraCouponGetOrderDetailListResult == null) {
            sfaraCouponGetOrderDetailListResult = new ArrayList<SfaraCouponGetOrderDetailListResult>();
        }
        return this.sfaraCouponGetOrderDetailListResult;
    }

}
