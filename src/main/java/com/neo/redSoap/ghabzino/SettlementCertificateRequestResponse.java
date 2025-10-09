
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
 *         &lt;element name="SettlementCertificateRequestResult" type="{http://schemas.datacontract.org/2004/07/Core}SettlementCertificateRequestOutput" minOccurs="0"/&gt;
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
    "settlementCertificateRequestResult"
})
@XmlRootElement(name = "SettlementCertificateRequestResponse", namespace = "http://tempuri.org/")
public class SettlementCertificateRequestResponse {

    @XmlElement(name = "SettlementCertificateRequestResult", namespace = "http://tempuri.org/", nillable = true)
    protected SettlementCertificateRequestOutput settlementCertificateRequestResult;

    /**
     * Gets the value of the settlementCertificateRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCertificateRequestOutput }
     *     
     */
    public SettlementCertificateRequestOutput getSettlementCertificateRequestResult() {
        return settlementCertificateRequestResult;
    }

    /**
     * Sets the value of the settlementCertificateRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCertificateRequestOutput }
     *     
     */
    public void setSettlementCertificateRequestResult(SettlementCertificateRequestOutput value) {
        this.settlementCertificateRequestResult = value;
    }

}
