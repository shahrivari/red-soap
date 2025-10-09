
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyInsuranceVehicleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyInsuranceVehicleInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentOnDriverLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentOnFinancialLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentOnHealthLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastYearInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearsWithoutDriverLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearsWithoutFinancialLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearsWithoutHealthLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyInsuranceVehicleInfo", propOrder = {
    "chassisNumber",
    "discountPercentOnDriverLoss",
    "discountPercentOnFinancialLoss",
    "discountPercentOnHealthLoss",
    "engineNumber",
    "lastYearInsuranceNumber",
    "plateNumber",
    "vin",
    "vehicleName",
    "yearsWithoutDriverLoss",
    "yearsWithoutFinancialLoss",
    "yearsWithoutHealthLoss"
})
public class ThirdPartyInsuranceVehicleInfo {

    @XmlElement(name = "ChassisNumber", nillable = true)
    protected String chassisNumber;
    @XmlElement(name = "DiscountPercentOnDriverLoss", nillable = true)
    protected String discountPercentOnDriverLoss;
    @XmlElement(name = "DiscountPercentOnFinancialLoss", nillable = true)
    protected String discountPercentOnFinancialLoss;
    @XmlElement(name = "DiscountPercentOnHealthLoss", nillable = true)
    protected String discountPercentOnHealthLoss;
    @XmlElement(name = "EngineNumber", nillable = true)
    protected String engineNumber;
    @XmlElement(name = "LastYearInsuranceNumber", nillable = true)
    protected String lastYearInsuranceNumber;
    @XmlElement(name = "PlateNumber", nillable = true)
    protected String plateNumber;
    @XmlElement(name = "VIN", nillable = true)
    protected String vin;
    @XmlElement(name = "VehicleName", nillable = true)
    protected String vehicleName;
    @XmlElement(name = "YearsWithoutDriverLoss", nillable = true)
    protected String yearsWithoutDriverLoss;
    @XmlElement(name = "YearsWithoutFinancialLoss", nillable = true)
    protected String yearsWithoutFinancialLoss;
    @XmlElement(name = "YearsWithoutHealthLoss", nillable = true)
    protected String yearsWithoutHealthLoss;

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the discountPercentOnDriverLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentOnDriverLoss() {
        return discountPercentOnDriverLoss;
    }

    /**
     * Sets the value of the discountPercentOnDriverLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentOnDriverLoss(String value) {
        this.discountPercentOnDriverLoss = value;
    }

    /**
     * Gets the value of the discountPercentOnFinancialLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentOnFinancialLoss() {
        return discountPercentOnFinancialLoss;
    }

    /**
     * Sets the value of the discountPercentOnFinancialLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentOnFinancialLoss(String value) {
        this.discountPercentOnFinancialLoss = value;
    }

    /**
     * Gets the value of the discountPercentOnHealthLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentOnHealthLoss() {
        return discountPercentOnHealthLoss;
    }

    /**
     * Sets the value of the discountPercentOnHealthLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentOnHealthLoss(String value) {
        this.discountPercentOnHealthLoss = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the lastYearInsuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastYearInsuranceNumber() {
        return lastYearInsuranceNumber;
    }

    /**
     * Sets the value of the lastYearInsuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastYearInsuranceNumber(String value) {
        this.lastYearInsuranceNumber = value;
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

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the vehicleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * Sets the value of the vehicleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleName(String value) {
        this.vehicleName = value;
    }

    /**
     * Gets the value of the yearsWithoutDriverLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsWithoutDriverLoss() {
        return yearsWithoutDriverLoss;
    }

    /**
     * Sets the value of the yearsWithoutDriverLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsWithoutDriverLoss(String value) {
        this.yearsWithoutDriverLoss = value;
    }

    /**
     * Gets the value of the yearsWithoutFinancialLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsWithoutFinancialLoss() {
        return yearsWithoutFinancialLoss;
    }

    /**
     * Sets the value of the yearsWithoutFinancialLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsWithoutFinancialLoss(String value) {
        this.yearsWithoutFinancialLoss = value;
    }

    /**
     * Gets the value of the yearsWithoutHealthLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsWithoutHealthLoss() {
        return yearsWithoutHealthLoss;
    }

    /**
     * Sets the value of the yearsWithoutHealthLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsWithoutHealthLoss(String value) {
        this.yearsWithoutHealthLoss = value;
    }

}
