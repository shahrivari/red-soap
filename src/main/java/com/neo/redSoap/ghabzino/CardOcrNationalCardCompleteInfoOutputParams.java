
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOcrNationalCardCompleteInfoOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOcrNationalCardCompleteInfoOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OcrResult" type="{http://schemas.datacontract.org/2004/07/Core}CardOcrNationalCardCompleteInfoOcrResult" minOccurs="0"/&gt;
 *         &lt;element name="RegistryOfficeResult" type="{http://schemas.datacontract.org/2004/07/Core}CardOcrNationalCardCompleteInfoRegistryOfficeResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOcrNationalCardCompleteInfoOutputParams", propOrder = {
    "ocrResult",
    "registryOfficeResult"
})
public class CardOcrNationalCardCompleteInfoOutputParams {

    @XmlElement(name = "OcrResult", nillable = true)
    protected CardOcrNationalCardCompleteInfoOcrResult ocrResult;
    @XmlElement(name = "RegistryOfficeResult", nillable = true)
    protected CardOcrNationalCardCompleteInfoRegistryOfficeResult registryOfficeResult;

    /**
     * Gets the value of the ocrResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardOcrNationalCardCompleteInfoOcrResult }
     *     
     */
    public CardOcrNationalCardCompleteInfoOcrResult getOcrResult() {
        return ocrResult;
    }

    /**
     * Sets the value of the ocrResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOcrNationalCardCompleteInfoOcrResult }
     *     
     */
    public void setOcrResult(CardOcrNationalCardCompleteInfoOcrResult value) {
        this.ocrResult = value;
    }

    /**
     * Gets the value of the registryOfficeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardOcrNationalCardCompleteInfoRegistryOfficeResult }
     *     
     */
    public CardOcrNationalCardCompleteInfoRegistryOfficeResult getRegistryOfficeResult() {
        return registryOfficeResult;
    }

    /**
     * Sets the value of the registryOfficeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOcrNationalCardCompleteInfoRegistryOfficeResult }
     *     
     */
    public void setRegistryOfficeResult(CardOcrNationalCardCompleteInfoRegistryOfficeResult value) {
        this.registryOfficeResult = value;
    }

}
