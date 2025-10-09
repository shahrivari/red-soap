
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JusticeSharesPortfolioInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JusticeSharesPortfolioInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput" minOccurs="0"/&gt;
 *         &lt;element name="Portfolio" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput" minOccurs="0"/&gt;
 *         &lt;element name="PortfolioDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortfolioTotalAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PortfolioTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Profile" type="{http://schemas.datacontract.org/2004/07/Core}JusticeSharesPortfolioInquiryProfileOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JusticeSharesPortfolioInquiryOutputParams", propOrder = {
    "paymentReports",
    "portfolio",
    "portfolioDescription",
    "portfolioTotalAmount",
    "portfolioTotalCount",
    "profile"
})
public class JusticeSharesPortfolioInquiryOutputParams {

    @XmlElement(name = "PaymentReports", nillable = true)
    protected ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput paymentReports;
    @XmlElement(name = "Portfolio", nillable = true)
    protected ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput portfolio;
    @XmlElement(name = "PortfolioDescription", nillable = true)
    protected String portfolioDescription;
    @XmlElement(name = "PortfolioTotalAmount")
    protected Long portfolioTotalAmount;
    @XmlElement(name = "PortfolioTotalCount")
    protected Long portfolioTotalCount;
    @XmlElement(name = "Profile", nillable = true)
    protected JusticeSharesPortfolioInquiryProfileOutput profile;

    /**
     * Gets the value of the paymentReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput }
     *     
     */
    public ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput getPaymentReports() {
        return paymentReports;
    }

    /**
     * Sets the value of the paymentReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput }
     *     
     */
    public void setPaymentReports(ArrayOfJusticeSharesPortfolioInquiryPaymentReportOutput value) {
        this.paymentReports = value;
    }

    /**
     * Gets the value of the portfolio property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput }
     *     
     */
    public ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput getPortfolio() {
        return portfolio;
    }

    /**
     * Sets the value of the portfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput }
     *     
     */
    public void setPortfolio(ArrayOfJusticeSharesPortfolioInquiryPortfolioOutput value) {
        this.portfolio = value;
    }

    /**
     * Gets the value of the portfolioDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioDescription() {
        return portfolioDescription;
    }

    /**
     * Sets the value of the portfolioDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioDescription(String value) {
        this.portfolioDescription = value;
    }

    /**
     * Gets the value of the portfolioTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioTotalAmount() {
        return portfolioTotalAmount;
    }

    /**
     * Sets the value of the portfolioTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioTotalAmount(Long value) {
        this.portfolioTotalAmount = value;
    }

    /**
     * Gets the value of the portfolioTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioTotalCount() {
        return portfolioTotalCount;
    }

    /**
     * Sets the value of the portfolioTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioTotalCount(Long value) {
        this.portfolioTotalCount = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JusticeSharesPortfolioInquiryProfileOutput }
     *     
     */
    public JusticeSharesPortfolioInquiryProfileOutput getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JusticeSharesPortfolioInquiryProfileOutput }
     *     
     */
    public void setProfile(JusticeSharesPortfolioInquiryProfileOutput value) {
        this.profile = value;
    }

}
