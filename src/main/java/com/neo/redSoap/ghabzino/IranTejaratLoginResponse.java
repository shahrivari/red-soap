
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
 *         &lt;element name="IranTejaratLoginResult" type="{http://schemas.datacontract.org/2004/07/Core}IranTejaratLoginOutput" minOccurs="0"/&gt;
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
    "iranTejaratLoginResult"
})
@XmlRootElement(name = "IranTejaratLoginResponse", namespace = "http://tempuri.org/")
public class IranTejaratLoginResponse {

    @XmlElement(name = "IranTejaratLoginResult", namespace = "http://tempuri.org/", nillable = true)
    protected IranTejaratLoginOutput iranTejaratLoginResult;

    /**
     * Gets the value of the iranTejaratLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link IranTejaratLoginOutput }
     *     
     */
    public IranTejaratLoginOutput getIranTejaratLoginResult() {
        return iranTejaratLoginResult;
    }

    /**
     * Sets the value of the iranTejaratLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IranTejaratLoginOutput }
     *     
     */
    public void setIranTejaratLoginResult(IranTejaratLoginOutput value) {
        this.iranTejaratLoginResult = value;
    }

}
