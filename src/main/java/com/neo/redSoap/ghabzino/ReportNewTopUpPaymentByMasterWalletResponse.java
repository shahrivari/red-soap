
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
 *         &lt;element name="ReportNewTopUpPaymentByMasterWalletResult" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewTopUpPaymentByMasterWalletOutput" minOccurs="0"/&gt;
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
    "reportNewTopUpPaymentByMasterWalletResult"
})
@XmlRootElement(name = "ReportNewTopUpPaymentByMasterWalletResponse", namespace = "http://tempuri.org/")
public class ReportNewTopUpPaymentByMasterWalletResponse {

    @XmlElement(name = "ReportNewTopUpPaymentByMasterWalletResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReportNewTopUpPaymentByMasterWalletOutput reportNewTopUpPaymentByMasterWalletResult;

    /**
     * Gets the value of the reportNewTopUpPaymentByMasterWalletResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportNewTopUpPaymentByMasterWalletOutput }
     *     
     */
    public ReportNewTopUpPaymentByMasterWalletOutput getReportNewTopUpPaymentByMasterWalletResult() {
        return reportNewTopUpPaymentByMasterWalletResult;
    }

    /**
     * Sets the value of the reportNewTopUpPaymentByMasterWalletResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportNewTopUpPaymentByMasterWalletOutput }
     *     
     */
    public void setReportNewTopUpPaymentByMasterWalletResult(ReportNewTopUpPaymentByMasterWalletOutput value) {
        this.reportNewTopUpPaymentByMasterWalletResult = value;
    }

}
