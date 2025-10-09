
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
 *         &lt;element name="ws" type="{http://schemas.datacontract.org/2004/07/Core}BillPaymentInquiryInput" minOccurs="0"/&gt;
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
    "ws"
})
@XmlRootElement(name = "BillPaymentInquiry", namespace = "http://tempuri.org/")
public class BillPaymentInquiry {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected BillPaymentInquiryInput ws;

    /**
     * Gets the value of the ws property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentInquiryInput }
     *     
     */
    public BillPaymentInquiryInput getWs() {
        return ws;
    }

    /**
     * Sets the value of the ws property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentInquiryInput }
     *     
     */
    public void setWs(BillPaymentInquiryInput value) {
        this.ws = value;
    }

}
