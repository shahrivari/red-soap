
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWaterBillPaymentHistoryDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWaterBillPaymentHistoryDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WaterBillPaymentHistoryDetailList" type="{http://schemas.datacontract.org/2004/07/Core}WaterBillPaymentHistoryDetailList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWaterBillPaymentHistoryDetailList", propOrder = {
    "waterBillPaymentHistoryDetailList"
})
public class ArrayOfWaterBillPaymentHistoryDetailList {

    @XmlElement(name = "WaterBillPaymentHistoryDetailList", nillable = true)
    protected List<WaterBillPaymentHistoryDetailList> waterBillPaymentHistoryDetailList;

    /**
     * Gets the value of the waterBillPaymentHistoryDetailList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the waterBillPaymentHistoryDetailList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterBillPaymentHistoryDetailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterBillPaymentHistoryDetailList }
     * 
     * 
     */
    public List<WaterBillPaymentHistoryDetailList> getWaterBillPaymentHistoryDetailList() {
        if (waterBillPaymentHistoryDetailList == null) {
            waterBillPaymentHistoryDetailList = new ArrayList<WaterBillPaymentHistoryDetailList>();
        }
        return this.waterBillPaymentHistoryDetailList;
    }

}
