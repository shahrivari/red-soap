
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpPaymentInfoCallBackResultOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpPaymentInfoCallBackResultOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://schemas.datacontract.org/2004/07/Core}TopUpPaymentInfoExtraInfo" minOccurs="0"/&gt;
 *         &lt;element name="GatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://schemas.datacontract.org/2004/07/Core}TopUpProductInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProductPurchaseStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductPurchaseStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectButtonLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectButtonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTopUpProductSummary" minOccurs="0"/&gt;
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpPaymentInfoCallBackResultOutputParams", propOrder = {
    "amount",
    "extraInfo",
    "gatewayName",
    "gatewayShowName",
    "gatewayTerminal",
    "mobileNumber",
    "paymentStatusName",
    "paymentStatusShowName",
    "product",
    "productPurchaseStatusName",
    "productPurchaseStatusShowName",
    "purchaseKey",
    "redirectButtonLink",
    "redirectButtonTitle",
    "summary",
    "typeName",
    "typeShowName",
    "uniqueKey"
})
public class TopUpPaymentInfoCallBackResultOutputParams {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected TopUpPaymentInfoExtraInfo extraInfo;
    @XmlElement(name = "GatewayName", nillable = true)
    protected String gatewayName;
    @XmlElement(name = "GatewayShowName", nillable = true)
    protected String gatewayShowName;
    @XmlElement(name = "GatewayTerminal", nillable = true)
    protected String gatewayTerminal;
    @XmlElement(name = "MobileNumber", nillable = true)
    protected String mobileNumber;
    @XmlElement(name = "PaymentStatusName", nillable = true)
    protected String paymentStatusName;
    @XmlElement(name = "PaymentStatusShowName", nillable = true)
    protected String paymentStatusShowName;
    @XmlElement(name = "Product", nillable = true)
    protected TopUpProductInfo product;
    @XmlElement(name = "ProductPurchaseStatusName", nillable = true)
    protected String productPurchaseStatusName;
    @XmlElement(name = "ProductPurchaseStatusShowName", nillable = true)
    protected String productPurchaseStatusShowName;
    @XmlElement(name = "PurchaseKey", nillable = true)
    protected String purchaseKey;
    @XmlElement(name = "RedirectButtonLink", nillable = true)
    protected String redirectButtonLink;
    @XmlElement(name = "RedirectButtonTitle", nillable = true)
    protected String redirectButtonTitle;
    @XmlElement(name = "Summary", nillable = true)
    protected ArrayOfTopUpProductSummary summary;
    @XmlElement(name = "TypeName", nillable = true)
    protected String typeName;
    @XmlElement(name = "TypeShowName", nillable = true)
    protected String typeShowName;
    @XmlElement(name = "UniqueKey", nillable = true)
    protected String uniqueKey;

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
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpPaymentInfoExtraInfo }
     *     
     */
    public TopUpPaymentInfoExtraInfo getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpPaymentInfoExtraInfo }
     *     
     */
    public void setExtraInfo(TopUpPaymentInfoExtraInfo value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the gatewayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * Sets the value of the gatewayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayName(String value) {
        this.gatewayName = value;
    }

    /**
     * Gets the value of the gatewayShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayShowName() {
        return gatewayShowName;
    }

    /**
     * Sets the value of the gatewayShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayShowName(String value) {
        this.gatewayShowName = value;
    }

    /**
     * Gets the value of the gatewayTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayTerminal() {
        return gatewayTerminal;
    }

    /**
     * Sets the value of the gatewayTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayTerminal(String value) {
        this.gatewayTerminal = value;
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
     * Gets the value of the paymentStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusName() {
        return paymentStatusName;
    }

    /**
     * Sets the value of the paymentStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusName(String value) {
        this.paymentStatusName = value;
    }

    /**
     * Gets the value of the paymentStatusShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusShowName() {
        return paymentStatusShowName;
    }

    /**
     * Sets the value of the paymentStatusShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusShowName(String value) {
        this.paymentStatusShowName = value;
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
     * Gets the value of the productPurchaseStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPurchaseStatusName() {
        return productPurchaseStatusName;
    }

    /**
     * Sets the value of the productPurchaseStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPurchaseStatusName(String value) {
        this.productPurchaseStatusName = value;
    }

    /**
     * Gets the value of the productPurchaseStatusShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPurchaseStatusShowName() {
        return productPurchaseStatusShowName;
    }

    /**
     * Sets the value of the productPurchaseStatusShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPurchaseStatusShowName(String value) {
        this.productPurchaseStatusShowName = value;
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
     * Gets the value of the redirectButtonLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectButtonLink() {
        return redirectButtonLink;
    }

    /**
     * Sets the value of the redirectButtonLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectButtonLink(String value) {
        this.redirectButtonLink = value;
    }

    /**
     * Gets the value of the redirectButtonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectButtonTitle() {
        return redirectButtonTitle;
    }

    /**
     * Sets the value of the redirectButtonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectButtonTitle(String value) {
        this.redirectButtonTitle = value;
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

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the typeShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeShowName() {
        return typeShowName;
    }

    /**
     * Sets the value of the typeShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeShowName(String value) {
        this.typeShowName = value;
    }

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

}
