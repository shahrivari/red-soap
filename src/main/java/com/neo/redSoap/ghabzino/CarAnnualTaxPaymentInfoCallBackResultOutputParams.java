
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTaxPaymentInfoCallBackResultOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTaxPaymentInfoCallBackResultOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BillStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentExtraInfo" type="{http://schemas.datacontract.org/2004/07/Core}CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLinkTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "CarAnnualTaxPaymentInfoCallBackResultOutputParams", propOrder = {
    "amount",
    "billStatusName",
    "billStatusShowName",
    "billUniqueID",
    "description",
    "fee",
    "gatewayName",
    "gatewayShowName",
    "paymentExtraInfo",
    "redirectLink",
    "redirectLinkTitle",
    "statusName",
    "statusShowName",
    "totalAmount",
    "uniqueKey"
})
public class CarAnnualTaxPaymentInfoCallBackResultOutputParams {

    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "BillStatusName", nillable = true)
    protected String billStatusName;
    @XmlElement(name = "BillStatusShowName", nillable = true)
    protected String billStatusShowName;
    @XmlElement(name = "BillUniqueID", nillable = true)
    protected String billUniqueID;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Fee")
    protected Long fee;
    @XmlElement(name = "GatewayName", nillable = true)
    protected String gatewayName;
    @XmlElement(name = "GatewayShowName", nillable = true)
    protected String gatewayShowName;
    @XmlElement(name = "PaymentExtraInfo", nillable = true)
    protected CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams paymentExtraInfo;
    @XmlElement(name = "RedirectLink", nillable = true)
    protected String redirectLink;
    @XmlElement(name = "RedirectLinkTitle", nillable = true)
    protected String redirectLinkTitle;
    @XmlElement(name = "StatusName", nillable = true)
    protected String statusName;
    @XmlElement(name = "StatusShowName", nillable = true)
    protected String statusShowName;
    @XmlElement(name = "TotalAmount")
    protected Long totalAmount;
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
     * Gets the value of the billStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillStatusName() {
        return billStatusName;
    }

    /**
     * Sets the value of the billStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillStatusName(String value) {
        this.billStatusName = value;
    }

    /**
     * Gets the value of the billStatusShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillStatusShowName() {
        return billStatusShowName;
    }

    /**
     * Sets the value of the billStatusShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillStatusShowName(String value) {
        this.billStatusShowName = value;
    }

    /**
     * Gets the value of the billUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillUniqueID() {
        return billUniqueID;
    }

    /**
     * Sets the value of the billUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillUniqueID(String value) {
        this.billUniqueID = value;
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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFee(Long value) {
        this.fee = value;
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
     * Gets the value of the paymentExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams }
     *     
     */
    public CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams getPaymentExtraInfo() {
        return paymentExtraInfo;
    }

    /**
     * Sets the value of the paymentExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams }
     *     
     */
    public void setPaymentExtraInfo(CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams value) {
        this.paymentExtraInfo = value;
    }

    /**
     * Gets the value of the redirectLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectLink() {
        return redirectLink;
    }

    /**
     * Sets the value of the redirectLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectLink(String value) {
        this.redirectLink = value;
    }

    /**
     * Gets the value of the redirectLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectLinkTitle() {
        return redirectLinkTitle;
    }

    /**
     * Sets the value of the redirectLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectLinkTitle(String value) {
        this.redirectLinkTitle = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the statusShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusShowName() {
        return statusShowName;
    }

    /**
     * Sets the value of the statusShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusShowName(String value) {
        this.statusShowName = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAmount(Long value) {
        this.totalAmount = value;
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
