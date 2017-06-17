
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BillingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BillingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigPrice" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="NewPrice" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="OrigTaxBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfTax" minOccurs="0"/&gt;
 *         &lt;element name="NewTaxBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfTax" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingType", propOrder = {
    "origPrice",
    "newPrice",
    "paid",
    "balance",
    "origTaxBreakdown",
    "newTaxBreakdown"
})
public class BillingType {

    @XmlElement(name = "OrigPrice")
    protected PriceType origPrice;
    @XmlElement(name = "NewPrice")
    protected PriceType newPrice;
    @XmlElement(name = "Paid")
    protected PriceType paid;
    @XmlElement(name = "Balance")
    protected PriceType balance;
    @XmlElement(name = "OrigTaxBreakdown")
    protected ArrayOfTax origTaxBreakdown;
    @XmlElement(name = "NewTaxBreakdown")
    protected ArrayOfTax newTaxBreakdown;

    /**
     * 获取origPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getOrigPrice() {
        return origPrice;
    }

    /**
     * 设置origPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setOrigPrice(PriceType value) {
        this.origPrice = value;
    }

    /**
     * 获取newPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getNewPrice() {
        return newPrice;
    }

    /**
     * 设置newPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setNewPrice(PriceType value) {
        this.newPrice = value;
    }

    /**
     * 获取paid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPaid() {
        return paid;
    }

    /**
     * 设置paid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPaid(PriceType value) {
        this.paid = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setBalance(PriceType value) {
        this.balance = value;
    }

    /**
     * 获取origTaxBreakdown属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getOrigTaxBreakdown() {
        return origTaxBreakdown;
    }

    /**
     * 设置origTaxBreakdown属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setOrigTaxBreakdown(ArrayOfTax value) {
        this.origTaxBreakdown = value;
    }

    /**
     * 获取newTaxBreakdown属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getNewTaxBreakdown() {
        return newTaxBreakdown;
    }

    /**
     * 设置newTaxBreakdown属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setNewTaxBreakdown(ArrayOfTax value) {
        this.newTaxBreakdown = value;
    }

}
