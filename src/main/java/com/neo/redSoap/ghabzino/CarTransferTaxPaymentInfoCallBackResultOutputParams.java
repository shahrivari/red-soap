
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarTransferTaxPaymentInfoCallBackResultOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarTransferTaxPaymentInfoCallBackResultOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfCarTransferTaxPaymentInfoCallBackBill" minOccurs="0"/&gt;
 *         &lt;element name="GatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayTerminal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLinkTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarTransferTaxPaymentInfoCallBackResultOutputParams", propOrder = {
    "bills",
    "gatewayName",
    "gatewayShowName",
    "gatewayTerminal",
    "paymentStatusName",
    "paymentStatusShowName",
    "redirectLink",
    "redirectLinkTitle"
})
public class CarTransferTaxPaymentInfoCallBackResultOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfCarTransferTaxPaymentInfoCallBackBill bills;
    @XmlElement(name = "GatewayName", nillable = true)
    protected String gatewayName;
    @XmlElement(name = "GatewayShowName", nillable = true)
    protected String gatewayShowName;
    @XmlElement(name = "GatewayTerminal")
    protected Long gatewayTerminal;
    @XmlElement(name = "PaymentStatusName", nillable = true)
    protected String paymentStatusName;
    @XmlElement(name = "PaymentStatusShowName", nillable = true)
    protected String paymentStatusShowName;
    @XmlElement(name = "RedirectLink", nillable = true)
    protected String redirectLink;
    @XmlElement(name = "RedirectLinkTitle", nillable = true)
    protected String redirectLinkTitle;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarTransferTaxPaymentInfoCallBackBill }
     *     
     */
    public ArrayOfCarTransferTaxPaymentInfoCallBackBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarTransferTaxPaymentInfoCallBackBill }
     *     
     */
    public void setBills(ArrayOfCarTransferTaxPaymentInfoCallBackBill value) {
        this.bills = value;
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
     *     {@link Long }
     *     
     */
    public Long getGatewayTerminal() {
        return gatewayTerminal;
    }

    /**
     * Sets the value of the gatewayTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGatewayTerminal(Long value) {
        this.gatewayTerminal = value;
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

}
