
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateTransactionsByKhodnevisInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateTransactionsByKhodnevisInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PdfUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateTransactionsByKhodnevisInquiryOutputParams", propOrder = {
    "pdfUrl"
})
public class RealEstateTransactionsByKhodnevisInquiryOutputParams {

    @XmlElement(name = "PdfUrl", nillable = true)
    protected String pdfUrl;

    /**
     * Gets the value of the pdfUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * Sets the value of the pdfUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfUrl(String value) {
        this.pdfUrl = value;
    }

}
