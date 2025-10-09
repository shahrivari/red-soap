
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceCarIdentificationDocumentsStatusInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceCarIdentificationDocumentsStatusInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuanceDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardPostalBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentIssuanceDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentPostalBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCardSmart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceCarIdentificationDocumentsStatusInquiryOutputParams", propOrder = {
    "cardDateTime",
    "cardIssuanceDateTime",
    "cardPostalBarcode",
    "cardTitle",
    "cardType",
    "documentDateTime",
    "documentIssuanceDateTime",
    "documentPostalBarcode",
    "documentTitle",
    "documentType",
    "isCardSmart",
    "plateNumber"
})
public class NajiServiceCarIdentificationDocumentsStatusInquiryOutputParams {

    @XmlElement(name = "CardDateTime", nillable = true)
    protected String cardDateTime;
    @XmlElement(name = "CardIssuanceDateTime", nillable = true)
    protected String cardIssuanceDateTime;
    @XmlElement(name = "CardPostalBarcode", nillable = true)
    protected String cardPostalBarcode;
    @XmlElement(name = "CardTitle", nillable = true)
    protected String cardTitle;
    @XmlElement(name = "CardType", nillable = true)
    protected String cardType;
    @XmlElement(name = "DocumentDateTime", nillable = true)
    protected String documentDateTime;
    @XmlElement(name = "DocumentIssuanceDateTime", nillable = true)
    protected String documentIssuanceDateTime;
    @XmlElement(name = "DocumentPostalBarcode", nillable = true)
    protected String documentPostalBarcode;
    @XmlElement(name = "DocumentTitle", nillable = true)
    protected String documentTitle;
    @XmlElement(name = "DocumentType", nillable = true)
    protected String documentType;
    @XmlElement(name = "IsCardSmart")
    protected Boolean isCardSmart;
    @XmlElement(name = "PlateNumber", nillable = true)
    protected String plateNumber;

    /**
     * Gets the value of the cardDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDateTime() {
        return cardDateTime;
    }

    /**
     * Sets the value of the cardDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDateTime(String value) {
        this.cardDateTime = value;
    }

    /**
     * Gets the value of the cardIssuanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuanceDateTime() {
        return cardIssuanceDateTime;
    }

    /**
     * Sets the value of the cardIssuanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuanceDateTime(String value) {
        this.cardIssuanceDateTime = value;
    }

    /**
     * Gets the value of the cardPostalBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPostalBarcode() {
        return cardPostalBarcode;
    }

    /**
     * Sets the value of the cardPostalBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPostalBarcode(String value) {
        this.cardPostalBarcode = value;
    }

    /**
     * Gets the value of the cardTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTitle() {
        return cardTitle;
    }

    /**
     * Sets the value of the cardTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTitle(String value) {
        this.cardTitle = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the documentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /**
     * Sets the value of the documentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateTime(String value) {
        this.documentDateTime = value;
    }

    /**
     * Gets the value of the documentIssuanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssuanceDateTime() {
        return documentIssuanceDateTime;
    }

    /**
     * Sets the value of the documentIssuanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssuanceDateTime(String value) {
        this.documentIssuanceDateTime = value;
    }

    /**
     * Gets the value of the documentPostalBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentPostalBarcode() {
        return documentPostalBarcode;
    }

    /**
     * Sets the value of the documentPostalBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentPostalBarcode(String value) {
        this.documentPostalBarcode = value;
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the isCardSmart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCardSmart() {
        return isCardSmart;
    }

    /**
     * Sets the value of the isCardSmart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCardSmart(Boolean value) {
        this.isCardSmart = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

}
