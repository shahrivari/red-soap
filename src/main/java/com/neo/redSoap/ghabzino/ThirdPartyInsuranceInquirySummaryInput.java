
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyInsuranceInquirySummaryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyInsuranceInquirySummaryInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identity" type="{http://schemas.datacontract.org/2004/07/Core}WebServiceIdentity" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Core}ThirdPartyInsuranceInquirySummaryInputParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyInsuranceInquirySummaryInput", propOrder = {
    "identity",
    "parameters"
})
public class ThirdPartyInsuranceInquirySummaryInput {

    @XmlElement(name = "Identity", nillable = true)
    protected WebServiceIdentity identity;
    @XmlElement(name = "Parameters", nillable = true)
    protected ThirdPartyInsuranceInquirySummaryInputParams parameters;

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
     *     {@link ThirdPartyInsuranceInquirySummaryInputParams }
     *     
     */
    public ThirdPartyInsuranceInquirySummaryInputParams getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInsuranceInquirySummaryInputParams }
     *     
     */
    public void setParameters(ThirdPartyInsuranceInquirySummaryInputParams value) {
        this.parameters = value;
    }

}
