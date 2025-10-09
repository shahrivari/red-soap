
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceDetail" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponInquiryBalanceDto" minOccurs="0"/&gt;
 *         &lt;element name="ProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponInquiryProfileInfoDto" minOccurs="0"/&gt;
 *         &lt;element name="SaleTypes" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfSfaraCouponInquirySaleTypeDto" minOccurs="0"/&gt;
 *         &lt;element name="StatementList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfSfaraCouponInquiryStatementDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponInquiryOutputParams", propOrder = {
    "balanceDetail",
    "profileInfo",
    "saleTypes",
    "statementList"
})
public class SfaraCouponInquiryOutputParams {

    @XmlElement(name = "BalanceDetail", nillable = true)
    protected SfaraCouponInquiryBalanceDto balanceDetail;
    @XmlElement(name = "ProfileInfo", nillable = true)
    protected SfaraCouponInquiryProfileInfoDto profileInfo;
    @XmlElement(name = "SaleTypes", nillable = true)
    protected ArrayOfSfaraCouponInquirySaleTypeDto saleTypes;
    @XmlElement(name = "StatementList", nillable = true)
    protected ArrayOfSfaraCouponInquiryStatementDto statementList;

    /**
     * Gets the value of the balanceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SfaraCouponInquiryBalanceDto }
     *     
     */
    public SfaraCouponInquiryBalanceDto getBalanceDetail() {
        return balanceDetail;
    }

    /**
     * Sets the value of the balanceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfaraCouponInquiryBalanceDto }
     *     
     */
    public void setBalanceDetail(SfaraCouponInquiryBalanceDto value) {
        this.balanceDetail = value;
    }

    /**
     * Gets the value of the profileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SfaraCouponInquiryProfileInfoDto }
     *     
     */
    public SfaraCouponInquiryProfileInfoDto getProfileInfo() {
        return profileInfo;
    }

    /**
     * Sets the value of the profileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfaraCouponInquiryProfileInfoDto }
     *     
     */
    public void setProfileInfo(SfaraCouponInquiryProfileInfoDto value) {
        this.profileInfo = value;
    }

    /**
     * Gets the value of the saleTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfaraCouponInquirySaleTypeDto }
     *     
     */
    public ArrayOfSfaraCouponInquirySaleTypeDto getSaleTypes() {
        return saleTypes;
    }

    /**
     * Sets the value of the saleTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfaraCouponInquirySaleTypeDto }
     *     
     */
    public void setSaleTypes(ArrayOfSfaraCouponInquirySaleTypeDto value) {
        this.saleTypes = value;
    }

    /**
     * Gets the value of the statementList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfaraCouponInquiryStatementDto }
     *     
     */
    public ArrayOfSfaraCouponInquiryStatementDto getStatementList() {
        return statementList;
    }

    /**
     * Sets the value of the statementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfaraCouponInquiryStatementDto }
     *     
     */
    public void setStatementList(ArrayOfSfaraCouponInquiryStatementDto value) {
        this.statementList = value;
    }

}
