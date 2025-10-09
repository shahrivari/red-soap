
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
 *         &lt;element name="MyGovTelecomLinesRequestOtpResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovTelecomLinesRequestOtpOutput" minOccurs="0"/&gt;
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
    "myGovTelecomLinesRequestOtpResult"
})
@XmlRootElement(name = "MyGovTelecomLinesRequestOtpResponse", namespace = "http://tempuri.org/")
public class MyGovTelecomLinesRequestOtpResponse {

    @XmlElement(name = "MyGovTelecomLinesRequestOtpResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovTelecomLinesRequestOtpOutput myGovTelecomLinesRequestOtpResult;

    /**
     * Gets the value of the myGovTelecomLinesRequestOtpResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovTelecomLinesRequestOtpOutput }
     *     
     */
    public MyGovTelecomLinesRequestOtpOutput getMyGovTelecomLinesRequestOtpResult() {
        return myGovTelecomLinesRequestOtpResult;
    }

    /**
     * Sets the value of the myGovTelecomLinesRequestOtpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovTelecomLinesRequestOtpOutput }
     *     
     */
    public void setMyGovTelecomLinesRequestOtpResult(MyGovTelecomLinesRequestOtpOutput value) {
        this.myGovTelecomLinesRequestOtpResult = value;
    }

}
