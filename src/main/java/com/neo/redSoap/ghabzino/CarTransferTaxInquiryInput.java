
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarTransferTaxInquiryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarTransferTaxInquiryInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identity" type="{http://schemas.datacontract.org/2004/07/Core}WebServiceIdentity" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Core}CarTransferTaxInquiryInputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarTransferTaxInquiryInput", propOrder = {
    "identity",
    "parameters"
})
public class CarTransferTaxInquiryInput {

    @XmlElement(name = "Identity", nillable = true)
    protected WebServiceIdentity identity;
    @XmlElement(name = "Parameters", nillable = true)
    protected CarTransferTaxInquiryInputParams parameters;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceIdentity }
     *     
     */
    public WebServiceIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceIdentity }
     *     
     */
    public void setIdentity(WebServiceIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link CarTransferTaxInquiryInputParams }
     *     
     */
    public CarTransferTaxInquiryInputParams getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTransferTaxInquiryInputParams }
     *     
     */
    public void setParameters(CarTransferTaxInquiryInputParams value) {
        this.parameters = value;
    }

}
