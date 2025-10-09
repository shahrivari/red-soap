
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WaterBillSettlementReportResult" type="{http://schemas.datacontract.org/2004/07/Core}WaterBillSettlementReportOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "waterBillSettlementReportResult"
})
@XmlRootElement(name = "WaterBillSettlementReportResponse", namespace = "http://tempuri.org/")
public class WaterBillSettlementReportResponse {

    @XmlElement(name = "WaterBillSettlementReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected WaterBillSettlementReportOutput waterBillSettlementReportResult;

    /**
     * Gets the value of the waterBillSettlementReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link WaterBillSettlementReportOutput }
     *     
     */
    public WaterBillSettlementReportOutput getWaterBillSettlementReportResult() {
        return waterBillSettlementReportResult;
    }

    /**
     * Sets the value of the waterBillSettlementReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterBillSettlementReportOutput }
     *     
     */
    public void setWaterBillSettlementReportResult(WaterBillSettlementReportOutput value) {
        this.waterBillSettlementReportResult = value;
    }

}
