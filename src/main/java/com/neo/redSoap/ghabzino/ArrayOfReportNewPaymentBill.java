
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReportNewPaymentBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReportNewPaymentBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportNewPaymentBill" type="{http://schemas.datacontract.org/2004/07/Core}ReportNewPaymentBill" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReportNewPaymentBill", propOrder = {
    "reportNewPaymentBill"
})
public class ArrayOfReportNewPaymentBill {

    @XmlElement(name = "ReportNewPaymentBill", nillable = true)
    protected List<ReportNewPaymentBill> reportNewPaymentBill;

    /**
     * Gets the value of the reportNewPaymentBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportNewPaymentBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportNewPaymentBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportNewPaymentBill }
     * 
     * 
     */
    public List<ReportNewPaymentBill> getReportNewPaymentBill() {
        if (reportNewPaymentBill == null) {
            reportNewPaymentBill = new ArrayList<ReportNewPaymentBill>();
        }
        return this.reportNewPaymentBill;
    }

}
