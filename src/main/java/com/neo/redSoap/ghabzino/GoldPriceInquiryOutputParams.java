
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoldPriceInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoldPriceInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashCoinPriceInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfGoldPriceInquiryDataOutput" minOccurs="0"/&gt;
 *         &lt;element name="GoldPriceInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfGoldPriceInquiryDataOutput" minOccurs="0"/&gt;
 *         &lt;element name="RetailCoinInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfGoldPriceInquiryDataOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoldPriceInquiryOutputParams", propOrder = {
    "cashCoinPriceInquiryDataList",
    "goldPriceInquiryDataList",
    "retailCoinInquiryDataList"
})
public class GoldPriceInquiryOutputParams {

    @XmlElement(name = "CashCoinPriceInquiryDataList", nillable = true)
    protected ArrayOfGoldPriceInquiryDataOutput cashCoinPriceInquiryDataList;
    @XmlElement(name = "GoldPriceInquiryDataList", nillable = true)
    protected ArrayOfGoldPriceInquiryDataOutput goldPriceInquiryDataList;
    @XmlElement(name = "RetailCoinInquiryDataList", nillable = true)
    protected ArrayOfGoldPriceInquiryDataOutput retailCoinInquiryDataList;

    /**
     * Gets the value of the cashCoinPriceInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public ArrayOfGoldPriceInquiryDataOutput getCashCoinPriceInquiryDataList() {
        return cashCoinPriceInquiryDataList;
    }

    /**
     * Sets the value of the cashCoinPriceInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public void setCashCoinPriceInquiryDataList(ArrayOfGoldPriceInquiryDataOutput value) {
        this.cashCoinPriceInquiryDataList = value;
    }

    /**
     * Gets the value of the goldPriceInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public ArrayOfGoldPriceInquiryDataOutput getGoldPriceInquiryDataList() {
        return goldPriceInquiryDataList;
    }

    /**
     * Sets the value of the goldPriceInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public void setGoldPriceInquiryDataList(ArrayOfGoldPriceInquiryDataOutput value) {
        this.goldPriceInquiryDataList = value;
    }

    /**
     * Gets the value of the retailCoinInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public ArrayOfGoldPriceInquiryDataOutput getRetailCoinInquiryDataList() {
        return retailCoinInquiryDataList;
    }

    /**
     * Sets the value of the retailCoinInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoldPriceInquiryDataOutput }
     *     
     */
    public void setRetailCoinInquiryDataList(ArrayOfGoldPriceInquiryDataOutput value) {
        this.retailCoinInquiryDataList = value;
    }

}
