
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreewayTollBillInquiryDetailedOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreewayTollBillInquiryDetailedOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bills" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfFreewayTollBill" minOccurs="0"/&gt;
 *         &lt;element name="LockedByPolice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreewayTollBillInquiryDetailedOutputParams", propOrder = {
    "bills",
    "lockedByPolice",
    "plateNumber"
})
public class FreewayTollBillInquiryDetailedOutputParams {

    @XmlElement(name = "Bills", nillable = true)
    protected ArrayOfFreewayTollBill bills;
    @XmlElement(name = "LockedByPolice")
    protected Boolean lockedByPolice;
    @XmlElement(name = "PlateNumber", nillable = true)
    protected String plateNumber;

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFreewayTollBill }
     *     
     */
    public ArrayOfFreewayTollBill getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFreewayTollBill }
     *     
     */
    public void setBills(ArrayOfFreewayTollBill value) {
        this.bills = value;
    }

    /**
     * Gets the value of the lockedByPolice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedByPolice() {
        return lockedByPolice;
    }

    /**
     * Sets the value of the lockedByPolice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedByPolice(Boolean value) {
        this.lockedByPolice = value;
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

}
