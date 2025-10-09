
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
 *         &lt;element name="MciStringToMobileNumberResult" type="{http://schemas.datacontract.org/2004/07/Core}MciStringToMobileNumberOutput" minOccurs="0"/&gt;
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
    "mciStringToMobileNumberResult"
})
@XmlRootElement(name = "MciStringToMobileNumberResponse", namespace = "http://tempuri.org/")
public class MciStringToMobileNumberResponse {

    @XmlElement(name = "MciStringToMobileNumberResult", namespace = "http://tempuri.org/", nillable = true)
    protected MciStringToMobileNumberOutput mciStringToMobileNumberResult;

    /**
     * Gets the value of the mciStringToMobileNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link MciStringToMobileNumberOutput }
     *     
     */
    public MciStringToMobileNumberOutput getMciStringToMobileNumberResult() {
        return mciStringToMobileNumberResult;
    }

    /**
     * Sets the value of the mciStringToMobileNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MciStringToMobileNumberOutput }
     *     
     */
    public void setMciStringToMobileNumberResult(MciStringToMobileNumberOutput value) {
        this.mciStringToMobileNumberResult = value;
    }

}
