
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovLivelihoodSupportInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovLivelihoodSupportInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EconomicInfoDetail" type="{http://schemas.datacontract.org/2004/07/Core}MyGovLivelihoodSupportEconomicInfoDetail" minOccurs="0"/&gt;
 *         &lt;element name="FamilyMembers" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfMyGovLivelihoodSupportFamilyMembers" minOccurs="0"/&gt;
 *         &lt;element name="MyGovProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}MyGovProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProfileInfo" type="{http://schemas.datacontract.org/2004/07/Core}MyGovLivelihoodSupportProfileInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovLivelihoodSupportInquiryOutputParams", propOrder = {
    "economicInfoDetail",
    "familyMembers",
    "myGovProfileInfo",
    "profileInfo"
})
public class MyGovLivelihoodSupportInquiryOutputParams {

    @XmlElement(name = "EconomicInfoDetail", nillable = true)
    protected MyGovLivelihoodSupportEconomicInfoDetail economicInfoDetail;
    @XmlElement(name = "FamilyMembers", nillable = true)
    protected ArrayOfMyGovLivelihoodSupportFamilyMembers familyMembers;
    @XmlElement(name = "MyGovProfileInfo", nillable = true)
    protected MyGovProfileInfo myGovProfileInfo;
    @XmlElement(name = "ProfileInfo", nillable = true)
    protected MyGovLivelihoodSupportProfileInfo profileInfo;

    /**
     * Gets the value of the economicInfoDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovLivelihoodSupportEconomicInfoDetail }
     *     
     */
    public MyGovLivelihoodSupportEconomicInfoDetail getEconomicInfoDetail() {
        return economicInfoDetail;
    }

    /**
     * Sets the value of the economicInfoDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovLivelihoodSupportEconomicInfoDetail }
     *     
     */
    public void setEconomicInfoDetail(MyGovLivelihoodSupportEconomicInfoDetail value) {
        this.economicInfoDetail = value;
    }

    /**
     * Gets the value of the familyMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMyGovLivelihoodSupportFamilyMembers }
     *     
     */
    public ArrayOfMyGovLivelihoodSupportFamilyMembers getFamilyMembers() {
        return familyMembers;
    }

    /**
     * Sets the value of the familyMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMyGovLivelihoodSupportFamilyMembers }
     *     
     */
    public void setFamilyMembers(ArrayOfMyGovLivelihoodSupportFamilyMembers value) {
        this.familyMembers = value;
    }

    /**
     * Gets the value of the myGovProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public MyGovProfileInfo getMyGovProfileInfo() {
        return myGovProfileInfo;
    }

    /**
     * Sets the value of the myGovProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovProfileInfo }
     *     
     */
    public void setMyGovProfileInfo(MyGovProfileInfo value) {
        this.myGovProfileInfo = value;
    }

    /**
     * Gets the value of the profileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MyGovLivelihoodSupportProfileInfo }
     *     
     */
    public MyGovLivelihoodSupportProfileInfo getProfileInfo() {
        return profileInfo;
    }

    /**
     * Sets the value of the profileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyGovLivelihoodSupportProfileInfo }
     *     
     */
    public void setProfileInfo(MyGovLivelihoodSupportProfileInfo value) {
        this.profileInfo = value;
    }

}
