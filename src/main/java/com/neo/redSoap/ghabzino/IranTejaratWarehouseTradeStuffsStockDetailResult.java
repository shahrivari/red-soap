
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratWarehouseTradeStuffsStockDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratWarehouseTradeStuffsStockDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsBigCarTire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayehInfoID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScxfConversionRatio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StcHSCodeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffCustomType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StuffGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StuffID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffIdentityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPackCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="stcTireRing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratWarehouseTradeStuffsStockDetailResult", propOrder = {
    "actualInventory",
    "count",
    "isBigCarTire",
    "measurementUnit",
    "payehInfoID",
    "scxfConversionRatio",
    "stcHSCodeStr",
    "stuffCustomType",
    "stuffGroupID",
    "stuffID",
    "stuffIdentityCode",
    "stuffTitle",
    "subPackCount",
    "stcTireRing"
})
public class IranTejaratWarehouseTradeStuffsStockDetailResult {

    @XmlElement(name = "ActualInventory")
    protected Long actualInventory;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "IsBigCarTire")
    protected Boolean isBigCarTire;
    @XmlElement(name = "MeasurementUnit", nillable = true)
    protected String measurementUnit;
    @XmlElement(name = "PayehInfoID")
    protected Long payehInfoID;
    @XmlElement(name = "ScxfConversionRatio", nillable = true)
    protected Long scxfConversionRatio;
    @XmlElement(name = "StcHSCodeStr", nillable = true)
    protected String stcHSCodeStr;
    @XmlElement(name = "StuffCustomType")
    protected Long stuffCustomType;
    @XmlElement(name = "StuffGroupID")
    protected Long stuffGroupID;
    @XmlElement(name = "StuffID", nillable = true)
    protected String stuffID;
    @XmlElement(name = "StuffIdentityCode", nillable = true)
    protected String stuffIdentityCode;
    @XmlElement(name = "StuffTitle", nillable = true)
    protected String stuffTitle;
    @XmlElement(name = "SubPackCount")
    protected Long subPackCount;
    @XmlElement(nillable = true)
    protected String stcTireRing;

    /**
     * Gets the value of the actualInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualInventory() {
        return actualInventory;
    }

    /**
     * Sets the value of the actualInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualInventory(Long value) {
        this.actualInventory = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the isBigCarTire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBigCarTire() {
        return isBigCarTire;
    }

    /**
     * Sets the value of the isBigCarTire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBigCarTire(Boolean value) {
        this.isBigCarTire = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnit(String value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the payehInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayehInfoID() {
        return payehInfoID;
    }

    /**
     * Sets the value of the payehInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayehInfoID(Long value) {
        this.payehInfoID = value;
    }

    /**
     * Gets the value of the scxfConversionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScxfConversionRatio() {
        return scxfConversionRatio;
    }

    /**
     * Sets the value of the scxfConversionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScxfConversionRatio(Long value) {
        this.scxfConversionRatio = value;
    }

    /**
     * Gets the value of the stcHSCodeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStcHSCodeStr() {
        return stcHSCodeStr;
    }

    /**
     * Sets the value of the stcHSCodeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStcHSCodeStr(String value) {
        this.stcHSCodeStr = value;
    }

    /**
     * Gets the value of the stuffCustomType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStuffCustomType() {
        return stuffCustomType;
    }

    /**
     * Sets the value of the stuffCustomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStuffCustomType(Long value) {
        this.stuffCustomType = value;
    }

    /**
     * Gets the value of the stuffGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStuffGroupID() {
        return stuffGroupID;
    }

    /**
     * Sets the value of the stuffGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStuffGroupID(Long value) {
        this.stuffGroupID = value;
    }

    /**
     * Gets the value of the stuffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffID() {
        return stuffID;
    }

    /**
     * Sets the value of the stuffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffID(String value) {
        this.stuffID = value;
    }

    /**
     * Gets the value of the stuffIdentityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffIdentityCode() {
        return stuffIdentityCode;
    }

    /**
     * Sets the value of the stuffIdentityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffIdentityCode(String value) {
        this.stuffIdentityCode = value;
    }

    /**
     * Gets the value of the stuffTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffTitle() {
        return stuffTitle;
    }

    /**
     * Sets the value of the stuffTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffTitle(String value) {
        this.stuffTitle = value;
    }

    /**
     * Gets the value of the subPackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubPackCount() {
        return subPackCount;
    }

    /**
     * Sets the value of the subPackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubPackCount(Long value) {
        this.subPackCount = value;
    }

    /**
     * Gets the value of the stcTireRing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStcTireRing() {
        return stcTireRing;
    }

    /**
     * Sets the value of the stcTireRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStcTireRing(String value) {
        this.stcTireRing = value;
    }

}
