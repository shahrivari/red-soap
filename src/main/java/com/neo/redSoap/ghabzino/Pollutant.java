
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pollutant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pollutant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="O3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PM10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PM2_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pollutant", propOrder = {
    "co",
    "no2",
    "o3",
    "pm10",
    "pm25",
    "so2"
})
public class Pollutant {

    @XmlElement(name = "CO", nillable = true)
    protected String co;
    @XmlElement(name = "NO2", nillable = true)
    protected String no2;
    @XmlElement(name = "O3", nillable = true)
    protected String o3;
    @XmlElement(name = "PM10", nillable = true)
    protected String pm10;
    @XmlElement(name = "PM2_5", nillable = true)
    protected String pm25;
    @XmlElement(name = "SO2", nillable = true)
    protected String so2;

    /**
     * Gets the value of the co property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCO() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCO(String value) {
        this.co = value;
    }

    /**
     * Gets the value of the no2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNO2() {
        return no2;
    }

    /**
     * Sets the value of the no2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNO2(String value) {
        this.no2 = value;
    }

    /**
     * Gets the value of the o3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getO3() {
        return o3;
    }

    /**
     * Sets the value of the o3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setO3(String value) {
        this.o3 = value;
    }

    /**
     * Gets the value of the pm10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPM10() {
        return pm10;
    }

    /**
     * Sets the value of the pm10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPM10(String value) {
        this.pm10 = value;
    }

    /**
     * Gets the value of the pm25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPM25() {
        return pm25;
    }

    /**
     * Sets the value of the pm25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPM25(String value) {
        this.pm25 = value;
    }

    /**
     * Gets the value of the so2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSO2() {
        return so2;
    }

    /**
     * Sets the value of the so2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSO2(String value) {
        this.so2 = value;
    }

}
