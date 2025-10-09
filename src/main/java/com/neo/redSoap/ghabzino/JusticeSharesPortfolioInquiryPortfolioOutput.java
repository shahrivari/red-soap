
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JusticeSharesPortfolioInquiryPortfolioOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JusticeSharesPortfolioInquiryPortfolioOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssetCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AssetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetTotalValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AssetTradableState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetUnitTradeValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AssetUnitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JusticeSharesPortfolioInquiryPortfolioOutput", propOrder = {
    "assetCount",
    "assetName",
    "assetTotalValue",
    "assetTradableState",
    "assetUnitTradeValue",
    "assetUnitValue"
})
public class JusticeSharesPortfolioInquiryPortfolioOutput {

    @XmlElement(name = "AssetCount")
    protected Long assetCount;
    @XmlElement(name = "AssetName", nillable = true)
    protected String assetName;
    @XmlElement(name = "AssetTotalValue")
    protected Long assetTotalValue;
    @XmlElement(name = "AssetTradableState", nillable = true)
    protected String assetTradableState;
    @XmlElement(name = "AssetUnitTradeValue")
    protected Long assetUnitTradeValue;
    @XmlElement(name = "AssetUnitValue")
    protected Long assetUnitValue;

    /**
     * Gets the value of the assetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetCount() {
        return assetCount;
    }

    /**
     * Sets the value of the assetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetCount(Long value) {
        this.assetCount = value;
    }

    /**
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the assetTotalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetTotalValue() {
        return assetTotalValue;
    }

    /**
     * Sets the value of the assetTotalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetTotalValue(Long value) {
        this.assetTotalValue = value;
    }

    /**
     * Gets the value of the assetTradableState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetTradableState() {
        return assetTradableState;
    }

    /**
     * Sets the value of the assetTradableState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetTradableState(String value) {
        this.assetTradableState = value;
    }

    /**
     * Gets the value of the assetUnitTradeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetUnitTradeValue() {
        return assetUnitTradeValue;
    }

    /**
     * Sets the value of the assetUnitTradeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetUnitTradeValue(Long value) {
        this.assetUnitTradeValue = value;
    }

    /**
     * Gets the value of the assetUnitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetUnitValue() {
        return assetUnitValue;
    }

    /**
     * Sets the value of the assetUnitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetUnitValue(Long value) {
        this.assetUnitValue = value;
    }

}
