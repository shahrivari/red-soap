
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
 *         &lt;element name="ReportNewCarAnnualTaxPaymentByMasterWalletResult" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewCarAnnualTaxPaymentByMasterWalletOutput" minOccurs="0"/&gt;
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
    "reportNewCarAnnualTaxPaymentByMasterWalletResult"
})
@XmlRootElement(name = "ReportNewCarAnnualTaxPaymentByMasterWalletResponse", namespace = "http://tempuri.org/")
public class ReportNewCarAnnualTaxPaymentByMasterWalletResponse {

    @XmlElement(name = "ReportNewCarAnnualTaxPaymentByMasterWalletResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReportNewCarAnnualTaxPaymentByMasterWalletOutput reportNewCarAnnualTaxPaymentByMasterWalletResult;

    /**
     * Gets the value of the reportNewCarAnnualTaxPaymentByMasterWalletResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportNewCarAnnualTaxPaymentByMasterWalletOutput }
     *     
     */
    public ReportNewCarAnnualTaxPaymentByMasterWalletOutput getReportNewCarAnnualTaxPaymentByMasterWalletResult() {
        return reportNewCarAnnualTaxPaymentByMasterWalletResult;
    }

    /**
     * Sets the value of the reportNewCarAnnualTaxPaymentByMasterWalletResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportNewCarAnnualTaxPaymentByMasterWalletOutput }
     *     
     */
    public void setReportNewCarAnnualTaxPaymentByMasterWalletResult(ReportNewCarAnnualTaxPaymentByMasterWalletOutput value) {
        this.reportNewCarAnnualTaxPaymentByMasterWalletResult = value;
    }

}
