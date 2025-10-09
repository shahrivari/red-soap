
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
 *         &lt;element name="IranTejaratGetInternalTradeSellOutputDocumentsResult" type="{http://schemas.datacontract.org/2004/07/Core}IranTejaratGetInternalTradeSellOutputDocumentsOutput" minOccurs="0"/&gt;
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
    "iranTejaratGetInternalTradeSellOutputDocumentsResult"
})
@XmlRootElement(name = "IranTejaratGetInternalTradeSellOutputDocumentsResponse", namespace = "http://tempuri.org/")
public class IranTejaratGetInternalTradeSellOutputDocumentsResponse {

    @XmlElement(name = "IranTejaratGetInternalTradeSellOutputDocumentsResult", namespace = "http://tempuri.org/", nillable = true)
    protected IranTejaratGetInternalTradeSellOutputDocumentsOutput iranTejaratGetInternalTradeSellOutputDocumentsResult;

    /**
     * Gets the value of the iranTejaratGetInternalTradeSellOutputDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link IranTejaratGetInternalTradeSellOutputDocumentsOutput }
     *     
     */
    public IranTejaratGetInternalTradeSellOutputDocumentsOutput getIranTejaratGetInternalTradeSellOutputDocumentsResult() {
        return iranTejaratGetInternalTradeSellOutputDocumentsResult;
    }

    /**
     * Sets the value of the iranTejaratGetInternalTradeSellOutputDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IranTejaratGetInternalTradeSellOutputDocumentsOutput }
     *     
     */
    public void setIranTejaratGetInternalTradeSellOutputDocumentsResult(IranTejaratGetInternalTradeSellOutputDocumentsOutput value) {
        this.iranTejaratGetInternalTradeSellOutputDocumentsResult = value;
    }

}
