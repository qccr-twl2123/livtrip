
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Supplement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Supplement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="suppId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="suppName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="supptType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="suppIsMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="suppChargeType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}ChargeType" /&gt;
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="publishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplement")
@XmlSeeAlso({
    PerPersonSupplement.class,
    PerRoomSupplement.class
})
public class Supplement {

    @XmlAttribute(name = "suppId", required = true)
    protected int suppId;
    @XmlAttribute(name = "suppName")
    protected String suppName;
    @XmlAttribute(name = "supptType", required = true)
    protected int supptType;
    @XmlAttribute(name = "suppIsMandatory", required = true)
    protected boolean suppIsMandatory;
    @XmlAttribute(name = "suppChargeType", required = true)
    protected ChargeType suppChargeType;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "publishPrice")
    protected BigDecimal publishPrice;

    /**
     * 获取suppId属性的值。
     * 
     */
    public int getSuppId() {
        return suppId;
    }

    /**
     * 设置suppId属性的值。
     * 
     */
    public void setSuppId(int value) {
        this.suppId = value;
    }

    /**
     * 获取suppName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppName() {
        return suppName;
    }

    /**
     * 设置suppName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppName(String value) {
        this.suppName = value;
    }

    /**
     * 获取supptType属性的值。
     * 
     */
    public int getSupptType() {
        return supptType;
    }

    /**
     * 设置supptType属性的值。
     * 
     */
    public void setSupptType(int value) {
        this.supptType = value;
    }

    /**
     * 获取suppIsMandatory属性的值。
     * 
     */
    public boolean isSuppIsMandatory() {
        return suppIsMandatory;
    }

    /**
     * 设置suppIsMandatory属性的值。
     * 
     */
    public void setSuppIsMandatory(boolean value) {
        this.suppIsMandatory = value;
    }

    /**
     * 获取suppChargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargeType }
     *     
     */
    public ChargeType getSuppChargeType() {
        return suppChargeType;
    }

    /**
     * 设置suppChargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType }
     *     
     */
    public void setSuppChargeType(ChargeType value) {
        this.suppChargeType = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * 获取publishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublishPrice() {
        return publishPrice;
    }

    /**
     * 设置publishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublishPrice(BigDecimal value) {
        this.publishPrice = value;
    }

}
