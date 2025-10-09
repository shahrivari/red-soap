
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaminReceiptItemsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaminReceiptItemsParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeductionExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoansAndOthersExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaminReceiptItemsParams", propOrder = {
    "deductionExtraInfo",
    "loansAndOthersExtraInfo",
    "paymentsExtraInfo"
})
public class TaminReceiptItemsParams {

    @XmlElement(name = "DeductionExtraInfo", nillable = true)
    protected String deductionExtraInfo;
    @XmlElement(name = "LoansAndOthersExtraInfo", nillable = true)
    protected String loansAndOthersExtraInfo;
    @XmlElement(name = "PaymentsExtraInfo", nillable = true)
    protected String paymentsExtraInfo;

    /**
     * Gets the value of the deductionExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionExtraInfo() {
        return deductionExtraInfo;
    }

    /**
     * Sets the value of the deductionExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductionExtraInfo(String value) {
        this.deductionExtraInfo = value;
    }

    /**
     * Gets the value of the loansAndOthersExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoansAndOthersExtraInfo() {
        return loansAndOthersExtraInfo;
    }

    /**
     * Sets the value of the loansAndOthersExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoansAndOthersExtraInfo(String value) {
        this.loansAndOthersExtraInfo = value;
    }

    /**
     * Gets the value of the paymentsExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentsExtraInfo() {
        return paymentsExtraInfo;
    }

    /**
     * Sets the value of the paymentsExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentsExtraInfo(String value) {
        this.paymentsExtraInfo = value;
    }

}
