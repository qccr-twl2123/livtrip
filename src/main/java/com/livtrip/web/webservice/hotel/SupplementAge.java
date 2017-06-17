
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>SupplementAge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplementAge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="suppFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="suppTo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="suppQuantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="suppPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementAge")
public class SupplementAge {

    @XmlAttribute(name = "suppFrom", required = true)
    protected int suppFrom;
    @XmlAttribute(name = "suppTo", required = true)
    protected int suppTo;
    @XmlAttribute(name = "suppQuantity", required = true)
    protected int suppQuantity;
    @XmlAttribute(name = "suppPrice", required = true)
    protected BigDecimal suppPrice;

    /**
     * 获取suppFrom属性的值。
     * 
     */
    public int getSuppFrom() {
        return suppFrom;
    }

    /**
     * 设置suppFrom属性的值。
     * 
     */
    public void setSuppFrom(int value) {
        this.suppFrom = value;
    }

    /**
     * 获取suppTo属性的值。
     * 
     */
    public int getSuppTo() {
        return suppTo;
    }

    /**
     * 设置suppTo属性的值。
     * 
     */
    public void setSuppTo(int value) {
        this.suppTo = value;
    }

    /**
     * 获取suppQuantity属性的值。
     * 
     */
    public int getSuppQuantity() {
        return suppQuantity;
    }

    /**
     * 设置suppQuantity属性的值。
     * 
     */
    public void setSuppQuantity(int value) {
        this.suppQuantity = value;
    }

    /**
     * 获取suppPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuppPrice() {
        return suppPrice;
    }

    /**
     * 设置suppPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuppPrice(BigDecimal value) {
        this.suppPrice = value;
    }

}
