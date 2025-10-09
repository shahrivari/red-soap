
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceEducationalExemptionInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceEducationalExemptionInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EducationalExemptionInfo" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceEducationalExemptionInquiryOutputParamsDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceEducationalExemptionInquiryOutputParams", propOrder = {
    "dataFound",
    "description",
    "educationalExemptionInfo"
})
public class NajiServiceEducationalExemptionInquiryOutputParams {

    @XmlElement(name = "DataFound")
    protected Boolean dataFound;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EducationalExemptionInfo", nillable = true)
    protected NajiServiceEducationalExemptionInquiryOutputParamsDetail educationalExemptionInfo;

    /**
     * Gets the value of the dataFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataFound() {
        return dataFound;
    }

    /**
     * Sets the value of the dataFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataFound(Boolean value) {
        this.dataFound = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the educationalExemptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NajiServiceEducationalExemptionInquiryOutputParamsDetail }
     *     
     */
    public NajiServiceEducationalExemptionInquiryOutputParamsDetail getEducationalExemptionInfo() {
        return educationalExemptionInfo;
    }

    /**
     * Sets the value of the educationalExemptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NajiServiceEducationalExemptionInquiryOutputParamsDetail }
     *     
     */
    public void setEducationalExemptionInfo(NajiServiceEducationalExemptionInquiryOutputParamsDetail value) {
        this.educationalExemptionInfo = value;
    }

}
