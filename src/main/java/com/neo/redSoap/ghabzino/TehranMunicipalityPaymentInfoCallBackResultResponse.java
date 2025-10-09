
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
 *         &lt;element name="TehranMunicipalityPaymentInfoCallBackResultResult" type="{http://schemas.datacontract.org/2004/07/Core}TehranMunicipalityPaymentInfoCallBackResultOutput" minOccurs="0"/&gt;
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
    "tehranMunicipalityPaymentInfoCallBackResultResult"
})
@XmlRootElement(name = "TehranMunicipalityPaymentInfoCallBackResultResponse", namespace = "http://tempuri.org/")
public class TehranMunicipalityPaymentInfoCallBackResultResponse {

    @XmlElement(name = "TehranMunicipalityPaymentInfoCallBackResultResult", namespace = "http://tempuri.org/", nillable = true)
    protected TehranMunicipalityPaymentInfoCallBackResultOutput tehranMunicipalityPaymentInfoCallBackResultResult;

    /**
     * Gets the value of the tehranMunicipalityPaymentInfoCallBackResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link TehranMunicipalityPaymentInfoCallBackResultOutput }
     *     
     */
    public TehranMunicipalityPaymentInfoCallBackResultOutput getTehranMunicipalityPaymentInfoCallBackResultResult() {
        return tehranMunicipalityPaymentInfoCallBackResultResult;
    }

    /**
     * Sets the value of the tehranMunicipalityPaymentInfoCallBackResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TehranMunicipalityPaymentInfoCallBackResultOutput }
     *     
     */
    public void setTehranMunicipalityPaymentInfoCallBackResultResult(TehranMunicipalityPaymentInfoCallBackResultOutput value) {
        this.tehranMunicipalityPaymentInfoCallBackResultResult = value;
    }

}
