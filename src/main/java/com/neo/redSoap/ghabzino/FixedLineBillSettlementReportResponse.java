
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
 *         &lt;element name="FixedLineBillSettlementReportResult" type="{http://schemas.datacontract.org/2004/07/Core}FixedLineBillSettlementReportOutput" minOccurs="0"/&gt;
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
    "fixedLineBillSettlementReportResult"
})
@XmlRootElement(name = "FixedLineBillSettlementReportResponse", namespace = "http://tempuri.org/")
public class FixedLineBillSettlementReportResponse {

    @XmlElement(name = "FixedLineBillSettlementReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected FixedLineBillSettlementReportOutput fixedLineBillSettlementReportResult;

    /**
     * Gets the value of the fixedLineBillSettlementReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link FixedLineBillSettlementReportOutput }
     *     
     */
    public FixedLineBillSettlementReportOutput getFixedLineBillSettlementReportResult() {
        return fixedLineBillSettlementReportResult;
    }

    /**
     * Sets the value of the fixedLineBillSettlementReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedLineBillSettlementReportOutput }
     *     
     */
    public void setFixedLineBillSettlementReportResult(FixedLineBillSettlementReportOutput value) {
        this.fixedLineBillSettlementReportResult = value;
    }

}
