
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficFinesInquiryGetImageOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficFinesInquiryGetImageOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlateImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFinesInquiryGetImageOutputParams", propOrder = {
    "plateImageUrl",
    "vehicleImageUrl"
})
public class TrafficFinesInquiryGetImageOutputParams {

    @XmlElement(name = "PlateImageUrl", nillable = true)
    protected String plateImageUrl;
    @XmlElement(name = "VehicleImageUrl", nillable = true)
    protected String vehicleImageUrl;

    /**
     * Gets the value of the plateImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateImageUrl() {
        return plateImageUrl;
    }

    /**
     * Sets the value of the plateImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateImageUrl(String value) {
        this.plateImageUrl = value;
    }

    /**
     * Gets the value of the vehicleImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    /**
     * Sets the value of the vehicleImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleImageUrl(String value) {
        this.vehicleImageUrl = value;
    }

}
