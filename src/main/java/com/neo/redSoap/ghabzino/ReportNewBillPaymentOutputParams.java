
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportNewBillPaymentOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportNewBillPaymentOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfReportNewPaymentBill" minOccurs="0"/&gt;
 *         &lt;element name="PaymentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportNewBillPaymentOutputParams", propOrder = {
    "bills",
    "paymentKey",
    "paymentLink"
})
public class ReportNewBillPaymentOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfReportNewPaymentBill bills;
    @XmlElement(name = "PaymentKey", nillable = true)
    protected String paymentKey;
    @XmlElement(name = "PaymentLink", nillable = true)
    protected String paymentLink;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportNewPaymentBill }
     *     
     */
    public ArrayOfReportNewPaymentBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportNewPaymentBill }
     *     
     */
    public void setBills(ArrayOfReportNewPaymentBill value) {
        this.bills = value;
    }

    /**
     * Gets the value of the paymentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentKey() {
        return paymentKey;
    }

    /**
     * Sets the value of the paymentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentKey(String value) {
        this.paymentKey = value;
    }

    /**
     * Gets the value of the paymentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentLink() {
        return paymentLink;
    }

    /**
     * Sets the value of the paymentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentLink(String value) {
        this.paymentLink = value;
    }

}
