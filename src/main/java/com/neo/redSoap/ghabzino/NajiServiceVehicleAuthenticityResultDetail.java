
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceVehicleAuthenticityResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceVehicleAuthenticityResultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Debt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DebtFreewayTolls" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DebtFreewayTollsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebtStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebtTax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DebtTaxStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactoryWarrantyEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactoryWarrantyStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactoryWarrantyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceVehicleAuthenticityInsuranceInfo" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDiagnosisFuelSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDiagnosisValidityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceVehicleAuthenticityResultDetail", propOrder = {
    "color",
    "debt",
    "debtFreewayTolls",
    "debtFreewayTollsStatus",
    "debtStatus",
    "debtTax",
    "debtTaxStatus",
    "factoryWarrantyEndDate",
    "factoryWarrantyStartDate",
    "factoryWarrantyStatus",
    "fuel",
    "insurance",
    "model",
    "ownershipChanged",
    "status",
    "technicalDiagnosisFuelSystem",
    "technicalDiagnosisStatus",
    "technicalDiagnosisValidityDate",
    "tip",
    "type",
    "usage"
})
public class NajiServiceVehicleAuthenticityResultDetail {

    @XmlElement(name = "Color", nillable = true)
    protected String color;
    @XmlElement(name = "Debt")
    protected Long debt;
    @XmlElement(name = "DebtFreewayTolls")
    protected Long debtFreewayTolls;
    @XmlElement(name = "DebtFreewayTollsStatus", nillable = true)
    protected String debtFreewayTollsStatus;
    @XmlElement(name = "DebtStatus", nillable = true)
    protected String debtStatus;
    @XmlElement(name = "DebtTax")
    protected Long debtTax;
    @XmlElement(name = "DebtTaxStatus", nillable = true)
    protected String debtTaxStatus;
    @XmlElement(name = "FactoryWarrantyEndDate", nillable = true)
    protected String factoryWarrantyEndDate;
    @XmlElement(name = "FactoryWarrantyStartDate", nillable = true)
    protected String factoryWarrantyStartDate;
    @XmlElement(name = "FactoryWarrantyStatus", nillable = true)
    protected String factoryWarrantyStatus;
    @XmlElement(name = "Fuel", nillable = true)
    protected String fuel;
    @XmlElement(name = "Insurance", nillable = true)
    protected NajiServiceVehicleAuthenticityInsuranceInfo insurance;
    @XmlElement(name = "Model", nillable = true)
    protected String model;
    @XmlElement(name = "OwnershipChanged", nillable = true)
    protected String ownershipChanged;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "TechnicalDiagnosisFuelSystem", nillable = true)
    protected String technicalDiagnosisFuelSystem;
    @XmlElement(name = "TechnicalDiagnosisStatus", nillable = true)
    protected String technicalDiagnosisStatus;
    @XmlElement(name = "TechnicalDiagnosisValidityDate", nillable = true)
    protected String technicalDiagnosisValidityDate;
    @XmlElement(name = "Tip", nillable = true)
    protected String tip;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "Usage", nillable = true)
    protected String usage;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebt(Long value) {
        this.debt = value;
    }

    /**
     * Gets the value of the debtFreewayTolls property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtFreewayTolls() {
        return debtFreewayTolls;
    }

    /**
     * Sets the value of the debtFreewayTolls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtFreewayTolls(Long value) {
        this.debtFreewayTolls = value;
    }

    /**
     * Gets the value of the debtFreewayTollsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtFreewayTollsStatus() {
        return debtFreewayTollsStatus;
    }

    /**
     * Sets the value of the debtFreewayTollsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtFreewayTollsStatus(String value) {
        this.debtFreewayTollsStatus = value;
    }

    /**
     * Gets the value of the debtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtStatus() {
        return debtStatus;
    }

    /**
     * Sets the value of the debtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtStatus(String value) {
        this.debtStatus = value;
    }

    /**
     * Gets the value of the debtTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtTax() {
        return debtTax;
    }

    /**
     * Sets the value of the debtTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtTax(Long value) {
        this.debtTax = value;
    }

    /**
     * Gets the value of the debtTaxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtTaxStatus() {
        return debtTaxStatus;
    }

    /**
     * Sets the value of the debtTaxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtTaxStatus(String value) {
        this.debtTaxStatus = value;
    }

    /**
     * Gets the value of the factoryWarrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryWarrantyEndDate() {
        return factoryWarrantyEndDate;
    }

    /**
     * Sets the value of the factoryWarrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryWarrantyEndDate(String value) {
        this.factoryWarrantyEndDate = value;
    }

    /**
     * Gets the value of the factoryWarrantyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryWarrantyStartDate() {
        return factoryWarrantyStartDate;
    }

    /**
     * Sets the value of the factoryWarrantyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryWarrantyStartDate(String value) {
        this.factoryWarrantyStartDate = value;
    }

    /**
     * Gets the value of the factoryWarrantyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryWarrantyStatus() {
        return factoryWarrantyStatus;
    }

    /**
     * Sets the value of the factoryWarrantyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryWarrantyStatus(String value) {
        this.factoryWarrantyStatus = value;
    }

    /**
     * Gets the value of the fuel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuel(String value) {
        this.fuel = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceVehicleAuthenticityInsuranceInfo }
     *     
     */
    public NajiServiceVehicleAuthenticityInsuranceInfo getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceVehicleAuthenticityInsuranceInfo }
     *     
     */
    public void setInsurance(NajiServiceVehicleAuthenticityInsuranceInfo value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the ownershipChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipChanged() {
        return ownershipChanged;
    }

    /**
     * Sets the value of the ownershipChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipChanged(String value) {
        this.ownershipChanged = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the technicalDiagnosisFuelSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalDiagnosisFuelSystem() {
        return technicalDiagnosisFuelSystem;
    }

    /**
     * Sets the value of the technicalDiagnosisFuelSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalDiagnosisFuelSystem(String value) {
        this.technicalDiagnosisFuelSystem = value;
    }

    /**
     * Gets the value of the technicalDiagnosisStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalDiagnosisStatus() {
        return technicalDiagnosisStatus;
    }

    /**
     * Sets the value of the technicalDiagnosisStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalDiagnosisStatus(String value) {
        this.technicalDiagnosisStatus = value;
    }

    /**
     * Gets the value of the technicalDiagnosisValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalDiagnosisValidityDate() {
        return technicalDiagnosisValidityDate;
    }

    /**
     * Sets the value of the technicalDiagnosisValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalDiagnosisValidityDate(String value) {
        this.technicalDiagnosisValidityDate = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTip(String value) {
        this.tip = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

}
