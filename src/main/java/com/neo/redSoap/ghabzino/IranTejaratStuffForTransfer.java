
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratStuffForTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratStuffForTransfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StuffIdentityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratStuffForTransfer", propOrder = {
    "count",
    "stuffIdentityCode",
    "tax",
    "unitAmount"
})
public class IranTejaratStuffForTransfer {

    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "StuffIdentityCode", nillable = true)
    protected String stuffIdentityCode;
    @XmlElement(name = "Tax")
    protected Long tax;
    @XmlElement(name = "UnitAmount")
    protected Long unitAmount;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the stuffIdentityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffIdentityCode() {
        return stuffIdentityCode;
    }

    /**
     * Sets the value of the stuffIdentityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffIdentityCode(String value) {
        this.stuffIdentityCode = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTax(Long value) {
        this.tax = value;
    }

    /**
     * Gets the value of the unitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitAmount() {
        return unitAmount;
    }

    /**
     * Sets the value of the unitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitAmount(Long value) {
        this.unitAmount = value;
    }

}
