
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBillHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBillHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BillHistoryList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfWaterBillHistoryResultDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBillHistoryInquiryOutputParams", propOrder = {
    "billCount",
    "billHistoryList"
})
public class WaterBillHistoryInquiryOutputParams {

    @XmlElement(name = "BillCount")
    protected Long billCount;
    @XmlElement(name = "BillHistoryList", nillable = true)
    protected ArrayOfWaterBillHistoryResultDetail billHistoryList;

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
     * Gets the value of the billHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterBillHistoryResultDetail }
     *     
     */
    public ArrayOfWaterBillHistoryResultDetail getBillHistoryList() {
        return billHistoryList;
    }

    /**
     * Sets the value of the billHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterBillHistoryResultDetail }
     *     
     */
    public void setBillHistoryList(ArrayOfWaterBillHistoryResultDetail value) {
        this.billHistoryList = value;
    }

}
