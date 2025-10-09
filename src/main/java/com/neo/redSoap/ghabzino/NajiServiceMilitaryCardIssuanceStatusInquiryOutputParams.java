
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NajiServiceMilitaryCardIssuanceStatusInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NajiServiceMilitaryCardIssuanceStatusInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail" minOccurs="0"/&gt;
 *         &lt;element name="DataFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NajiServiceMilitaryCardIssuanceStatusInquiryOutputParams", propOrder = {
    "cardList",
    "dataFound",
    "description"
})
public class NajiServiceMilitaryCardIssuanceStatusInquiryOutputParams {

    @XmlElement(name = "CardList", nillable = true)
    protected ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail cardList;
    @XmlElement(name = "DataFound")
    protected Boolean dataFound;
    @XmlElement(name = "Description", nillable = true)
    protected String description;

    /**
     * Gets the value of the cardList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail }
     *     
     */
    public ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail getCardList() {
        return cardList;
    }

    /**
     * Sets the value of the cardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail }
     *     
     */
    public void setCardList(ArrayOfNajiServiceMilitaryCardIssuanceStatusInquiryOutputParamsDetail value) {
        this.cardList = value;
    }

    /**
     * Gets the value of the dataFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataFound() {
        return dataFound;
    }

    /**
     * Sets the value of the dataFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataFound(Boolean value) {
        this.dataFound = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
