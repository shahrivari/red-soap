
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GasBillHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasBillHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GasBillHistoryDetailList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfGasBillHistoryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasBillHistoryInquiryOutputParams", propOrder = {
    "billCount",
    "gasBillHistoryDetailList"
})
public class GasBillHistoryInquiryOutputParams {

    @XmlElement(name = "BillCount")
    protected Long billCount;
    @XmlElement(name = "GasBillHistoryDetailList", nillable = true)
    protected ArrayOfGasBillHistoryDetail gasBillHistoryDetailList;

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
     * Gets the value of the gasBillHistoryDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGasBillHistoryDetail }
     *     
     */
    public ArrayOfGasBillHistoryDetail getGasBillHistoryDetailList() {
        return gasBillHistoryDetailList;
    }

    /**
     * Sets the value of the gasBillHistoryDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGasBillHistoryDetail }
     *     
     */
    public void setGasBillHistoryDetailList(ArrayOfGasBillHistoryDetail value) {
        this.gasBillHistoryDetailList = value;
    }

}
