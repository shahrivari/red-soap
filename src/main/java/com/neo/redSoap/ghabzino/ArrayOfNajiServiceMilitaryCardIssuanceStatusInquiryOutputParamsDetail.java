
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail" type="{http://schemas.datacontract.org/2004/07/Core}NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail", propOrder = {
    "najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail"
})
public class ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail {

    @XmlElement(name = "NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail", nillable = true)
    protected List<NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail> najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail;

    /**
     * Gets the value of the najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail }
     * 
     * 
     */
    public List<NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail> getNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail() {
        if (najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail == null) {
            najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail = new ArrayList<NajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail>();
        }
        return this.najiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail;
    }

}
