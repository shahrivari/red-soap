
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicPrescriptionDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicPrescriptionDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DrugInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DrugStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurancePayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PatientPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PrescribedNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicPrescriptionDetailData", propOrder = {
    "deliveredDate",
    "deliveredNumber",
    "drugInstruction",
    "drugName",
    "drugStoreName",
    "insurancePayment",
    "patientPayment",
    "prescribedNumber",
    "totalPayment"
})
public class ElectronicPrescriptionDetailData {

    @XmlElement(name = "DeliveredDate", nillable = true)
    protected String deliveredDate;
    @XmlElement(name = "DeliveredNumber", nillable = true)
    protected String deliveredNumber;
    @XmlElement(name = "DrugInstruction", nillable = true)
    protected String drugInstruction;
    @XmlElement(name = "DrugName", nillable = true)
    protected String drugName;
    @XmlElement(name = "DrugStoreName", nillable = true)
    protected String drugStoreName;
    @XmlElement(name = "InsurancePayment")
    protected Long insurancePayment;
    @XmlElement(name = "PatientPayment")
    protected Long patientPayment;
    @XmlElement(name = "PrescribedNumber", nillable = true)
    protected String prescribedNumber;
    @XmlElement(name = "TotalPayment")
    protected Long totalPayment;

    /**
     * Gets the value of the deliveredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredDate() {
        return deliveredDate;
    }

    /**
     * Sets the value of the deliveredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredDate(String value) {
        this.deliveredDate = value;
    }

    /**
     * Gets the value of the deliveredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredNumber() {
        return deliveredNumber;
    }

    /**
     * Sets the value of the deliveredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredNumber(String value) {
        this.deliveredNumber = value;
    }

    /**
     * Gets the value of the drugInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugInstruction() {
        return drugInstruction;
    }

    /**
     * Sets the value of the drugInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugInstruction(String value) {
        this.drugInstruction = value;
    }

    /**
     * Gets the value of the drugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * Sets the value of the drugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugName(String value) {
        this.drugName = value;
    }

    /**
     * Gets the value of the drugStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugStoreName() {
        return drugStoreName;
    }

    /**
     * Sets the value of the drugStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugStoreName(String value) {
        this.drugStoreName = value;
    }

    /**
     * Gets the value of the insurancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsurancePayment() {
        return insurancePayment;
    }

    /**
     * Sets the value of the insurancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsurancePayment(Long value) {
        this.insurancePayment = value;
    }

    /**
     * Gets the value of the patientPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPatientPayment() {
        return patientPayment;
    }

    /**
     * Sets the value of the patientPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPatientPayment(Long value) {
        this.patientPayment = value;
    }

    /**
     * Gets the value of the prescribedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescribedNumber() {
        return prescribedNumber;
    }

    /**
     * Sets the value of the prescribedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescribedNumber(String value) {
        this.prescribedNumber = value;
    }

    /**
     * Gets the value of the totalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPayment() {
        return totalPayment;
    }

    /**
     * Sets the value of the totalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPayment(Long value) {
        this.totalPayment = value;
    }

}
