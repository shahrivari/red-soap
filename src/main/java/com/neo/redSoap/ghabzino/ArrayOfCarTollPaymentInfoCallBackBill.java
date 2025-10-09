
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCarTollPaymentInfoCallBackBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarTollPaymentInfoCallBackBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarTollPaymentInfoCallBackBill" type="{http://schemas.datacontract.org/2004/07/Core}CarTollPaymentInfoCallBackBill" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarTollPaymentInfoCallBackBill", propOrder = {
    "carTollPaymentInfoCallBackBill"
})
public class ArrayOfCarTollPaymentInfoCallBackBill {

    @XmlElement(name = "CarTollPaymentInfoCallBackBill", nillable = true)
    protected List<CarTollPaymentInfoCallBackBill> carTollPaymentInfoCallBackBill;

    /**
     * Gets the value of the carTollPaymentInfoCallBackBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carTollPaymentInfoCallBackBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarTollPaymentInfoCallBackBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarTollPaymentInfoCallBackBill }
     * 
     * 
     */
    public List<CarTollPaymentInfoCallBackBill> getCarTollPaymentInfoCallBackBill() {
        if (carTollPaymentInfoCallBackBill == null) {
            carTollPaymentInfoCallBackBill = new ArrayList<CarTollPaymentInfoCallBackBill>();
        }
        return this.carTollPaymentInfoCallBackBill;
    }

}
