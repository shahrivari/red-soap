
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotorcycleTransferTaxInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotorcycleTransferTaxInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfCarTransferTaxBill" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleEngineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleFuelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotorcycleTransferTaxInquiryOutputParams", propOrder = {
    "bills",
    "ownerName",
    "vehicleChassisNumber",
    "vehicleEngineNumber",
    "vehicleFuelType",
    "vehicleModel",
    "vehicleSystem",
    "vehicleTip",
    "vehicleUsage"
})
public class MotorcycleTransferTaxInquiryOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfCarTransferTaxBill bills;
    @XmlElement(name = "OwnerName", nillable = true)
    protected String ownerName;
    @XmlElement(name = "VehicleChassisNumber", nillable = true)
    protected String vehicleChassisNumber;
    @XmlElement(name = "VehicleEngineNumber", nillable = true)
    protected String vehicleEngineNumber;
    @XmlElement(name = "VehicleFuelType", nillable = true)
    protected String vehicleFuelType;
    @XmlElement(name = "VehicleModel", nillable = true)
    protected String vehicleModel;
    @XmlElement(name = "VehicleSystem", nillable = true)
    protected String vehicleSystem;
    @XmlElement(name = "VehicleTip", nillable = true)
    protected String vehicleTip;
    @XmlElement(name = "VehicleUsage", nillable = true)
    protected String vehicleUsage;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarTransferTaxBill }
     *     
     */
    public ArrayOfCarTransferTaxBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarTransferTaxBill }
     *     
     */
    public void setBills(ArrayOfCarTransferTaxBill value) {
        this.bills = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the vehicleChassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleChassisNumber() {
        return vehicleChassisNumber;
    }

    /**
     * Sets the value of the vehicleChassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleChassisNumber(String value) {
        this.vehicleChassisNumber = value;
    }

    /**
     * Gets the value of the vehicleEngineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleEngineNumber() {
        return vehicleEngineNumber;
    }

    /**
     * Sets the value of the vehicleEngineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleEngineNumber(String value) {
        this.vehicleEngineNumber = value;
    }

    /**
     * Gets the value of the vehicleFuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFuelType() {
        return vehicleFuelType;
    }

    /**
     * Sets the value of the vehicleFuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFuelType(String value) {
        this.vehicleFuelType = value;
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
     * Gets the value of the vehicleSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleSystem() {
        return vehicleSystem;
    }

    /**
     * Sets the value of the vehicleSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleSystem(String value) {
        this.vehicleSystem = value;
    }

    /**
     * Gets the value of the vehicleTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTip() {
        return vehicleTip;
    }

    /**
     * Sets the value of the vehicleTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTip(String value) {
        this.vehicleTip = value;
    }

    /**
     * Gets the value of the vehicleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Sets the value of the vehicleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleUsage(String value) {
        this.vehicleUsage = value;
    }

}
