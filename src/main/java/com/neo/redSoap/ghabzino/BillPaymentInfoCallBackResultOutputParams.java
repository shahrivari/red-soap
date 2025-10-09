
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPaymentInfoCallBackResultOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentInfoCallBackResultOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfBillPaymentInfoCallBackBill" minOccurs="0"/&gt;
 *         &lt;element name="FailedBillsAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FailedBillsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectLinkTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfulBillsAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfulBillsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalBillsAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalBillsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentInfoCallBackResultOutputParams", propOrder = {
    "bills",
    "failedBillsAmount",
    "failedBillsCount",
    "redirectLink",
    "redirectLinkTitle",
    "successfulBillsAmount",
    "successfulBillsCount",
    "totalBillsAmount",
    "totalBillsCount"
})
public class BillPaymentInfoCallBackResultOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfBillPaymentInfoCallBackBill bills;
    @XmlElement(name = "FailedBillsAmount")
    protected Long failedBillsAmount;
    @XmlElement(name = "FailedBillsCount")
    protected Long failedBillsCount;
    @XmlElement(name = "RedirectLink", nillable = true)
    protected String redirectLink;
    @XmlElement(name = "RedirectLinkTitle", nillable = true)
    protected String redirectLinkTitle;
    @XmlElement(name = "SuccessfulBillsAmount")
    protected Long successfulBillsAmount;
    @XmlElement(name = "SuccessfulBillsCount")
    protected Long successfulBillsCount;
    @XmlElement(name = "TotalBillsAmount")
    protected Long totalBillsAmount;
    @XmlElement(name = "TotalBillsCount")
    protected Long totalBillsCount;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillPaymentInfoCallBackBill }
     *     
     */
    public ArrayOfBillPaymentInfoCallBackBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillPaymentInfoCallBackBill }
     *     
     */
    public void setBills(ArrayOfBillPaymentInfoCallBackBill value) {
        this.bills = value;
    }

    /**
     * Gets the value of the failedBillsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedBillsAmount() {
        return failedBillsAmount;
    }

    /**
     * Sets the value of the failedBillsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedBillsAmount(Long value) {
        this.failedBillsAmount = value;
    }

    /**
     * Gets the value of the failedBillsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedBillsCount() {
        return failedBillsCount;
    }

    /**
     * Sets the value of the failedBillsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedBillsCount(Long value) {
        this.failedBillsCount = value;
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
     * Gets the value of the successfulBillsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuccessfulBillsAmount() {
        return successfulBillsAmount;
    }

    /**
     * Sets the value of the successfulBillsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuccessfulBillsAmount(Long value) {
        this.successfulBillsAmount = value;
    }

    /**
     * Gets the value of the successfulBillsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuccessfulBillsCount() {
        return successfulBillsCount;
    }

    /**
     * Sets the value of the successfulBillsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuccessfulBillsCount(Long value) {
        this.successfulBillsCount = value;
    }

    /**
     * Gets the value of the totalBillsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalBillsAmount() {
        return totalBillsAmount;
    }

    /**
     * Sets the value of the totalBillsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalBillsAmount(Long value) {
        this.totalBillsAmount = value;
    }

    /**
     * Gets the value of the totalBillsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalBillsCount() {
        return totalBillsCount;
    }

    /**
     * Sets the value of the totalBillsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalBillsCount(Long value) {
        this.totalBillsCount = value;
    }

}
