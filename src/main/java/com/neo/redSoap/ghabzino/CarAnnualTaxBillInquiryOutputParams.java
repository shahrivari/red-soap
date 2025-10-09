
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTaxBillInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTaxBillInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bill" type="{http://schemas.datacontract.org/2004/07/Core}CarAnnualTaxBill" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleFuelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CarAnnualTaxBillInquiryOutputParams", propOrder = {
    "bill",
    "fullName",
    "vehicleFuelType",
    "vehicleModel",
    "vehicleSystem",
    "vehicleUsage"
})
public class CarAnnualTaxBillInquiryOutputParams {

    @XmlElement(name = "Bill", nillable = true)
    protected CarAnnualTaxBill bill;
    @XmlElement(name = "FullName", nillable = true)
    protected String fullName;
    @XmlElement(name = "VehicleFuelType", nillable = true)
    protected String vehicleFuelType;
    @XmlElement(name = "VehicleModel", nillable = true)
    protected String vehicleModel;
    @XmlElement(name = "VehicleSystem", nillable = true)
    protected String vehicleSystem;
    @XmlElement(name = "VehicleUsage", nillable = true)
    protected String vehicleUsage;

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link CarAnnualTaxBill }
     *     
     */
    public CarAnnualTaxBill getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarAnnualTaxBill }
     *     
     */
    public void setBill(CarAnnualTaxBill value) {
        this.bill = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
