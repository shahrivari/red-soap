
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServicePlateNumberHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServicePlateNumberHistoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetachDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServicePlateNumberHistoryDetail", propOrder = {
    "attachDate",
    "detachDate",
    "vehicleBrand",
    "vehicleModel",
    "vehicleType"
})
public class NajiServicePlateNumberHistoryDetail {

    @XmlElement(name = "AttachDate", nillable = true)
    protected String attachDate;
    @XmlElement(name = "DetachDate", nillable = true)
    protected String detachDate;
    @XmlElement(name = "VehicleBrand", nillable = true)
    protected String vehicleBrand;
    @XmlElement(name = "VehicleModel", nillable = true)
    protected String vehicleModel;
    @XmlElement(name = "VehicleType", nillable = true)
    protected String vehicleType;

    /**
     * Gets the value of the attachDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachDate() {
        return attachDate;
    }

    /**
     * Sets the value of the attachDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachDate(String value) {
        this.attachDate = value;
    }

    /**
     * Gets the value of the detachDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetachDate() {
        return detachDate;
    }

    /**
     * Sets the value of the detachDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetachDate(String value) {
        this.detachDate = value;
    }

    /**
     * Gets the value of the vehicleBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * Sets the value of the vehicleBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBrand(String value) {
        this.vehicleBrand = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

}
