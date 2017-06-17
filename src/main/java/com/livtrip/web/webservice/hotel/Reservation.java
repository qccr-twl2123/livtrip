
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Reservation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfTax" minOccurs="0"/&gt;
 *         &lt;element name="ProductInfo" type="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fromDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="toDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="totalTax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="totalPublishTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="publishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="isPublish" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numOfAdults" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="numOfChildren" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tranNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", propOrder = {
    "taxBreakdown",
    "productInfo"
})
public class Reservation {

    @XmlElement(name = "TaxBreakdown")
    protected ArrayOfTax taxBreakdown;
    @XmlElement(name = "ProductInfo")
    protected ProductInfo productInfo;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;
    @XmlAttribute(name = "fromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlAttribute(name = "toDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlAttribute(name = "totalTax", required = true)
    protected BigDecimal totalTax;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "totalPublishTax")
    protected BigDecimal totalPublishTax;
    @XmlAttribute(name = "publishPrice")
    protected BigDecimal publishPrice;
    @XmlAttribute(name = "isPublish", required = true)
    protected boolean isPublish;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "numOfAdults", required = true)
    protected int numOfAdults;
    @XmlAttribute(name = "numOfChildren", required = true)
    protected int numOfChildren;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "tranNum", required = true)
    protected int tranNum;

    /**
     * 获取taxBreakdown属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getTaxBreakdown() {
        return taxBreakdown;
    }

    /**
     * 设置taxBreakdown属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setTaxBreakdown(ArrayOfTax value) {
        this.taxBreakdown = value;
    }

    /**
     * 获取productInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductInfo }
     *     
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * 设置productInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfo }
     *     
     */
    public void setProductInfo(ProductInfo value) {
        this.productInfo = value;
    }

    /**
     * 获取reservationId属性的值。
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * 设置reservationId属性的值。
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * 获取fromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * 设置fromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * 获取toDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * 设置toDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * 获取totalTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * 设置totalTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
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
     * 获取totalPublishTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPublishTax() {
        return totalPublishTax;
    }

    /**
     * 设置totalPublishTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPublishTax(BigDecimal value) {
        this.totalPublishTax = value;
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

    /**
     * 获取isPublish属性的值。
     * 
     */
    public boolean isIsPublish() {
        return isPublish;
    }

    /**
     * 设置isPublish属性的值。
     * 
     */
    public void setIsPublish(boolean value) {
        this.isPublish = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取numOfAdults属性的值。
     * 
     */
    public int getNumOfAdults() {
        return numOfAdults;
    }

    /**
     * 设置numOfAdults属性的值。
     * 
     */
    public void setNumOfAdults(int value) {
        this.numOfAdults = value;
    }

    /**
     * 获取numOfChildren属性的值。
     * 
     */
    public int getNumOfChildren() {
        return numOfChildren;
    }

    /**
     * 设置numOfChildren属性的值。
     * 
     */
    public void setNumOfChildren(int value) {
        this.numOfChildren = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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

}
