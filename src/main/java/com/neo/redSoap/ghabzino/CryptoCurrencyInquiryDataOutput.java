
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoCurrencyInquiryDataOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoCurrencyInquiryDataOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Change24H" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Change24HPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceRial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoCurrencyInquiryDataOutput", propOrder = {
    "change24H",
    "change24HPercent",
    "extraInfo",
    "icon",
    "lastUpdate",
    "name",
    "price",
    "priceRial",
    "showName",
    "symbol"
})
public class CryptoCurrencyInquiryDataOutput {

    @XmlElement(name = "Change24H", nillable = true)
    protected String change24H;
    @XmlElement(name = "Change24HPercent", nillable = true)
    protected String change24HPercent;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "Icon", nillable = true)
    protected String icon;
    @XmlElement(name = "LastUpdate", nillable = true)
    protected String lastUpdate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Price", nillable = true)
    protected String price;
    @XmlElement(name = "PriceRial", nillable = true)
    protected String priceRial;
    @XmlElement(name = "ShowName", nillable = true)
    protected String showName;
    @XmlElement(name = "Symbol", nillable = true)
    protected String symbol;

    /**
     * Gets the value of the change24H property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange24H() {
        return change24H;
    }

    /**
     * Sets the value of the change24H property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange24H(String value) {
        this.change24H = value;
    }

    /**
     * Gets the value of the change24HPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange24HPercent() {
        return change24HPercent;
    }

    /**
     * Sets the value of the change24HPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange24HPercent(String value) {
        this.change24HPercent = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the priceRial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRial() {
        return priceRial;
    }

    /**
     * Sets the value of the priceRial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRial(String value) {
        this.priceRial = value;
    }

    /**
     * Gets the value of the showName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowName() {
        return showName;
    }

    /**
     * Sets the value of the showName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowName(String value) {
        this.showName = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

}
