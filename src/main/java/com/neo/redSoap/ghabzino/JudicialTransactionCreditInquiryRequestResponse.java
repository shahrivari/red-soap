
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
 *         &lt;element name="JudicialTransactionCreditInquiryRequestResult" type="{http://schemas.datacontract.org/2004/07/Core}JudicialTransactionCreditInquiryRequestOutput" minOccurs="0"/&gt;
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
    "judicialTransactionCreditInquiryRequestResult"
})
@XmlRootElement(name = "JudicialTransactionCreditInquiryRequestResponse", namespace = "http://tempuri.org/")
public class JudicialTransactionCreditInquiryRequestResponse {

    @XmlElement(name = "JudicialTransactionCreditInquiryRequestResult", namespace = "http://tempuri.org/", nillable = true)
    protected JudicialTransactionCreditInquiryRequestOutput judicialTransactionCreditInquiryRequestResult;

    /**
     * Gets the value of the judicialTransactionCreditInquiryRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialTransactionCreditInquiryRequestOutput }
     *     
     */
    public JudicialTransactionCreditInquiryRequestOutput getJudicialTransactionCreditInquiryRequestResult() {
        return judicialTransactionCreditInquiryRequestResult;
    }

    /**
     * Sets the value of the judicialTransactionCreditInquiryRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialTransactionCreditInquiryRequestOutput }
     *     
     */
    public void setJudicialTransactionCreditInquiryRequestResult(JudicialTransactionCreditInquiryRequestOutput value) {
        this.judicialTransactionCreditInquiryRequestResult = value;
    }

}
