
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
 *         &lt;element name="JudicialTransactionCreditOtpRequestResult" type="{http://schemas.datacontract.org/2004/07/Core}JudicialTransactionCreditOtpRequestOutput" minOccurs="0"/&gt;
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
    "judicialTransactionCreditOtpRequestResult"
})
@XmlRootElement(name = "JudicialTransactionCreditOtpRequestResponse", namespace = "http://tempuri.org/")
public class JudicialTransactionCreditOtpRequestResponse {

    @XmlElement(name = "JudicialTransactionCreditOtpRequestResult", namespace = "http://tempuri.org/", nillable = true)
    protected JudicialTransactionCreditOtpRequestOutput judicialTransactionCreditOtpRequestResult;

    /**
     * Gets the value of the judicialTransactionCreditOtpRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialTransactionCreditOtpRequestOutput }
     *     
     */
    public JudicialTransactionCreditOtpRequestOutput getJudicialTransactionCreditOtpRequestResult() {
        return judicialTransactionCreditOtpRequestResult;
    }

    /**
     * Sets the value of the judicialTransactionCreditOtpRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialTransactionCreditOtpRequestOutput }
     *     
     */
    public void setJudicialTransactionCreditOtpRequestResult(JudicialTransactionCreditOtpRequestOutput value) {
        this.judicialTransactionCreditOtpRequestResult = value;
    }

}
