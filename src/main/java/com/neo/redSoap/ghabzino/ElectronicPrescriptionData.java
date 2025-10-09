
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicPrescriptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicPrescriptionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClinicDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoctorSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicPrescriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PatientNationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrescriptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrescriptionDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrescriptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrescriptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicPrescriptionData", propOrder = {
    "clinicDoctorID",
    "doctorID",
    "doctorName",
    "doctorSpecialty",
    "electronicPrescriptionID",
    "extraInfo",
    "location",
    "patientName",
    "patientNationalID",
    "prescriptionDate",
    "prescriptionDateTime",
    "prescriptionName",
    "prescriptionType",
    "trackingCode"
})
public class ElectronicPrescriptionData {

    @XmlElement(name = "ClinicDoctorID", nillable = true)
    protected String clinicDoctorID;
    @XmlElement(name = "DoctorID", nillable = true)
    protected String doctorID;
    @XmlElement(name = "DoctorName", nillable = true)
    protected String doctorName;
    @XmlElement(name = "DoctorSpecialty", nillable = true)
    protected String doctorSpecialty;
    @XmlElement(name = "ElectronicPrescriptionID", nillable = true)
    protected String electronicPrescriptionID;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "PatientName", nillable = true)
    protected String patientName;
    @XmlElement(name = "PatientNationalID", nillable = true)
    protected String patientNationalID;
    @XmlElement(name = "PrescriptionDate", nillable = true)
    protected String prescriptionDate;
    @XmlElement(name = "PrescriptionDateTime", nillable = true)
    protected String prescriptionDateTime;
    @XmlElement(name = "PrescriptionName", nillable = true)
    protected String prescriptionName;
    @XmlElement(name = "PrescriptionType", nillable = true)
    protected String prescriptionType;
    @XmlElement(name = "TrackingCode", nillable = true)
    protected String trackingCode;

    /**
     * Gets the value of the clinicDoctorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicDoctorID() {
        return clinicDoctorID;
    }

    /**
     * Sets the value of the clinicDoctorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicDoctorID(String value) {
        this.clinicDoctorID = value;
    }

    /**
     * Gets the value of the doctorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * Sets the value of the doctorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorID(String value) {
        this.doctorID = value;
    }

    /**
     * Gets the value of the doctorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * Sets the value of the doctorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorName(String value) {
        this.doctorName = value;
    }

    /**
     * Gets the value of the doctorSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    /**
     * Sets the value of the doctorSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorSpecialty(String value) {
        this.doctorSpecialty = value;
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
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the patientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * Sets the value of the patientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientName(String value) {
        this.patientName = value;
    }

    /**
     * Gets the value of the patientNationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientNationalID() {
        return patientNationalID;
    }

    /**
     * Sets the value of the patientNationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientNationalID(String value) {
        this.patientNationalID = value;
    }

    /**
     * Gets the value of the prescriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the value of the prescriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionDate(String value) {
        this.prescriptionDate = value;
    }

    /**
     * Gets the value of the prescriptionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionDateTime() {
        return prescriptionDateTime;
    }

    /**
     * Sets the value of the prescriptionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionDateTime(String value) {
        this.prescriptionDateTime = value;
    }

    /**
     * Gets the value of the prescriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionName() {
        return prescriptionName;
    }

    /**
     * Sets the value of the prescriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionName(String value) {
        this.prescriptionName = value;
    }

    /**
     * Gets the value of the prescriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionType() {
        return prescriptionType;
    }

    /**
     * Sets the value of the prescriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionType(String value) {
        this.prescriptionType = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCode(String value) {
        this.trackingCode = value;
    }

}
