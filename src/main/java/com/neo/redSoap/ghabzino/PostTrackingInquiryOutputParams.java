
package com.neo.redSoap.ghabzino;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostTrackingInquiryOutputParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostTrackingInquiryOutputParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostPackageStatusDetail" type="{http://schemas.datacontract.org/2004/07/Core}ArrayOfPostTrackingOutput" minOccurs="0"/&gt;
 *         &lt;element name="PostPackageStatusDetailTotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourcePostOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTrackingInquiryOutputParams", propOrder = {
    "acceptanceDateTime",
    "destination",
    "extraInfo",
    "insuranceCost",
    "packageNumber",
    "postCost",
    "postPackageStatusDetail",
    "postPackageStatusDetailTotalCount",
    "receiverName",
    "receiverZip",
    "senderName",
    "senderZip",
    "serviceType",
    "source",
    "sourcePostOffice",
    "weight"
})
public class PostTrackingInquiryOutputParams {

    @XmlElement(name = "AcceptanceDateTime", nillable = true)
    protected String acceptanceDateTime;
    @XmlElement(name = "Destination", nillable = true)
    protected String destination;
    @XmlElement(name = "ExtraInfo", nillable = true)
    protected String extraInfo;
    @XmlElement(name = "InsuranceCost", nillable = true)
    protected String insuranceCost;
    @XmlElement(name = "PackageNumber", nillable = true)
    protected String packageNumber;
    @XmlElement(name = "PostCost", nillable = true)
    protected String postCost;
    @XmlElement(name = "PostPackageStatusDetail", nillable = true)
    protected ArrayOfPostTrackingOutput postPackageStatusDetail;
    @XmlElement(name = "PostPackageStatusDetailTotalCount")
    protected Long postPackageStatusDetailTotalCount;
    @XmlElement(name = "ReceiverName", nillable = true)
    protected String receiverName;
    @XmlElement(name = "ReceiverZip", nillable = true)
    protected String receiverZip;
    @XmlElement(name = "SenderName", nillable = true)
    protected String senderName;
    @XmlElement(name = "SenderZip", nillable = true)
    protected String senderZip;
    @XmlElement(name = "ServiceType", nillable = true)
    protected String serviceType;
    @XmlElement(name = "Source", nillable = true)
    protected String source;
    @XmlElement(name = "SourcePostOffice", nillable = true)
    protected String sourcePostOffice;
    @XmlElement(name = "Weight", nillable = true)
    protected String weight;

    /**
     * Gets the value of the acceptanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceDateTime() {
        return acceptanceDateTime;
    }

    /**
     * Sets the value of the acceptanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceDateTime(String value) {
        this.acceptanceDateTime = value;
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
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCost(String value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the packageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /**
     * Sets the value of the packageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNumber(String value) {
        this.packageNumber = value;
    }

    /**
     * Gets the value of the postCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCost() {
        return postCost;
    }

    /**
     * Sets the value of the postCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCost(String value) {
        this.postCost = value;
    }

    /**
     * Gets the value of the postPackageStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostTrackingOutput }
     *     
     */
    public ArrayOfPostTrackingOutput getPostPackageStatusDetail() {
        return postPackageStatusDetail;
    }

    /**
     * Sets the value of the postPackageStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostTrackingOutput }
     *     
     */
    public void setPostPackageStatusDetail(ArrayOfPostTrackingOutput value) {
        this.postPackageStatusDetail = value;
    }

    /**
     * Gets the value of the postPackageStatusDetailTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostPackageStatusDetailTotalCount() {
        return postPackageStatusDetailTotalCount;
    }

    /**
     * Sets the value of the postPackageStatusDetailTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostPackageStatusDetailTotalCount(Long value) {
        this.postPackageStatusDetailTotalCount = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the receiverZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * Sets the value of the receiverZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverZip(String value) {
        this.receiverZip = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderZip() {
        return senderZip;
    }

    /**
     * Sets the value of the senderZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderZip(String value) {
        this.senderZip = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
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
     * Gets the value of the sourcePostOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePostOffice() {
        return sourcePostOffice;
    }

    /**
     * Sets the value of the sourcePostOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePostOffice(String value) {
        this.sourcePostOffice = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

}
