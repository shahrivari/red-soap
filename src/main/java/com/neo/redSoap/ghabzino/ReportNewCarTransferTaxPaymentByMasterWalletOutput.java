
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportNewCarTransferTaxPaymentByMasterWalletOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportNewCarTransferTaxPaymentByMasterWalletOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewCarTransferTaxPaymentByMasterWalletOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Core}WebServiceStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportNewCarTransferTaxPaymentByMasterWalletOutput", propOrder = {
    "parameters",
    "status"
})
public class ReportNewCarTransferTaxPaymentByMasterWalletOutput {

    @XmlElement(name = "Parameters", nillable = true)
    protected ReportNewCarTransferTaxPaymentByMasterWalletOutputParams parameters;
    @XmlElement(name = "Status", nillable = true)
    protected WebServiceStatus status;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ReportNewCarTransferTaxPaymentByMasterWalletOutputParams }
     *     
     */
    public ReportNewCarTransferTaxPaymentByMasterWalletOutputParams getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportNewCarTransferTaxPaymentByMasterWalletOutputParams }
     *     
     */
    public void setParameters(ReportNewCarTransferTaxPaymentByMasterWalletOutputParams value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceStatus }
     *     
     */
    public WebServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceStatus }
     *     
     */
    public void setStatus(WebServiceStatus value) {
        this.status = value;
    }

}
