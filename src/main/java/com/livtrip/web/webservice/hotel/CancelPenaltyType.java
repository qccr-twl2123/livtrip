
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Deadline" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}DeadlineType" minOccurs="0"/&gt;
 *         &lt;element name="AmountPercent" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}AmountPercentType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyDescription" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConfirmClassCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltyType", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd", propOrder = {
    "deadline",
    "amountPercent",
    "penaltyDescription"
})
public class CancelPenaltyType {

    @XmlElement(name = "Deadline")
    protected DeadlineType deadline;
    @XmlElement(name = "AmountPercent")
    protected AmountPercentType amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected List<ParagraphType> penaltyDescription;
    @XmlAttribute(name = "ConfirmClassCode")
    protected String confirmClassCode;
    @XmlAttribute(name = "PolicyCode")
    protected String policyCode;
    @XmlAttribute(name = "NonRefundable")
    protected Boolean nonRefundable;

    /**
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeadlineType }
     *     
     */
    public DeadlineType getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineType }
     *     
     */
    public void setDeadline(DeadlineType value) {
        this.deadline = value;
    }

    /**
     * 获取amountPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType }
     *     
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * 设置amountPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType }
     *     
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getPenaltyDescription() {
        if (penaltyDescription == null) {
            penaltyDescription = new ArrayList<ParagraphType>();
        }
        return this.penaltyDescription;
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
