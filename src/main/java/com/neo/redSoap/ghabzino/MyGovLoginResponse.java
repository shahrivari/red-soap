
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
 *         &lt;element name="MyGovLoginResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovLoginOutput" minOccurs="0"/&gt;
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
    "myGovLoginResult"
})
@XmlRootElement(name = "MyGovLoginResponse", namespace = "http://tempuri.org/")
public class MyGovLoginResponse {

    @XmlElement(name = "MyGovLoginResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovLoginOutput myGovLoginResult;

    /**
     * Gets the value of the myGovLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovLoginOutput }
     *     
     */
    public MyGovLoginOutput getMyGovLoginResult() {
        return myGovLoginResult;
    }

    /**
     * Sets the value of the myGovLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovLoginOutput }
     *     
     */
    public void setMyGovLoginResult(MyGovLoginOutput value) {
        this.myGovLoginResult = value;
    }

}
