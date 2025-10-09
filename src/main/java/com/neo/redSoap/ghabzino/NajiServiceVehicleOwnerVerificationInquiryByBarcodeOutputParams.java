
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceVehicleOwnerVerificationInquiryByBarcodeOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceVehicleOwnerVerificationInquiryByBarcodeOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Otp" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceVehicleOwnerVerificationOtpStatus" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInfo" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceVehicleOwnerVerificationResultDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceVehicleOwnerVerificationInquiryByBarcodeOutputParams", propOrder = {
    "otp",
    "uniqueID",
    "vehicleInfo"
})
public class NajiServiceVehicleOwnerVerificationInquiryByBarcodeOutputParams {

    @XmlElement(name = "Otp", nillable = true)
    protected NajiServiceVehicleOwnerVerificationOtpStatus otp;
    @XmlElement(name = "UniqueID", nillable = true)
    protected String uniqueID;
    @XmlElement(name = "VehicleInfo", nillable = true)
    protected NajiServiceVehicleOwnerVerificationResultDetail vehicleInfo;

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceVehicleOwnerVerificationOtpStatus }
     *     
     */
    public NajiServiceVehicleOwnerVerificationOtpStatus getOtp() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceVehicleOwnerVerificationOtpStatus }
     *     
     */
    public void setOtp(NajiServiceVehicleOwnerVerificationOtpStatus value) {
        this.otp = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceVehicleOwnerVerificationResultDetail }
     *     
     */
    public NajiServiceVehicleOwnerVerificationResultDetail getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceVehicleOwnerVerificationResultDetail }
     *     
     */
    public void setVehicleInfo(NajiServiceVehicleOwnerVerificationResultDetail value) {
        this.vehicleInfo = value;
    }

}
