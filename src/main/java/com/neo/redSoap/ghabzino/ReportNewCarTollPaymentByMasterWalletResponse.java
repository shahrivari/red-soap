
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
 *         &lt;element name="ReportNewCarTollPaymentByMasterWalletResult" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewCarTollPaymentByMasterWalletOutput" minOccurs="0"/&gt;
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
    "reportNewCarTollPaymentByMasterWalletResult"
})
@XmlRootElement(name = "ReportNewCarTollPaymentByMasterWalletResponse", namespace = "http://tempuri.org/")
public class ReportNewCarTollPaymentByMasterWalletResponse {

    @XmlElement(name = "ReportNewCarTollPaymentByMasterWalletResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReportNewCarTollPaymentByMasterWalletOutput reportNewCarTollPaymentByMasterWalletResult;

    /**
     * Gets the value of the reportNewCarTollPaymentByMasterWalletResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportNewCarTollPaymentByMasterWalletOutput }
     *     
     */
    public ReportNewCarTollPaymentByMasterWalletOutput getReportNewCarTollPaymentByMasterWalletResult() {
        return reportNewCarTollPaymentByMasterWalletResult;
    }

    /**
     * Sets the value of the reportNewCarTollPaymentByMasterWalletResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportNewCarTollPaymentByMasterWalletOutput }
     *     
     */
    public void setReportNewCarTollPaymentByMasterWalletResult(ReportNewCarTollPaymentByMasterWalletOutput value) {
        this.reportNewCarTollPaymentByMasterWalletResult = value;
    }

}
