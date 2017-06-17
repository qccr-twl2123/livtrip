
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>CancelPenaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelPenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deadline" type="{http://schemas.tourico.com/webservices/hotelv3}DeadlineType" minOccurs="0"/&gt;
 *         &lt;element name="AmountPercent" type="{http://schemas.tourico.com/webservices/hotelv3}AmountPercentType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyDescription" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="confirmClassCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="policyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltyType", propOrder = {
    "deadline",
    "amountPercent",
    "penaltyDescription"
})
public class CancelPenaltyType2 {

    @XmlElement(name = "Deadline")
    protected DeadlineType2 deadline;
    @XmlElement(name = "AmountPercent")
    protected AmountPercentType2 amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected ArrayOfParagraphType penaltyDescription;
    @XmlAttribute(name = "confirmClassCode")
    protected String confirmClassCode;
    @XmlAttribute(name = "policyCode")
    protected String policyCode;
    @XmlAttribute(name = "nonRefundable")
    protected Boolean nonRefundable;

    /**
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeadlineType2 }
     *     
     */
    public DeadlineType2 getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineType2 }
     *     
     */
    public void setDeadline(DeadlineType2 value) {
        this.deadline = value;
    }

    /**
     * 获取amountPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType2 }
     *     
     */
    public AmountPercentType2 getAmountPercent() {
        return amountPercent;
    }

    /**
     * 设置amountPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType2 }
     *     
     */
    public void setAmountPercent(AmountPercentType2 value) {
        this.amountPercent = value;
    }

    /**
     * 获取penaltyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public ArrayOfParagraphType getPenaltyDescription() {
        return penaltyDescription;
    }

    /**
     * 设置penaltyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public void setPenaltyDescription(ArrayOfParagraphType value) {
        this.penaltyDescription = value;
    }

    /**
     * 获取confirmClassCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmClassCode() {
        return confirmClassCode;
    }

    /**
     * 设置confirmClassCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmClassCode(String value) {
        this.confirmClassCode = value;
    }

    /**
     * 获取policyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * 设置policyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * 获取nonRefundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * 设置nonRefundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

}
