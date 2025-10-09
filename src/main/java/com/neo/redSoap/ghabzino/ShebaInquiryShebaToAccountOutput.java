
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShebaInquiryShebaToAccountOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShebaInquiryShebaToAccountOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Core}ShebaInquiryShebaToAccountOutputParams" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Core}WebServiceStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShebaInquiryShebaToAccountOutput", propOrder = {
    "parameters",
    "status"
})
public class ShebaInquiryShebaToAccountOutput {

    @XmlElement(name = "Parameters", nillable = true)
    protected ShebaInquiryShebaToAccountOutputParams parameters;
    @XmlElement(name = "Status", nillable = true)
    protected WebServiceStatus status;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ShebaInquiryShebaToAccountOutputParams }
     *     
     */
    public ShebaInquiryShebaToAccountOutputParams getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShebaInquiryShebaToAccountOutputParams }
     *     
     */
    public void setParameters(ShebaInquiryShebaToAccountOutputParams value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceStatus }
     *     
     */
    public WebServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceStatus }
     *     
     */
    public void setStatus(WebServiceStatus value) {
        this.status = value;
    }

}
