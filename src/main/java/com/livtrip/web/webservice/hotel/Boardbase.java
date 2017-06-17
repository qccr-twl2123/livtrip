
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Boardbase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Boardbase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="bbId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="bbName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bbPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="bbPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Boardbase")
public class Boardbase {

    @XmlAttribute(name = "bbId", required = true)
    protected int bbId;
    @XmlAttribute(name = "bbName")
    protected String bbName;
    @XmlAttribute(name = "bbPrice", required = true)
    protected BigDecimal bbPrice;
    @XmlAttribute(name = "bbPublishPrice")
    protected BigDecimal bbPublishPrice;

    /**
     * 获取bbId属性的值。
     * 
     */
    public int getBbId() {
        return bbId;
    }

    /**
     * 设置bbId属性的值。
     * 
     */
    public void setBbId(int value) {
        this.bbId = value;
    }

    /**
     * 获取bbName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbName() {
        return bbName;
    }

    /**
     * 设置bbName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbName(String value) {
        this.bbName = value;
    }

    /**
     * 获取bbPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBbPrice() {
        return bbPrice;
    }

    /**
     * 设置bbPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBbPrice(BigDecimal value) {
        this.bbPrice = value;
    }

    /**
     * 获取bbPublishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBbPublishPrice() {
        return bbPublishPrice;
    }

    /**
     * 设置bbPublishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBbPublishPrice(BigDecimal value) {
        this.bbPublishPrice = value;
    }

}
