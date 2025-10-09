
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
 *         &lt;element name="MyGovFuelCardRechargeHistoryInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovFuelCardRechargeHistoryInquiryOutput" minOccurs="0"/&gt;
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
    "myGovFuelCardRechargeHistoryInquiryResult"
})
@XmlRootElement(name = "MyGovFuelCardRechargeHistoryInquiryResponse", namespace = "http://tempuri.org/")
public class MyGovFuelCardRechargeHistoryInquiryResponse {

    @XmlElement(name = "MyGovFuelCardRechargeHistoryInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovFuelCardRechargeHistoryInquiryOutput myGovFuelCardRechargeHistoryInquiryResult;

    /**
     * Gets the value of the myGovFuelCardRechargeHistoryInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovFuelCardRechargeHistoryInquiryOutput }
     *     
     */
    public MyGovFuelCardRechargeHistoryInquiryOutput getMyGovFuelCardRechargeHistoryInquiryResult() {
        return myGovFuelCardRechargeHistoryInquiryResult;
    }

    /**
     * Sets the value of the myGovFuelCardRechargeHistoryInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovFuelCardRechargeHistoryInquiryOutput }
     *     
     */
    public void setMyGovFuelCardRechargeHistoryInquiryResult(MyGovFuelCardRechargeHistoryInquiryOutput value) {
        this.myGovFuelCardRechargeHistoryInquiryResult = value;
    }

}
