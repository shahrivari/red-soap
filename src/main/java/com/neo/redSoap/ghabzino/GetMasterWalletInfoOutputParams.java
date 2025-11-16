
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMasterWalletInfoOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMasterWalletInfoOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillPayment" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="CarAnnualTax" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="CarToll" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="CarTransferTax" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="GeneralPayment" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="TehranMunicipality" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="TopUp" type="{http://schemas.datacontract.org/2004/07/Core}GetMasterWalletInfoDetailResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMasterWalletInfoOutputParams", propOrder = {
    "billPayment",
    "carAnnualTax",
    "carToll",
    "carTransferTax",
    "generalPayment",
    "tehranMunicipality",
    "topUp"
})
public class GetMasterWalletInfoOutputParams {

    @XmlElement(name = "BillPayment", nillable = true)
    protected GetMasterWalletInfoDetailResult billPayment;
    @XmlElement(name = "CarAnnualTax", nillable = true)
    protected GetMasterWalletInfoDetailResult carAnnualTax;
    @XmlElement(name = "CarToll", nillable = true)
    protected GetMasterWalletInfoDetailResult carToll;
    @XmlElement(name = "CarTransferTax", nillable = true)
    protected GetMasterWalletInfoDetailResult carTransferTax;
    @XmlElement(name = "GeneralPayment", nillable = true)
    protected GetMasterWalletInfoDetailResult generalPayment;
    @XmlElement(name = "TehranMunicipality", nillable = true)
    protected GetMasterWalletInfoDetailResult tehranMunicipality;
    @XmlElement(name = "TopUp", nillable = true)
    protected GetMasterWalletInfoDetailResult topUp;

    /**
     * Gets the value of the billPayment property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getBillPayment() {
        return billPayment;
    }

    /**
     * Sets the value of the billPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setBillPayment(GetMasterWalletInfoDetailResult value) {
        this.billPayment = value;
    }

    /**
     * Gets the value of the carAnnualTax property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getCarAnnualTax() {
        return carAnnualTax;
    }

    /**
     * Sets the value of the carAnnualTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setCarAnnualTax(GetMasterWalletInfoDetailResult value) {
        this.carAnnualTax = value;
    }

    /**
     * Gets the value of the carToll property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getCarToll() {
        return carToll;
    }

    /**
     * Sets the value of the carToll property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setCarToll(GetMasterWalletInfoDetailResult value) {
        this.carToll = value;
    }

    /**
     * Gets the value of the carTransferTax property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getCarTransferTax() {
        return carTransferTax;
    }

    /**
     * Sets the value of the carTransferTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setCarTransferTax(GetMasterWalletInfoDetailResult value) {
        this.carTransferTax = value;
    }

    /**
     * Gets the value of the generalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getGeneralPayment() {
        return generalPayment;
    }

    /**
     * Sets the value of the generalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setGeneralPayment(GetMasterWalletInfoDetailResult value) {
        this.generalPayment = value;
    }

    /**
     * Gets the value of the tehranMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getTehranMunicipality() {
        return tehranMunicipality;
    }

    /**
     * Sets the value of the tehranMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setTehranMunicipality(GetMasterWalletInfoDetailResult value) {
        this.tehranMunicipality = value;
    }

    /**
     * Gets the value of the topUp property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public GetMasterWalletInfoDetailResult getTopUp() {
        return topUp;
    }

    /**
     * Sets the value of the topUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterWalletInfoDetailResult }
     *     
     */
    public void setTopUp(GetMasterWalletInfoDetailResult value) {
        this.topUp = value;
    }

}
