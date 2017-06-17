
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>AmountPercentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmountPercentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="basisType" type="{http://schemas.tourico.com/webservices/hotelv3}AmountPercentTypeBasisType" /&gt;
 *       &lt;attribute name="percent" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="decimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPercentType")
public class AmountPercentType2 {

    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "nmbrOfNights")
    protected String nmbrOfNights;
    @XmlAttribute(name = "basisType")
    protected AmountPercentTypeBasisType2 basisType;
    @XmlAttribute(name = "percent")
    protected Double percent;
    @XmlAttribute(name = "amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "decimalPlaces")
    protected Integer decimalPlaces;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取nmbrOfNights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbrOfNights() {
        return nmbrOfNights;
    }

    /**
     * 设置nmbrOfNights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbrOfNights(String value) {
        this.nmbrOfNights = value;
    }

    /**
     * 获取basisType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentTypeBasisType2 }
     *     
     */
    public AmountPercentTypeBasisType2 getBasisType() {
        return basisType;
    }

    /**
     * 设置basisType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentTypeBasisType2 }
     *     
     */
    public void setBasisType(AmountPercentTypeBasisType2 value) {
        this.basisType = value;
    }

    /**
     * 获取percent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * 设置percent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * 获取decimalPlaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 设置decimalPlaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
    }

}
