
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
 *         &lt;element name="GetMasterWalletInfoResult" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoOutput" minOccurs="0"/&gt;
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
    "getMasterWalletInfoResult"
})
@XmlRootElement(name = "GetMasterWalletInfoResponse", namespace = "http://tempuri.org/")
public class GetMasterWalletInfoResponse {

    @XmlElement(name = "GetMasterWalletInfoResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetMasterWalletInfoOutput getMasterWalletInfoResult;

    /**
     * Gets the value of the getMasterWalletInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoOutput }
     *     
     */
    public GetMasterWalletInfoOutput getGetMasterWalletInfoResult() {
        return getMasterWalletInfoResult;
    }

    /**
     * Sets the value of the getMasterWalletInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoOutput }
     *     
     */
    public void setGetMasterWalletInfoResult(GetMasterWalletInfoOutput value) {
        this.getMasterWalletInfoResult = value;
    }

}
