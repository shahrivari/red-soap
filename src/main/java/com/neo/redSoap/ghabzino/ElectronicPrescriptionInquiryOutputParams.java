
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicPrescriptionInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicPrescriptionInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElectronicPrescriptionCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicPrescriptionInquiryDataList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfElectronicPrescriptionData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicPrescriptionInquiryOutputParams", propOrder = {
    "electronicPrescriptionCount",
    "electronicPrescriptionInquiryDataList"
})
public class ElectronicPrescriptionInquiryOutputParams {

    @XmlElement(name = "ElectronicPrescriptionCount")
    protected Long electronicPrescriptionCount;
    @XmlElement(name = "ElectronicPrescriptionInquiryDataList", nillable = true)
    protected ArrayOfElectronicPrescriptionData electronicPrescriptionInquiryDataList;

    /**
     * Gets the value of the electronicPrescriptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElectronicPrescriptionCount() {
        return electronicPrescriptionCount;
    }

    /**
     * Sets the value of the electronicPrescriptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectronicPrescriptionCount(Long value) {
        this.electronicPrescriptionCount = value;
    }

    /**
     * Gets the value of the electronicPrescriptionInquiryDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectronicPrescriptionData }
     *     
     */
    public ArrayOfElectronicPrescriptionData getElectronicPrescriptionInquiryDataList() {
        return electronicPrescriptionInquiryDataList;
    }

    /**
     * Sets the value of the electronicPrescriptionInquiryDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectronicPrescriptionData }
     *     
     */
    public void setElectronicPrescriptionInquiryDataList(ArrayOfElectronicPrescriptionData value) {
        this.electronicPrescriptionInquiryDataList = value;
    }

}
