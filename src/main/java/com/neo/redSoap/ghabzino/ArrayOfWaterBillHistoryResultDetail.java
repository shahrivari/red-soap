
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWaterBillHistoryResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWaterBillHistoryResultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WaterBillHistoryResultDetail" type="{http://schemas.datacontract.org/2004/07/Core}WaterBillHistoryResultDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWaterBillHistoryResultDetail", propOrder = {
    "waterBillHistoryResultDetail"
})
public class ArrayOfWaterBillHistoryResultDetail {

    @XmlElement(name = "WaterBillHistoryResultDetail", nillable = true)
    protected List<WaterBillHistoryResultDetail> waterBillHistoryResultDetail;

    /**
     * Gets the value of the waterBillHistoryResultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the waterBillHistoryResultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterBillHistoryResultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterBillHistoryResultDetail }
     * 
     * 
     */
    public List<WaterBillHistoryResultDetail> getWaterBillHistoryResultDetail() {
        if (waterBillHistoryResultDetail == null) {
            waterBillHistoryResultDetail = new ArrayList<WaterBillHistoryResultDetail>();
        }
        return this.waterBillHistoryResultDetail;
    }

}
