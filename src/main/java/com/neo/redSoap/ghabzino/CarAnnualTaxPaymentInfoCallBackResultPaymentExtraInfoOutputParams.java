
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCertificateUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCertificateUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams", propOrder = {
    "dateTime",
    "settlementCertificateUniqueID",
    "settlementCertificateUrl",
    "traceNumber"
})
public class CarAnnualTaxPaymentInfoCallBackResultPaymentExtraInfoOutputParams {

    @XmlElement(name = "DateTime", nillable = true)
    protected String dateTime;
    @XmlElement(name = "SettlementCertificateUniqueID", nillable = true)
    protected String settlementCertificateUniqueID;
    @XmlElement(name = "SettlementCertificateUrl", nillable = true)
    protected String settlementCertificateUrl;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the settlementCertificateUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCertificateUniqueID() {
        return settlementCertificateUniqueID;
    }

    /**
     * Sets the value of the settlementCertificateUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCertificateUniqueID(String value) {
        this.settlementCertificateUniqueID = value;
    }

    /**
     * Gets the value of the settlementCertificateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCertificateUrl() {
        return settlementCertificateUrl;
    }

    /**
     * Sets the value of the settlementCertificateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCertificateUrl(String value) {
        this.settlementCertificateUrl = value;
    }

    /**
     * Gets the value of the traceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Sets the value of the traceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

}
