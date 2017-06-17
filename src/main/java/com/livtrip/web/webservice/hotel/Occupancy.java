
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Occupancy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Occupancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfPrice" minOccurs="0"/&gt;
 *         &lt;element name="TaxBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfTax" minOccurs="0"/&gt;
 *         &lt;element name="TaxBreakdownPublish" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfTax" minOccurs="0"/&gt;
 *         &lt;element name="Rooms" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoom" minOccurs="0"/&gt;
 *         &lt;element name="SelctedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/&gt;
 *         &lt;element name="BoardBases" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfBoardbase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="taxPublish" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="avrNightPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="occupId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="occupPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="maxGuests" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="maxChild" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="avrNightPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="occupPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="isPublish" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="bedding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Occupancy", propOrder = {
    "priceBreakdown",
    "taxBreakdown",
    "taxBreakdownPublish",
    "rooms",
    "selctedSupplements",
    "boardBases"
})
public class Occupancy {

    @XmlElement(name = "PriceBreakdown")
    protected ArrayOfPrice priceBreakdown;
    @XmlElement(name = "TaxBreakdown")
    protected ArrayOfTax taxBreakdown;
    @XmlElement(name = "TaxBreakdownPublish")
    protected ArrayOfTax taxBreakdownPublish;
    @XmlElement(name = "Rooms")
    protected ArrayOfRoom rooms;
    @XmlElement(name = "SelctedSupplements")
    protected ArrayOfSupplement selctedSupplements;
    @XmlElement(name = "BoardBases")
    protected ArrayOfBoardbase boardBases;
    @XmlAttribute(name = "taxPublish")
    protected BigDecimal taxPublish;
    @XmlAttribute(name = "avrNightPublishPrice")
    protected BigDecimal avrNightPublishPrice;
    @XmlAttribute(name = "occupId")
    protected String occupId;
    @XmlAttribute(name = "occupPrice", required = true)
    protected BigDecimal occupPrice;
    @XmlAttribute(name = "tax", required = true)
    protected BigDecimal tax;
    @XmlAttribute(name = "maxGuests", required = true)
    protected int maxGuests;
    @XmlAttribute(name = "maxChild", required = true)
    protected int maxChild;
    @XmlAttribute(name = "avrNightPrice", required = true)
    protected BigDecimal avrNightPrice;
    @XmlAttribute(name = "occupPublishPrice")
    protected BigDecimal occupPublishPrice;
    @XmlAttribute(name = "isPublish", required = true)
    protected boolean isPublish;
    @XmlAttribute(name = "bedding")
    protected String bedding;

    /**
     * 获取priceBreakdown属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrice }
     *     
     */
    public ArrayOfPrice getPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * 设置priceBreakdown属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrice }
     *     
     */
    public void setPriceBreakdown(ArrayOfPrice value) {
        this.priceBreakdown = value;
    }

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
     * 获取taxBreakdownPublish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getTaxBreakdownPublish() {
        return taxBreakdownPublish;
    }

    /**
     * 设置taxBreakdownPublish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setTaxBreakdownPublish(ArrayOfTax value) {
        this.taxBreakdownPublish = value;
    }

    /**
     * 获取rooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoom }
     *     
     */
    public ArrayOfRoom getRooms() {
        return rooms;
    }

    /**
     * 设置rooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoom }
     *     
     */
    public void setRooms(ArrayOfRoom value) {
        this.rooms = value;
    }

    /**
     * 获取selctedSupplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSelctedSupplements() {
        return selctedSupplements;
    }

    /**
     * 设置selctedSupplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSelctedSupplements(ArrayOfSupplement value) {
        this.selctedSupplements = value;
    }

    /**
     * 获取boardBases属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBoardbase }
     *     
     */
    public ArrayOfBoardbase getBoardBases() {
        return boardBases;
    }

    /**
     * 设置boardBases属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBoardbase }
     *     
     */
    public void setBoardBases(ArrayOfBoardbase value) {
        this.boardBases = value;
    }

    /**
     * 获取taxPublish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPublish() {
        return taxPublish;
    }

    /**
     * 设置taxPublish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPublish(BigDecimal value) {
        this.taxPublish = value;
    }

    /**
     * 获取avrNightPublishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrNightPublishPrice() {
        return avrNightPublishPrice;
    }

    /**
     * 设置avrNightPublishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrNightPublishPrice(BigDecimal value) {
        this.avrNightPublishPrice = value;
    }

    /**
     * 获取occupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupId() {
        return occupId;
    }

    /**
     * 设置occupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupId(String value) {
        this.occupId = value;
    }

    /**
     * 获取occupPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupPrice() {
        return occupPrice;
    }

    /**
     * 设置occupPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupPrice(BigDecimal value) {
        this.occupPrice = value;
    }

    /**
     * 获取tax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * 设置tax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * 获取maxGuests属性的值。
     * 
     */
    public int getMaxGuests() {
        return maxGuests;
    }

    /**
     * 设置maxGuests属性的值。
     * 
     */
    public void setMaxGuests(int value) {
        this.maxGuests = value;
    }

    /**
     * 获取maxChild属性的值。
     * 
     */
    public int getMaxChild() {
        return maxChild;
    }

    /**
     * 设置maxChild属性的值。
     * 
     */
    public void setMaxChild(int value) {
        this.maxChild = value;
    }

    /**
     * 获取avrNightPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrNightPrice() {
        return avrNightPrice;
    }

    /**
     * 设置avrNightPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrNightPrice(BigDecimal value) {
        this.avrNightPrice = value;
    }

    /**
     * 获取occupPublishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupPublishPrice() {
        return occupPublishPrice;
    }

    /**
     * 设置occupPublishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupPublishPrice(BigDecimal value) {
        this.occupPublishPrice = value;
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
     * 获取bedding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedding() {
        return bedding;
    }

    /**
     * 设置bedding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedding(String value) {
        this.bedding = value;
    }

}
