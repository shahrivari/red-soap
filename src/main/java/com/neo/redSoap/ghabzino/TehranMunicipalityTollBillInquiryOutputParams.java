
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TehranMunicipalityTollBillInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TehranMunicipalityTollBillInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTehranMunicipalityTollBill" minOccurs="0"/&gt;
 *         &lt;element name="IdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TehranMunicipalityTollBillInquiryOutputParams", propOrder = {
    "bills",
    "identificationCode"
})
public class TehranMunicipalityTollBillInquiryOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfTehranMunicipalityTollBill bills;
    @XmlElement(name = "IdentificationCode", nillable = true)
    protected String identificationCode;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTehranMunicipalityTollBill }
     *     
     */
    public ArrayOfTehranMunicipalityTollBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTehranMunicipalityTollBill }
     *     
     */
    public void setBills(ArrayOfTehranMunicipalityTollBill value) {
        this.bills = value;
    }

    /**
     * Gets the value of the identificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Sets the value of the identificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationCode(String value) {
        this.identificationCode = value;
    }

}
