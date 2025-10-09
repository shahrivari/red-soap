
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardPostBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail", propOrder = {
    "cardDate",
    "cardIssueDate",
    "cardNumber",
    "cardPostBarcode",
    "dispatchDate",
    "releaseDate"
})
public class NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail {

    @XmlElement(name = "CardDate", nillable = true)
    protected String cardDate;
    @XmlElement(name = "CardIssueDate", nillable = true)
    protected String cardIssueDate;
    @XmlElement(name = "CardNumber", nillable = true)
    protected String cardNumber;
    @XmlElement(name = "CardPostBarcode", nillable = true)
    protected String cardPostBarcode;
    @XmlElement(name = "DispatchDate", nillable = true)
    protected String dispatchDate;
    @XmlElement(name = "ReleaseDate", nillable = true)
    protected String releaseDate;

    /**
     * Gets the value of the cardDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDate() {
        return cardDate;
    }

    /**
     * Sets the value of the cardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDate(String value) {
        this.cardDate = value;
    }

    /**
     * Gets the value of the cardIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueDate() {
        return cardIssueDate;
    }

    /**
     * Sets the value of the cardIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueDate(String value) {
        this.cardIssueDate = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardPostBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPostBarcode() {
        return cardPostBarcode;
    }

    /**
     * Sets the value of the cardPostBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPostBarcode(String value) {
        this.cardPostBarcode = value;
    }

    /**
     * Gets the value of the dispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchDate() {
        return dispatchDate;
    }

    /**
     * Sets the value of the dispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchDate(String value) {
        this.dispatchDate = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

}
