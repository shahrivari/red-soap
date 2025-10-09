
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
 *         &lt;element name="MyGovRequestOtpResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovRequestOtpOutput" minOccurs="0"/&gt;
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
    "myGovRequestOtpResult"
})
@XmlRootElement(name = "MyGovRequestOtpResponse", namespace = "http://tempuri.org/")
public class MyGovRequestOtpResponse {

    @XmlElement(name = "MyGovRequestOtpResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovRequestOtpOutput myGovRequestOtpResult;

    /**
     * Gets the value of the myGovRequestOtpResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovRequestOtpOutput }
     *     
     */
    public MyGovRequestOtpOutput getMyGovRequestOtpResult() {
        return myGovRequestOtpResult;
    }

    /**
     * Sets the value of the myGovRequestOtpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovRequestOtpOutput }
     *     
     */
    public void setMyGovRequestOtpResult(MyGovRequestOtpOutput value) {
        this.myGovRequestOtpResult = value;
    }

}
