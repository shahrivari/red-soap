
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpPaymentInfoExtraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpPaymentInfoExtraInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GregorianDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersianDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpPaymentInfoExtraInfo", propOrder = {
    "cardPAN",
    "gregorianDateTime",
    "persianDateTime",
    "traceNumber"
})
public class TopUpPaymentInfoExtraInfo {

    @XmlElement(name = "CardPAN", nillable = true)
    protected String cardPAN;
    @XmlElement(name = "GregorianDateTime", nillable = true)
    protected String gregorianDateTime;
    @XmlElement(name = "PersianDateTime", nillable = true)
    protected String persianDateTime;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;

    /**
     * Gets the value of the cardPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPAN() {
        return cardPAN;
    }

    /**
     * Sets the value of the cardPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPAN(String value) {
        this.cardPAN = value;
    }

    /**
     * Gets the value of the gregorianDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGregorianDateTime() {
        return gregorianDateTime;
    }

    /**
     * Sets the value of the gregorianDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGregorianDateTime(String value) {
        this.gregorianDateTime = value;
    }

    /**
     * Gets the value of the persianDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersianDateTime() {
        return persianDateTime;
    }

    /**
     * Sets the value of the persianDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersianDateTime(String value) {
        this.persianDateTime = value;
    }

    /**
     * Gets the value of the traceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Sets the value of the traceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

}
