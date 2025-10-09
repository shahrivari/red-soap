
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovNationalCardReceiveTrackingInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovNationalCardReceiveTrackingInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MyGovProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}MyGovProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovNationalCardReceiveTrackingInquiryOutputParams", propOrder = {
    "myGovProfileInfo",
    "status"
})
public class MyGovNationalCardReceiveTrackingInquiryOutputParams {

    @XmlElement(name = "MyGovProfileInfo", nillable = true)
    protected MyGovProfileInfo myGovProfileInfo;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

    /**
     * Gets the value of the myGovProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public MyGovProfileInfo getMyGovProfileInfo() {
        return myGovProfileInfo;
    }

    /**
     * Sets the value of the myGovProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public void setMyGovProfileInfo(MyGovProfileInfo value) {
        this.myGovProfileInfo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
