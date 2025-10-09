
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratLoginOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratLoginOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsOtpRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserRoles" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfIranTejaratLoginDetailResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratLoginOutputParams", propOrder = {
    "isOtpRequired",
    "userRoles"
})
public class IranTejaratLoginOutputParams {

    @XmlElement(name = "IsOtpRequired")
    protected Boolean isOtpRequired;
    @XmlElement(name = "UserRoles", nillable = true)
    protected ArrayOfIranTejaratLoginDetailResult userRoles;

    /**
     * Gets the value of the isOtpRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOtpRequired() {
        return isOtpRequired;
    }

    /**
     * Sets the value of the isOtpRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOtpRequired(Boolean value) {
        this.isOtpRequired = value;
    }

    /**
     * Gets the value of the userRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIranTejaratLoginDetailResult }
     *     
     */
    public ArrayOfIranTejaratLoginDetailResult getUserRoles() {
        return userRoles;
    }

    /**
     * Sets the value of the userRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIranTejaratLoginDetailResult }
     *     
     */
    public void setUserRoles(ArrayOfIranTejaratLoginDetailResult value) {
        this.userRoles = value;
    }

}
