
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponInquiryBalanceDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponInquiryBalanceDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfSfaraCouponInquiryBalanceDetailDto" minOccurs="0"/&gt;
 *         &lt;element name="TotalBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponInquiryBalanceDto", propOrder = {
    "detailList",
    "totalBalanceAmount"
})
public class SfaraCouponInquiryBalanceDto {

    @XmlElement(name = "DetailList", nillable = true)
    protected ArrayOfSfaraCouponInquiryBalanceDetailDto detailList;
    @XmlElement(name = "TotalBalanceAmount")
    protected Long totalBalanceAmount;

    /**
     * Gets the value of the detailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfaraCouponInquiryBalanceDetailDto }
     *     
     */
    public ArrayOfSfaraCouponInquiryBalanceDetailDto getDetailList() {
        return detailList;
    }

    /**
     * Sets the value of the detailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfaraCouponInquiryBalanceDetailDto }
     *     
     */
    public void setDetailList(ArrayOfSfaraCouponInquiryBalanceDetailDto value) {
        this.detailList = value;
    }

    /**
     * Gets the value of the totalBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalBalanceAmount() {
        return totalBalanceAmount;
    }

    /**
     * Sets the value of the totalBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalBalanceAmount(Long value) {
        this.totalBalanceAmount = value;
    }

}
