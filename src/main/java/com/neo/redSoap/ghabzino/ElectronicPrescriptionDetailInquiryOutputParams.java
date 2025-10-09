
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicPrescriptionDetailInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicPrescriptionDetailInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElectronicPrescriptionDetailList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfElectronicPrescriptionDetailData" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicPrescriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicPrescriptionPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsurancePayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PatientPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrescriptionDetailCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicPrescriptionDetailInquiryOutputParams", propOrder = {
    "electronicPrescriptionDetailList",
    "electronicPrescriptionID",
    "electronicPrescriptionPDF",
    "insurancePayment",
    "patientPayment",
    "totalPayment",
    "totalPrescriptionDetailCount"
})
public class ElectronicPrescriptionDetailInquiryOutputParams {

    @XmlElement(name = "ElectronicPrescriptionDetailList", nillable = true)
    protected ArrayOfElectronicPrescriptionDetailData electronicPrescriptionDetailList;
    @XmlElement(name = "ElectronicPrescriptionID", nillable = true)
    protected String electronicPrescriptionID;
    @XmlElement(name = "ElectronicPrescriptionPDF", nillable = true)
    protected String electronicPrescriptionPDF;
    @XmlElement(name = "InsurancePayment")
    protected Long insurancePayment;
    @XmlElement(name = "PatientPayment")
    protected Long patientPayment;
    @XmlElement(name = "TotalPayment")
    protected Long totalPayment;
    @XmlElement(name = "TotalPrescriptionDetailCount")
    protected Long totalPrescriptionDetailCount;

    /**
     * Gets the value of the electronicPrescriptionDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectronicPrescriptionDetailData }
     *     
     */
    public ArrayOfElectronicPrescriptionDetailData getElectronicPrescriptionDetailList() {
        return electronicPrescriptionDetailList;
    }

    /**
     * Sets the value of the electronicPrescriptionDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectronicPrescriptionDetailData }
     *     
     */
    public void setElectronicPrescriptionDetailList(ArrayOfElectronicPrescriptionDetailData value) {
        this.electronicPrescriptionDetailList = value;
    }

    /**
     * Gets the value of the electronicPrescriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicPrescriptionID() {
        return electronicPrescriptionID;
    }

    /**
     * Sets the value of the electronicPrescriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicPrescriptionID(String value) {
        this.electronicPrescriptionID = value;
    }

    /**
     * Gets the value of the electronicPrescriptionPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicPrescriptionPDF() {
        return electronicPrescriptionPDF;
    }

    /**
     * Sets the value of the electronicPrescriptionPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicPrescriptionPDF(String value) {
        this.electronicPrescriptionPDF = value;
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

    /**
     * Gets the value of the totalPrescriptionDetailCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPrescriptionDetailCount() {
        return totalPrescriptionDetailCount;
    }

    /**
     * Sets the value of the totalPrescriptionDetailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPrescriptionDetailCount(Long value) {
        this.totalPrescriptionDetailCount = value;
    }

}
