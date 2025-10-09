
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirPollutionIndexOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPollutionIndexOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AQI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AQIStatus" type="{http://schemas.datacontract.org/2004/07/Core}AQIStatus" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pollutant" type="{http://schemas.datacontract.org/2004/07/Core}Pollutant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPollutionIndexOutput", propOrder = {
    "aqi",
    "aqiStatus",
    "cityName",
    "cityShowName",
    "pollutant"
})
public class AirPollutionIndexOutput {

    @XmlElement(name = "AQI")
    protected Long aqi;
    @XmlElement(name = "AQIStatus", nillable = true)
    protected AQIStatus aqiStatus;
    @XmlElement(name = "CityName", nillable = true)
    protected String cityName;
    @XmlElement(name = "CityShowName", nillable = true)
    protected String cityShowName;
    @XmlElement(name = "Pollutant", nillable = true)
    protected Pollutant pollutant;

    /**
     * Gets the value of the aqi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAQI() {
        return aqi;
    }

    /**
     * Sets the value of the aqi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAQI(Long value) {
        this.aqi = value;
    }

    /**
     * Gets the value of the aqiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AQIStatus }
     *     
     */
    public AQIStatus getAQIStatus() {
        return aqiStatus;
    }

    /**
     * Sets the value of the aqiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AQIStatus }
     *     
     */
    public void setAQIStatus(AQIStatus value) {
        this.aqiStatus = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the cityShowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityShowName() {
        return cityShowName;
    }

    /**
     * Sets the value of the cityShowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityShowName(String value) {
        this.cityShowName = value;
    }

    /**
     * Gets the value of the pollutant property.
     * 
     * @return
     *     possible object is
     *     {@link Pollutant }
     *     
     */
    public Pollutant getPollutant() {
        return pollutant;
    }

    /**
     * Sets the value of the pollutant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pollutant }
     *     
     */
    public void setPollutant(Pollutant value) {
        this.pollutant = value;
    }

}
