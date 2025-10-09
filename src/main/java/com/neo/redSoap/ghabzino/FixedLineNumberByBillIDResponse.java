
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FixedLineNumberByBillIDResult" type="{http://schemas.datacontract.org/2004/07/Core}FixedLineNumberByBillIDOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fixedLineNumberByBillIDResult"
})
@XmlRootElement(name = "FixedLineNumberByBillIDResponse", namespace = "http://tempuri.org/")
public class FixedLineNumberByBillIDResponse {

    @XmlElement(name = "FixedLineNumberByBillIDResult", namespace = "http://tempuri.org/", nillable = true)
    protected FixedLineNumberByBillIDOutput fixedLineNumberByBillIDResult;

    /**
     * Gets the value of the fixedLineNumberByBillIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link FixedLineNumberByBillIDOutput }
     *     
     */
    public FixedLineNumberByBillIDOutput getFixedLineNumberByBillIDResult() {
        return fixedLineNumberByBillIDResult;
    }

    /**
     * Sets the value of the fixedLineNumberByBillIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedLineNumberByBillIDOutput }
     *     
     */
    public void setFixedLineNumberByBillIDResult(FixedLineNumberByBillIDOutput value) {
        this.fixedLineNumberByBillIDResult = value;
    }

}
