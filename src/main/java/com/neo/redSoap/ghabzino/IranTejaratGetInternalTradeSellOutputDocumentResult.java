
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratGetInternalTradeSellOutputDocumentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratGetInternalTradeSellOutputDocumentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Exist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FinalPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsTrackingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherCharges" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellStatusId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StuffCategoryStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffCodeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StuffGroupStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TireStockListCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratGetInternalTradeSellOutputDocumentResult", propOrder = {
    "count",
    "description",
    "discount",
    "exist",
    "finalPrice",
    "id",
    "isTrackingRequired",
    "measurementUnit",
    "otherCharges",
    "price",
    "sellStatusId",
    "stuffCategoryStr",
    "stuffCodeStr",
    "stuffGroupID",
    "stuffGroupStr",
    "taxAmount",
    "tireStockListCount",
    "title"
})
public class IranTejaratGetInternalTradeSellOutputDocumentResult {

    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount")
    protected Long discount;
    @XmlElement(name = "Exist")
    protected Boolean exist;
    @XmlElement(name = "FinalPrice")
    protected Long finalPrice;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "IsTrackingRequired")
    protected Boolean isTrackingRequired;
    @XmlElement(name = "MeasurementUnit", nillable = true)
    protected String measurementUnit;
    @XmlElement(name = "OtherCharges")
    protected Long otherCharges;
    @XmlElement(name = "Price", nillable = true)
    protected String price;
    @XmlElement(name = "SellStatusId")
    protected Long sellStatusId;
    @XmlElement(name = "StuffCategoryStr", nillable = true)
    protected String stuffCategoryStr;
    @XmlElement(name = "StuffCodeStr", nillable = true)
    protected String stuffCodeStr;
    @XmlElement(name = "StuffGroupID")
    protected Long stuffGroupID;
    @XmlElement(name = "StuffGroupStr", nillable = true)
    protected String stuffGroupStr;
    @XmlElement(name = "TaxAmount")
    protected Long taxAmount;
    @XmlElement(name = "TireStockListCount")
    protected Long tireStockListCount;
    @XmlElement(name = "Title", nillable = true)
    protected String title;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscount(Long value) {
        this.discount = value;
    }

    /**
     * Gets the value of the exist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExist() {
        return exist;
    }

    /**
     * Sets the value of the exist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExist(Boolean value) {
        this.exist = value;
    }

    /**
     * Gets the value of the finalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinalPrice() {
        return finalPrice;
    }

    /**
     * Sets the value of the finalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinalPrice(Long value) {
        this.finalPrice = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isTrackingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrackingRequired() {
        return isTrackingRequired;
    }

    /**
     * Sets the value of the isTrackingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrackingRequired(Boolean value) {
        this.isTrackingRequired = value;
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
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherCharges(Long value) {
        this.otherCharges = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the sellStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellStatusId() {
        return sellStatusId;
    }

    /**
     * Sets the value of the sellStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellStatusId(Long value) {
        this.sellStatusId = value;
    }

    /**
     * Gets the value of the stuffCategoryStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffCategoryStr() {
        return stuffCategoryStr;
    }

    /**
     * Sets the value of the stuffCategoryStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffCategoryStr(String value) {
        this.stuffCategoryStr = value;
    }

    /**
     * Gets the value of the stuffCodeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffCodeStr() {
        return stuffCodeStr;
    }

    /**
     * Sets the value of the stuffCodeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffCodeStr(String value) {
        this.stuffCodeStr = value;
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
     * Gets the value of the stuffGroupStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffGroupStr() {
        return stuffGroupStr;
    }

    /**
     * Sets the value of the stuffGroupStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffGroupStr(String value) {
        this.stuffGroupStr = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the tireStockListCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTireStockListCount() {
        return tireStockListCount;
    }

    /**
     * Sets the value of the tireStockListCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTireStockListCount(Long value) {
        this.tireStockListCount = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
