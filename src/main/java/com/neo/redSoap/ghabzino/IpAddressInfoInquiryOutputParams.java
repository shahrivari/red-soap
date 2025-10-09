
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpAddressInfoInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IpAddressInfoInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAddressInfoInquiryOutputParams", propOrder = {
    "countryID",
    "countryName",
    "ispName"
})
public class IpAddressInfoInquiryOutputParams {

    @XmlElement(name = "CountryID", nillable = true)
    protected String countryID;
    @XmlElement(name = "CountryName", nillable = true)
    protected String countryName;
    @XmlElement(name = "ISPName", nillable = true)
    protected String ispName;

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryID(String value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the ispName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPName() {
        return ispName;
    }

    /**
     * Sets the value of the ispName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPName(String value) {
        this.ispName = value;
    }

}
