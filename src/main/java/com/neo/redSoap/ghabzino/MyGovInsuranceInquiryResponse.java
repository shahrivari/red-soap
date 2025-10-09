
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
 *         &lt;element name="MyGovInsuranceInquiryResult" type="{http://schemas.datacontract.org/2004/07/Core}MyGovInsuranceInquiryOutput" minOccurs="0"/&gt;
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
    "myGovInsuranceInquiryResult"
})
@XmlRootElement(name = "MyGovInsuranceInquiryResponse", namespace = "http://tempuri.org/")
public class MyGovInsuranceInquiryResponse {

    @XmlElement(name = "MyGovInsuranceInquiryResult", namespace = "http://tempuri.org/", nillable = true)
    protected MyGovInsuranceInquiryOutput myGovInsuranceInquiryResult;

    /**
     * Gets the value of the myGovInsuranceInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovInsuranceInquiryOutput }
     *     
     */
    public MyGovInsuranceInquiryOutput getMyGovInsuranceInquiryResult() {
        return myGovInsuranceInquiryResult;
    }

    /**
     * Sets the value of the myGovInsuranceInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovInsuranceInquiryOutput }
     *     
     */
    public void setMyGovInsuranceInquiryResult(MyGovInsuranceInquiryOutput value) {
        this.myGovInsuranceInquiryResult = value;
    }

}
