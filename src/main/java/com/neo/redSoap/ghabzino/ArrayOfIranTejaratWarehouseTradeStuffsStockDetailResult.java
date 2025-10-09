
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IranTejaratWarehouseTradeStuffsStockDetailResult" type="{http://schemas.datacontract.org/2004/07/Core}IranTejaratWarehouseTradeStuffsStockDetailResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult", propOrder = {
    "iranTejaratWarehouseTradeStuffsStockDetailResult"
})
public class ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult {

    @XmlElement(name = "IranTejaratWarehouseTradeStuffsStockDetailResult", nillable = true)
    protected List<IranTejaratWarehouseTradeStuffsStockDetailResult> iranTejaratWarehouseTradeStuffsStockDetailResult;

    /**
     * Gets the value of the iranTejaratWarehouseTradeStuffsStockDetailResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the iranTejaratWarehouseTradeStuffsStockDetailResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIranTejaratWarehouseTradeStuffsStockDetailResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IranTejaratWarehouseTradeStuffsStockDetailResult }
     * 
     * 
     */
    public List<IranTejaratWarehouseTradeStuffsStockDetailResult> getIranTejaratWarehouseTradeStuffsStockDetailResult() {
        if (iranTejaratWarehouseTradeStuffsStockDetailResult == null) {
            iranTejaratWarehouseTradeStuffsStockDetailResult = new ArrayList<IranTejaratWarehouseTradeStuffsStockDetailResult>();
        }
        return this.iranTejaratWarehouseTradeStuffsStockDetailResult;
    }

}
