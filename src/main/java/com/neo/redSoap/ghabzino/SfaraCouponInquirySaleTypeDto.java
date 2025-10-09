
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfaraCouponInquirySaleTypeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SfaraCouponInquirySaleTypeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatementList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfSfaraCouponInquiryStatementDto" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfaraCouponInquirySaleTypeDto", propOrder = {
    "balance",
    "code",
    "description",
    "statementList",
    "title"
})
public class SfaraCouponInquirySaleTypeDto {

    @XmlElement(name = "Balance")
    protected Long balance;
    @XmlElement(name = "Code")
    protected Long code;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "StatementList", nillable = true)
    protected ArrayOfSfaraCouponInquiryStatementDto statementList;
    @XmlElement(name = "Title", nillable = true)
    protected String title;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalance(Long value) {
        this.balance = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
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
     * Gets the value of the statementList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfaraCouponInquiryStatementDto }
     *     
     */
    public ArrayOfSfaraCouponInquiryStatementDto getStatementList() {
        return statementList;
    }

    /**
     * Sets the value of the statementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfaraCouponInquiryStatementDto }
     *     
     */
    public void setStatementList(ArrayOfSfaraCouponInquiryStatementDto value) {
        this.statementList = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
