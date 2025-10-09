
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceVehicleAuthenticityByBarcodeOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceVehicleAuthenticityByBarcodeOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenticityInfo" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceVehicleAuthenticityResultDetail" minOccurs="0"/&gt;
 *         &lt;element name="Otp" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceVehicleAuthenticityOtpStatus" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceVehicleAuthenticityByBarcodeOutputParams", propOrder = {
    "authenticityInfo",
    "otp",
    "uniqueID"
})
public class NajiServiceVehicleAuthenticityByBarcodeOutputParams {

    @XmlElement(name = "AuthenticityInfo", nillable = true)
    protected NajiServiceVehicleAuthenticityResultDetail authenticityInfo;
    @XmlElement(name = "Otp", nillable = true)
    protected NajiServiceVehicleAuthenticityOtpStatus otp;
    @XmlElement(name = "UniqueID", nillable = true)
    protected String uniqueID;

    /**
     * Gets the value of the authenticityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceVehicleAuthenticityResultDetail }
     *     
     */
    public NajiServiceVehicleAuthenticityResultDetail getAuthenticityInfo() {
        return authenticityInfo;
    }

    /**
     * Sets the value of the authenticityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceVehicleAuthenticityResultDetail }
     *     
     */
    public void setAuthenticityInfo(NajiServiceVehicleAuthenticityResultDetail value) {
        this.authenticityInfo = value;
    }

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceVehicleAuthenticityOtpStatus }
     *     
     */
    public NajiServiceVehicleAuthenticityOtpStatus getOtp() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceVehicleAuthenticityOtpStatus }
     *     
     */
    public void setOtp(NajiServiceVehicleAuthenticityOtpStatus value) {
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

}
