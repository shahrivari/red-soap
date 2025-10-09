
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
 *         &lt;element name="MyGovNationalCardReceiveTrackingInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovNationalCardReceiveTrackingInquiryOutput" minOccurs="0"/&gt;
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
    "myGovNationalCardReceiveTrackingInquiryResult"
})
@XmlRootElement(name = "MyGovNationalCardReceiveTrackingInquiryResponse", namespace = "http://tempuri.org/")
public class MyGovNationalCardReceiveTrackingInquiryResponse {

    @XmlElement(name = "MyGovNationalCardReceiveTrackingInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovNationalCardReceiveTrackingInquiryOutput myGovNationalCardReceiveTrackingInquiryResult;

    /**
     * Gets the value of the myGovNationalCardReceiveTrackingInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovNationalCardReceiveTrackingInquiryOutput }
     *     
     */
    public MyGovNationalCardReceiveTrackingInquiryOutput getMyGovNationalCardReceiveTrackingInquiryResult() {
        return myGovNationalCardReceiveTrackingInquiryResult;
    }

    /**
     * Sets the value of the myGovNationalCardReceiveTrackingInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovNationalCardReceiveTrackingInquiryOutput }
     *     
     */
    public void setMyGovNationalCardReceiveTrackingInquiryResult(MyGovNationalCardReceiveTrackingInquiryOutput value) {
        this.myGovNationalCardReceiveTrackingInquiryResult = value;
    }

}
