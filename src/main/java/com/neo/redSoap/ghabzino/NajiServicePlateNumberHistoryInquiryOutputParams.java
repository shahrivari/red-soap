
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServicePlateNumberHistoryInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServicePlateNumberHistoryInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlateHistory" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfNajiServicePlateNumberHistoryDetail" minOccurs="0"/&gt;
 *         &lt;element name="PlateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServicePlateNumberHistoryInquiryOutputParams", propOrder = {
    "plateHistory",
    "plateStatus",
    "traceNumber"
})
public class NajiServicePlateNumberHistoryInquiryOutputParams {

    @XmlElement(name = "PlateHistory", nillable = true)
    protected ArrayOfNajiServicePlateNumberHistoryDetail plateHistory;
    @XmlElement(name = "PlateStatus", nillable = true)
    protected String plateStatus;
    @XmlElement(name = "TraceNumber", nillable = true)
    protected String traceNumber;

    /**
     * Gets the value of the plateHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNajiServicePlateNumberHistoryDetail }
     *     
     */
    public ArrayOfNajiServicePlateNumberHistoryDetail getPlateHistory() {
        return plateHistory;
    }

    /**
     * Sets the value of the plateHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNajiServicePlateNumberHistoryDetail }
     *     
     */
    public void setPlateHistory(ArrayOfNajiServicePlateNumberHistoryDetail value) {
        this.plateHistory = value;
    }

    /**
     * Gets the value of the plateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateStatus() {
        return plateStatus;
    }

    /**
     * Sets the value of the plateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateStatus(String value) {
        this.plateStatus = value;
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

}
