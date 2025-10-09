
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyGovLivelihoodSupportEconomicInfoDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyGovLivelihoodSupportEconomicInfoDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalancePercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *         &lt;element name="BankProfitSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="C2cPercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *         &lt;element name="CarInformationList" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCarInformationList" minOccurs="0"/&gt;
 *         &lt;element name="CardPercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *         &lt;element name="CreditPercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *         &lt;element name="DeclarativeCardPercentileMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarningReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportEarningReport" minOccurs="0"/&gt;
 *         &lt;element name="EarningSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayaPercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *         &lt;element name="SatnaPercentileReports" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfLivelihoodSupportCardPercentileReports" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyGovLivelihoodSupportEconomicInfoDetail", propOrder = {
    "balancePercentileReports",
    "bankProfitSum",
    "c2CPercentileReports",
    "carInformationList",
    "cardPercentileReports",
    "creditPercentileReports",
    "declarativeCardPercentileMessage",
    "earningReports",
    "earningSum",
    "payaPercentileReports",
    "satnaPercentileReports"
})
public class MyGovLivelihoodSupportEconomicInfoDetail {

    @XmlElement(name = "BalancePercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports balancePercentileReports;
    @XmlElement(name = "BankProfitSum", nillable = true)
    protected String bankProfitSum;
    @XmlElement(name = "C2cPercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports c2CPercentileReports;
    @XmlElement(name = "CarInformationList", nillable = true)
    protected ArrayOfLivelihoodSupportCarInformationList carInformationList;
    @XmlElement(name = "CardPercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports cardPercentileReports;
    @XmlElement(name = "CreditPercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports creditPercentileReports;
    @XmlElement(name = "DeclarativeCardPercentileMessage", nillable = true)
    protected String declarativeCardPercentileMessage;
    @XmlElement(name = "EarningReports", nillable = true)
    protected ArrayOfLivelihoodSupportEarningReport earningReports;
    @XmlElement(name = "EarningSum", nillable = true)
    protected String earningSum;
    @XmlElement(name = "PayaPercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports payaPercentileReports;
    @XmlElement(name = "SatnaPercentileReports", nillable = true)
    protected ArrayOfLivelihoodSupportCardPercentileReports satnaPercentileReports;

    /**
     * Gets the value of the balancePercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getBalancePercentileReports() {
        return balancePercentileReports;
    }

    /**
     * Sets the value of the balancePercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setBalancePercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.balancePercentileReports = value;
    }

    /**
     * Gets the value of the bankProfitSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProfitSum() {
        return bankProfitSum;
    }

    /**
     * Sets the value of the bankProfitSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProfitSum(String value) {
        this.bankProfitSum = value;
    }

    /**
     * Gets the value of the c2CPercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getC2CPercentileReports() {
        return c2CPercentileReports;
    }

    /**
     * Sets the value of the c2CPercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setC2CPercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.c2CPercentileReports = value;
    }

    /**
     * Gets the value of the carInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCarInformationList }
     *     
     */
    public ArrayOfLivelihoodSupportCarInformationList getCarInformationList() {
        return carInformationList;
    }

    /**
     * Sets the value of the carInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCarInformationList }
     *     
     */
    public void setCarInformationList(ArrayOfLivelihoodSupportCarInformationList value) {
        this.carInformationList = value;
    }

    /**
     * Gets the value of the cardPercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getCardPercentileReports() {
        return cardPercentileReports;
    }

    /**
     * Sets the value of the cardPercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setCardPercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.cardPercentileReports = value;
    }

    /**
     * Gets the value of the creditPercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getCreditPercentileReports() {
        return creditPercentileReports;
    }

    /**
     * Sets the value of the creditPercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setCreditPercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.creditPercentileReports = value;
    }

    /**
     * Gets the value of the declarativeCardPercentileMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarativeCardPercentileMessage() {
        return declarativeCardPercentileMessage;
    }

    /**
     * Sets the value of the declarativeCardPercentileMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarativeCardPercentileMessage(String value) {
        this.declarativeCardPercentileMessage = value;
    }

    /**
     * Gets the value of the earningReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportEarningReport }
     *     
     */
    public ArrayOfLivelihoodSupportEarningReport getEarningReports() {
        return earningReports;
    }

    /**
     * Sets the value of the earningReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportEarningReport }
     *     
     */
    public void setEarningReports(ArrayOfLivelihoodSupportEarningReport value) {
        this.earningReports = value;
    }

    /**
     * Gets the value of the earningSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningSum() {
        return earningSum;
    }

    /**
     * Sets the value of the earningSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningSum(String value) {
        this.earningSum = value;
    }

    /**
     * Gets the value of the payaPercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getPayaPercentileReports() {
        return payaPercentileReports;
    }

    /**
     * Sets the value of the payaPercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setPayaPercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.payaPercentileReports = value;
    }

    /**
     * Gets the value of the satnaPercentileReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public ArrayOfLivelihoodSupportCardPercentileReports getSatnaPercentileReports() {
        return satnaPercentileReports;
    }

    /**
     * Sets the value of the satnaPercentileReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLivelihoodSupportCardPercentileReports }
     *     
     */
    public void setSatnaPercentileReports(ArrayOfLivelihoodSupportCardPercentileReports value) {
        this.satnaPercentileReports = value;
    }

}
