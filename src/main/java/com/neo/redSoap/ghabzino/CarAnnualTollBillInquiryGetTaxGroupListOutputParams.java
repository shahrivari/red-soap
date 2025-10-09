
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarAnnualTollBillInquiryGetTaxGroupListOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarAnnualTollBillInquiryGetTaxGroupListOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxGroupList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfCarAnnualTollBillTaxGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarAnnualTollBillInquiryGetTaxGroupListOutputParams", propOrder = {
    "taxGroupList"
})
public class CarAnnualTollBillInquiryGetTaxGroupListOutputParams {

    @XmlElement(name = "TaxGroupList", nillable = true)
    protected ArrayOfCarAnnualTollBillTaxGroup taxGroupList;

    /**
     * Gets the value of the taxGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarAnnualTollBillTaxGroup }
     *     
     */
    public ArrayOfCarAnnualTollBillTaxGroup getTaxGroupList() {
        return taxGroupList;
    }

    /**
     * Sets the value of the taxGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarAnnualTollBillTaxGroup }
     *     
     */
    public void setTaxGroupList(ArrayOfCarAnnualTollBillTaxGroup value) {
        this.taxGroupList = value;
    }

}
