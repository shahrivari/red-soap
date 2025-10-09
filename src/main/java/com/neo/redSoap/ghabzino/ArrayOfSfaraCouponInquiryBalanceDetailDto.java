
package com.neo.redSoap.ghabzino;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSfaraCouponInquiryBalanceDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSfaraCouponInquiryBalanceDetailDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SfaraCouponInquiryBalanceDetailDto" type="{http://schemas.datacontract.org/2004/07/Core}SfaraCouponInquiryBalanceDetailDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSfaraCouponInquiryBalanceDetailDto", propOrder = {
    "sfaraCouponInquiryBalanceDetailDto"
})
public class ArrayOfSfaraCouponInquiryBalanceDetailDto {

    @XmlElement(name = "SfaraCouponInquiryBalanceDetailDto", nillable = true)
    protected List<SfaraCouponInquiryBalanceDetailDto> sfaraCouponInquiryBalanceDetailDto;

    /**
     * Gets the value of the sfaraCouponInquiryBalanceDetailDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sfaraCouponInquiryBalanceDetailDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfaraCouponInquiryBalanceDetailDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SfaraCouponInquiryBalanceDetailDto }
     * 
     * 
     */
    public List<SfaraCouponInquiryBalanceDetailDto> getSfaraCouponInquiryBalanceDetailDto() {
        if (sfaraCouponInquiryBalanceDetailDto == null) {
            sfaraCouponInquiryBalanceDetailDto = new ArrayList<SfaraCouponInquiryBalanceDetailDto>();
        }
        return this.sfaraCouponInquiryBalanceDetailDto;
    }

}
