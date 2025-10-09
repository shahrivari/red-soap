
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IranTejaratGetInternalTradeSellOutputDocumentsOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IranTejaratGetInternalTradeSellOutputDocumentsOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IranTejaratGetInternalTradeSellOutputDocumentsOutputParams", propOrder = {
    "documents",
    "totalCount"
})
public class IranTejaratGetInternalTradeSellOutputDocumentsOutputParams {

    @XmlElement(name = "Documents", nillable = true)
    protected ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult documents;
    @XmlElement(name = "TotalCount")
    protected Long totalCount;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult }
     *     
     */
    public ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult }
     *     
     */
    public void setDocuments(ArrayOfIranTejaratGetInternalTradeSellOutputDocumentsDetailResult value) {
        this.documents = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCount(Long value) {
        this.totalCount = value;
    }

}
