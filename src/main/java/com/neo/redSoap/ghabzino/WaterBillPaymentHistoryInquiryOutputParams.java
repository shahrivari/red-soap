
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBillPaymentHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBillPaymentHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WaterBillPaymentHistoryList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfWaterBillPaymentHistoryDetailList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBillPaymentHistoryInquiryOutputParams", propOrder = {
    "billCount",
    "waterBillPaymentHistoryList"
})
public class WaterBillPaymentHistoryInquiryOutputParams {

    @XmlElement(name = "BillCount")
    protected Long billCount;
    @XmlElement(name = "WaterBillPaymentHistoryList", nillable = true)
    protected ArrayOfWaterBillPaymentHistoryDetailList waterBillPaymentHistoryList;

    /**
     * Gets the value of the billCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillCount() {
        return billCount;
    }

    /**
     * Sets the value of the billCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillCount(Long value) {
        this.billCount = value;
    }

    /**
     * Gets the value of the waterBillPaymentHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterBillPaymentHistoryDetailList }
     *     
     */
    public ArrayOfWaterBillPaymentHistoryDetailList getWaterBillPaymentHistoryList() {
        return waterBillPaymentHistoryList;
    }

    /**
     * Sets the value of the waterBillPaymentHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterBillPaymentHistoryDetailList }
     *     
     */
    public void setWaterBillPaymentHistoryList(ArrayOfWaterBillPaymentHistoryDetailList value) {
        this.waterBillPaymentHistoryList = value;
    }

}
