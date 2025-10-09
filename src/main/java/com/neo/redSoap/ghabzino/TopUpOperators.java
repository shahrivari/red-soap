
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpOperators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpOperators"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SimTypes" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfTopUpSimType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpOperators", propOrder = {
    "color",
    "icon",
    "name",
    "showName",
    "simTypes"
})
public class TopUpOperators {

    @XmlElement(name = "Color", nillable = true)
    protected String color;
    @XmlElement(name = "Icon", nillable = true)
    protected String icon;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ShowName", nillable = true)
    protected String showName;
    @XmlElement(name = "SimTypes", nillable = true)
    protected ArrayOfTopUpSimType simTypes;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the showName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowName() {
        return showName;
    }

    /**
     * Sets the value of the showName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowName(String value) {
        this.showName = value;
    }

    /**
     * Gets the value of the simTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopUpSimType }
     *     
     */
    public ArrayOfTopUpSimType getSimTypes() {
        return simTypes;
    }

    /**
     * Sets the value of the simTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopUpSimType }
     *     
     */
    public void setSimTypes(ArrayOfTopUpSimType value) {
        this.simTypes = value;
    }

}
