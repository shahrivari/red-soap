
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpGetOperatorsOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpGetOperatorsOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operators" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTopUpOperators" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpGetOperatorsOutputParams", propOrder = {
    "operators"
})
public class TopUpGetOperatorsOutputParams {

    @XmlElement(name = "Operators", nillable = true)
    protected ArrayOfTopUpOperators operators;

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopUpOperators }
     *     
     */
    public ArrayOfTopUpOperators getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopUpOperators }
     *     
     */
    public void setOperators(ArrayOfTopUpOperators value) {
        this.operators = value;
    }

}
