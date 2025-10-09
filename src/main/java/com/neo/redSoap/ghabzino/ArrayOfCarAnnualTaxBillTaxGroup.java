
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCarAnnualTaxBillTaxGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarAnnualTaxBillTaxGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarAnnualTaxBillTaxGroup" type="{http://schemas.datacontract.org/2004/07/Core}CarAnnualTaxBillTaxGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarAnnualTaxBillTaxGroup", propOrder = {
    "carAnnualTaxBillTaxGroup"
})
public class ArrayOfCarAnnualTaxBillTaxGroup {

    @XmlElement(name = "CarAnnualTaxBillTaxGroup", nillable = true)
    protected List<CarAnnualTaxBillTaxGroup> carAnnualTaxBillTaxGroup;

    /**
     * Gets the value of the carAnnualTaxBillTaxGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carAnnualTaxBillTaxGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarAnnualTaxBillTaxGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarAnnualTaxBillTaxGroup }
     * 
     * 
     */
    public List<CarAnnualTaxBillTaxGroup> getCarAnnualTaxBillTaxGroup() {
        if (carAnnualTaxBillTaxGroup == null) {
            carAnnualTaxBillTaxGroup = new ArrayList<CarAnnualTaxBillTaxGroup>();
        }
        return this.carAnnualTaxBillTaxGroup;
    }

}
