
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
 *         &lt;element name="SendSmsResult" type="{http://schemas.datacontract.org/2004/07/Core}SendSmsOutput" minOccurs="0"/&gt;
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
    "sendSmsResult"
})
@XmlRootElement(name = "SendSmsResponse", namespace = "http://tempuri.org/")
public class SendSmsResponse {

    @XmlElement(name = "SendSmsResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendSmsOutput sendSmsResult;

    /**
     * Gets the value of the sendSmsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendSmsOutput }
     *     
     */
    public SendSmsOutput getSendSmsResult() {
        return sendSmsResult;
    }

    /**
     * Sets the value of the sendSmsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendSmsOutput }
     *     
     */
    public void setSendSmsResult(SendSmsOutput value) {
        this.sendSmsResult = value;
    }

}
