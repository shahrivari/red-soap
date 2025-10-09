
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratGetInternalTradeSellOutputDocumentsDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratGetInternalTradeSellOutputDocumentsDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyerOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SellDocumentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SellStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SumFactorPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratGetInternalTradeSellOutputDocumentsDetailResult", propOrder = {
    "buyerOwnerName",
    "charges",
    "createDateTime",
    "dateRegistration",
    "description",
    "destination",
    "discount",
    "sellDocumentID",
    "sellStatusName",
    "sellTypeName",
    "source",
    "sumFactorPrice"
})
public class IranTejaratGetInternalTradeSellOutputDocumentsDetailResult {

    @XmlElement(name = "BuyerOwnerName", nillable = true)
    protected String buyerOwnerName;
    @XmlElement(name = "Charges")
    protected Long charges;
    @XmlElement(name = "CreateDateTime", nillable = true)
    protected String createDateTime;
    @XmlElement(name = "DateRegistration", nillable = true)
    protected String dateRegistration;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Destination", nillable = true)
    protected String destination;
    @XmlElement(name = "Discount")
    protected Long discount;
    @XmlElement(name = "SellDocumentID")
    protected Long sellDocumentID;
    @XmlElement(name = "SellStatusName", nillable = true)
    protected String sellStatusName;
    @XmlElement(name = "SellTypeName", nillable = true)
    protected String sellTypeName;
    @XmlElement(name = "Source", nillable = true)
    protected String source;
    @XmlElement(name = "SumFactorPrice")
    protected Long sumFactorPrice;

    /**
     * Gets the value of the buyerOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerOwnerName() {
        return buyerOwnerName;
    }

    /**
     * Sets the value of the buyerOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerOwnerName(String value) {
        this.buyerOwnerName = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharges(Long value) {
        this.charges = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateTime(String value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the dateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRegistration() {
        return dateRegistration;
    }

    /**
     * Sets the value of the dateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRegistration(String value) {
        this.dateRegistration = value;
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

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscount(Long value) {
        this.discount = value;
    }

    /**
     * Gets the value of the sellDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellDocumentID() {
        return sellDocumentID;
    }

    /**
     * Sets the value of the sellDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellDocumentID(Long value) {
        this.sellDocumentID = value;
    }

    /**
     * Gets the value of the sellStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellStatusName() {
        return sellStatusName;
    }

    /**
     * Sets the value of the sellStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellStatusName(String value) {
        this.sellStatusName = value;
    }

    /**
     * Gets the value of the sellTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellTypeName() {
        return sellTypeName;
    }

    /**
     * Sets the value of the sellTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellTypeName(String value) {
        this.sellTypeName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sumFactorPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSumFactorPrice() {
        return sumFactorPrice;
    }

    /**
     * Sets the value of the sumFactorPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSumFactorPrice(Long value) {
        this.sumFactorPrice = value;
    }

}
