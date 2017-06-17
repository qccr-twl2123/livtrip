
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>ResGroup complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reservations" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tranNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="rgRemark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rgId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="isPackage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="totalPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="totalPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGroup", propOrder = {
    "reservations"
})
public class ResGroup {

    @XmlElement(name = "Reservations")
    protected ArrayOfReservation reservations;
    @XmlAttribute(name = "tranNum", required = true)
    protected int tranNum;
    @XmlAttribute(name = "rgRemark")
    protected String rgRemark;
    @XmlAttribute(name = "rgId", required = true)
    protected int rgId;
    @XmlAttribute(name = "isPackage", required = true)
    protected boolean isPackage;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "totalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlAttribute(name = "totalPublishPrice")
    protected BigDecimal totalPublishPrice;

    /**
     * 获取reservations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservation }
     *     
     */
    public ArrayOfReservation getReservations() {
        return reservations;
    }

    /**
     * 设置reservations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservation }
     *     
     */
    public void setReservations(ArrayOfReservation value) {
        this.reservations = value;
    }

    /**
     * 获取tranNum属性的值。
     * 
     */
    public int getTranNum() {
        return tranNum;
    }

    /**
     * 设置tranNum属性的值。
     * 
     */
    public void setTranNum(int value) {
        this.tranNum = value;
    }

    /**
     * 获取rgRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgRemark() {
        return rgRemark;
    }

    /**
     * 设置rgRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgRemark(String value) {
        this.rgRemark = value;
    }

    /**
     * 获取rgId属性的值。
     * 
     */
    public int getRgId() {
        return rgId;
    }

    /**
     * 设置rgId属性的值。
     * 
     */
    public void setRgId(int value) {
        this.rgId = value;
    }

    /**
     * 获取isPackage属性的值。
     * 
     */
    public boolean isIsPackage() {
        return isPackage;
    }

    /**
     * 设置isPackage属性的值。
     * 
     */
    public void setIsPackage(boolean value) {
        this.isPackage = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * 获取totalPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置totalPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * 获取totalPublishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPublishPrice() {
        return totalPublishPrice;
    }

    /**
     * 设置totalPublishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPublishPrice(BigDecimal value) {
        this.totalPublishPrice = value;
    }

}
