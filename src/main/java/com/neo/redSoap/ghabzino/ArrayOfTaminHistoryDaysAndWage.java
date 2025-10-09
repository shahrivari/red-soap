
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTaminHistoryDaysAndWage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaminHistoryDaysAndWage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaminHistoryDaysAndWage" type="{http://schemas.datacontract.org/2004/07/Core}TaminHistoryDaysAndWage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaminHistoryDaysAndWage", propOrder = {
    "taminHistoryDaysAndWage"
})
public class ArrayOfTaminHistoryDaysAndWage {

    @XmlElement(name = "TaminHistoryDaysAndWage", nillable = true)
    protected List<TaminHistoryDaysAndWage> taminHistoryDaysAndWage;

    /**
     * Gets the value of the taminHistoryDaysAndWage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taminHistoryDaysAndWage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaminHistoryDaysAndWage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaminHistoryDaysAndWage }
     * 
     * 
     */
    public List<TaminHistoryDaysAndWage> getTaminHistoryDaysAndWage() {
        if (taminHistoryDaysAndWage == null) {
            taminHistoryDaysAndWage = new ArrayList<TaminHistoryDaysAndWage>();
        }
        return this.taminHistoryDaysAndWage;
    }

}
