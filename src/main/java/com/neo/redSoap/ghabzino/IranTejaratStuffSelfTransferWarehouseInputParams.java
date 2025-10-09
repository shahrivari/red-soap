
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratStuffSelfTransferWarehouseInputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratStuffSelfTransferWarehouseInputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StuffList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfIranTejaratStuffForTransfer" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarehousePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratStuffSelfTransferWarehouseInputParams", propOrder = {
    "consumerName",
    "mobileNumber",
    "nationalID",
    "stuffList",
    "traceNumber",
    "userName",
    "userRoleCode",
    "vehicleDocumentNumber",
    "warehousePostalCode"
})
public class IranTejaratStuffSelfTransferWarehouseInputParams {

    @XmlElement(name = "ConsumerName", nillable = true)
    protected String consumerName;
    @XmlElement(name = "MobileNumber", nillable = true)
    protected String mobileNumber;
    @XmlElement(name = "NationalID", nillable = true)
    protected String nationalID;
    @XmlElement(name = "StuffList", nillable = true)
    protected ArrayOfIranTejaratStuffForTransfer stuffList;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;
    @XmlElement(name = "UserName", nillable = true)
    protected String userName;
    @XmlElement(name = "UserRoleCode", nillable = true)
    protected String userRoleCode;
    @XmlElement(name = "VehicleDocumentNumber", nillable = true)
    protected String vehicleDocumentNumber;
    @XmlElement(name = "WarehousePostalCode", nillable = true)
    protected String warehousePostalCode;

    /**
     * Gets the value of the consumerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerName() {
        return consumerName;
    }

    /**
     * Sets the value of the consumerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerName(String value) {
        this.consumerName = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalID(String value) {
        this.nationalID = value;
    }

    /**
     * Gets the value of the stuffList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIranTejaratStuffForTransfer }
     *     
     */
    public ArrayOfIranTejaratStuffForTransfer getStuffList() {
        return stuffList;
    }

    /**
     * Sets the value of the stuffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIranTejaratStuffForTransfer }
     *     
     */
    public void setStuffList(ArrayOfIranTejaratStuffForTransfer value) {
        this.stuffList = value;
    }

    /**
     * Gets the value of the traceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Sets the value of the traceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleCode() {
        return userRoleCode;
    }

    /**
     * Sets the value of the userRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleCode(String value) {
        this.userRoleCode = value;
    }

    /**
     * Gets the value of the vehicleDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDocumentNumber() {
        return vehicleDocumentNumber;
    }

    /**
     * Sets the value of the vehicleDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDocumentNumber(String value) {
        this.vehicleDocumentNumber = value;
    }

    /**
     * Gets the value of the warehousePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehousePostalCode() {
        return warehousePostalCode;
    }

    /**
     * Sets the value of the warehousePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehousePostalCode(String value) {
        this.warehousePostalCode = value;
    }

}
