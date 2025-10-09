
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfElectronicPrescriptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfElectronicPrescriptionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElectronicPrescriptionData" type="{http://schemas.datacontract.org/2004/07/Core}ElectronicPrescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfElectronicPrescriptionData", propOrder = {
    "electronicPrescriptionData"
})
public class ArrayOfElectronicPrescriptionData {

    @XmlElement(name = "ElectronicPrescriptionData", nillable = true)
    protected List<ElectronicPrescriptionData> electronicPrescriptionData;

    /**
     * Gets the value of the electronicPrescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electronicPrescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicPrescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicPrescriptionData }
     * 
     * 
     */
    public List<ElectronicPrescriptionData> getElectronicPrescriptionData() {
        if (electronicPrescriptionData == null) {
            electronicPrescriptionData = new ArrayList<ElectronicPrescriptionData>();
        }
        return this.electronicPrescriptionData;
    }

}
