
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaminUnderCoveredInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaminUnderCoveredInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnderCovered" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTaminUnderCoveredInquiryDetailResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaminUnderCoveredInquiryOutputParams", propOrder = {
    "totalCount",
    "underCovered"
})
public class TaminUnderCoveredInquiryOutputParams {

    @XmlElement(name = "TotalCount")
    protected Long totalCount;
    @XmlElement(name = "UnderCovered", nillable = true)
    protected ArrayOfTaminUnderCoveredInquiryDetailResult underCovered;

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCount(Long value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the underCovered property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaminUnderCoveredInquiryDetailResult }
     *     
     */
    public ArrayOfTaminUnderCoveredInquiryDetailResult getUnderCovered() {
        return underCovered;
    }

    /**
     * Sets the value of the underCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaminUnderCoveredInquiryDetailResult }
     *     
     */
    public void setUnderCovered(ArrayOfTaminUnderCoveredInquiryDetailResult value) {
        this.underCovered = value;
    }

}
