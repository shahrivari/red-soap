
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratWarehouseTradeStuffsStockOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratWarehouseTradeStuffsStockOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarehouseTradeStuffsStockList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratWarehouseTradeStuffsStockOutputParams", propOrder = {
    "warehouseTradeStuffsStockList"
})
public class IranTejaratWarehouseTradeStuffsStockOutputParams {

    @XmlElement(name = "WarehouseTradeStuffsStockList", nillable = true)
    protected ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult warehouseTradeStuffsStockList;

    /**
     * Gets the value of the warehouseTradeStuffsStockList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult }
     *     
     */
    public ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult getWarehouseTradeStuffsStockList() {
        return warehouseTradeStuffsStockList;
    }

    /**
     * Sets the value of the warehouseTradeStuffsStockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult }
     *     
     */
    public void setWarehouseTradeStuffsStockList(ArrayOfIranTejaratWarehouseTradeStuffsStockDetailResult value) {
        this.warehouseTradeStuffsStockList = value;
    }

}
