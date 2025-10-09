
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
 *         &lt;element name="CardOcrNationalCardCompleteInfoResult" type="{http://schemas.datacontract.org/2004/07/Core}CardOcrNationalCardCompleteInfoOutput" minOccurs="0"/&gt;
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
    "cardOcrNationalCardCompleteInfoResult"
})
@XmlRootElement(name = "CardOcrNationalCardCompleteInfoResponse", namespace = "http://tempuri.org/")
public class CardOcrNationalCardCompleteInfoResponse {

    @XmlElement(name = "CardOcrNationalCardCompleteInfoResult", namespace = "http://tempuri.org/", nillable = true)
    protected CardOcrNationalCardCompleteInfoOutput cardOcrNationalCardCompleteInfoResult;

    /**
     * Gets the value of the cardOcrNationalCardCompleteInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardOcrNationalCardCompleteInfoOutput }
     *     
     */
    public CardOcrNationalCardCompleteInfoOutput getCardOcrNationalCardCompleteInfoResult() {
        return cardOcrNationalCardCompleteInfoResult;
    }

    /**
     * Sets the value of the cardOcrNationalCardCompleteInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOcrNationalCardCompleteInfoOutput }
     *     
     */
    public void setCardOcrNationalCardCompleteInfoResult(CardOcrNationalCardCompleteInfoOutput value) {
        this.cardOcrNationalCardCompleteInfoResult = value;
    }

}
