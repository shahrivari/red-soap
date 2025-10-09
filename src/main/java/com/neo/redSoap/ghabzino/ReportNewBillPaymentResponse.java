
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
 *         &lt;element name="ReportNewBillPaymentResult" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewBillPaymentOutput" minOccurs="0"/&gt;
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
    "reportNewBillPaymentResult"
})
@XmlRootElement(name = "ReportNewBillPaymentResponse", namespace = "http://tempuri.org/")
public class ReportNewBillPaymentResponse {

    @XmlElement(name = "ReportNewBillPaymentResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReportNewBillPaymentOutput reportNewBillPaymentResult;

    /**
     * Gets the value of the reportNewBillPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportNewBillPaymentOutput }
     *     
     */
    public ReportNewBillPaymentOutput getReportNewBillPaymentResult() {
        return reportNewBillPaymentResult;
    }

    /**
     * Sets the value of the reportNewBillPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportNewBillPaymentOutput }
     *     
     */
    public void setReportNewBillPaymentResult(ReportNewBillPaymentOutput value) {
        this.reportNewBillPaymentResult = value;
    }

}
