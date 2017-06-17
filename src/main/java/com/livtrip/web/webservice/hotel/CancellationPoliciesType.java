
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancellationPoliciesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancellationPoliciesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}PolicyType" minOccurs="0"/&gt;
 *         &lt;element name="NewPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}PolicyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationPoliciesType", propOrder = {
    "origPolicy",
    "newPolicy"
})
public class CancellationPoliciesType {

    @XmlElement(name = "OrigPolicy")
    protected PolicyType origPolicy;
    @XmlElement(name = "NewPolicy")
    protected PolicyType newPolicy;

    /**
     * 获取origPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getOrigPolicy() {
        return origPolicy;
    }

    /**
     * 设置origPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setOrigPolicy(PolicyType value) {
        this.origPolicy = value;
    }

    /**
     * 获取newPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getNewPolicy() {
        return newPolicy;
    }

    /**
     * 设置newPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setNewPolicy(PolicyType value) {
        this.newPolicy = value;
    }

}
