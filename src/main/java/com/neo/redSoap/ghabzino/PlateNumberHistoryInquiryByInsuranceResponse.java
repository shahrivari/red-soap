
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
 *         &lt;element name="PlateNumberHistoryInquiryByInsuranceResult" type="{http://schemas.datacontract.org/2004/07/Core}PlateNumberHistoryInquiryByInsuranceOutput" minOccurs="0"/&gt;
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
    "plateNumberHistoryInquiryByInsuranceResult"
})
@XmlRootElement(name = "PlateNumberHistoryInquiryByInsuranceResponse", namespace = "http://tempuri.org/")
public class PlateNumberHistoryInquiryByInsuranceResponse {

    @XmlElement(name = "PlateNumberHistoryInquiryByInsuranceResult", namespace = "http://tempuri.org/", nillable = true)
    protected PlateNumberHistoryInquiryByInsuranceOutput plateNumberHistoryInquiryByInsuranceResult;

    /**
     * Gets the value of the plateNumberHistoryInquiryByInsuranceResult property.
     * 
     * @return
     *     possible object is
     *     {@link PlateNumberHistoryInquiryByInsuranceOutput }
     *     
     */
    public PlateNumberHistoryInquiryByInsuranceOutput getPlateNumberHistoryInquiryByInsuranceResult() {
        return plateNumberHistoryInquiryByInsuranceResult;
    }

    /**
     * Sets the value of the plateNumberHistoryInquiryByInsuranceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlateNumberHistoryInquiryByInsuranceOutput }
     *     
     */
    public void setPlateNumberHistoryInquiryByInsuranceResult(PlateNumberHistoryInquiryByInsuranceOutput value) {
        this.plateNumberHistoryInquiryByInsuranceResult = value;
    }

}
