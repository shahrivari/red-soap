
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpProductReserveOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpProductReserveOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://schemas.datacontract.org/2004/07/Core}TopUpProductInfo" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTopUpProductSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpProductReserveOutputParams", propOrder = {
    "amount",
    "mobileNumber",
    "product",
    "purchaseKey",
    "summary"
})
public class TopUpProductReserveOutputParams {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "MobileNumber", nillable = true)
    protected String mobileNumber;
    @XmlElement(name = "Product", nillable = true)
    protected TopUpProductInfo product;
    @XmlElement(name = "PurchaseKey", nillable = true)
    protected String purchaseKey;
    @XmlElement(name = "Summary", nillable = true)
    protected ArrayOfTopUpProductSummary summary;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpProductInfo }
     *     
     */
    public TopUpProductInfo getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpProductInfo }
     *     
     */
    public void setProduct(TopUpProductInfo value) {
        this.product = value;
    }

    /**
     * Gets the value of the purchaseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseKey() {
        return purchaseKey;
    }

    /**
     * Sets the value of the purchaseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseKey(String value) {
        this.purchaseKey = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopUpProductSummary }
     *     
     */
    public ArrayOfTopUpProductSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopUpProductSummary }
     *     
     */
    public void setSummary(ArrayOfTopUpProductSummary value) {
        this.summary = value;
    }

}
