
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
 *         &lt;element name="ShebaInquiryShebaToAccountResult" type="{http://schemas.datacontract.org/2004/07/Core}ShebaInquiryShebaToAccountOutput" minOccurs="0"/&gt;
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
    "shebaInquiryShebaToAccountResult"
})
@XmlRootElement(name = "ShebaInquiryShebaToAccountResponse", namespace = "http://tempuri.org/")
public class ShebaInquiryShebaToAccountResponse {

    @XmlElement(name = "ShebaInquiryShebaToAccountResult", namespace = "http://tempuri.org/", nillable = true)
    protected ShebaInquiryShebaToAccountOutput shebaInquiryShebaToAccountResult;

    /**
     * Gets the value of the shebaInquiryShebaToAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link ShebaInquiryShebaToAccountOutput }
     *     
     */
    public ShebaInquiryShebaToAccountOutput getShebaInquiryShebaToAccountResult() {
        return shebaInquiryShebaToAccountResult;
    }

    /**
     * Sets the value of the shebaInquiryShebaToAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShebaInquiryShebaToAccountOutput }
     *     
     */
    public void setShebaInquiryShebaToAccountResult(ShebaInquiryShebaToAccountOutput value) {
        this.shebaInquiryShebaToAccountResult = value;
    }

}
