
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Hotel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Hotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://schemas.tourico.com/webservices/hotelv3}HotelLocation" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypes" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="brandId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="minAverPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bestValue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minAverPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="starsLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "location",
    "roomTypes"
})
public class Hotel {

    @XmlElement(name = "Location")
    protected HotelLocation location;
    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomType roomTypes;
    @XmlAttribute(name = "brandId", required = true)
    protected int brandId;
    @XmlAttribute(name = "brandName")
    protected String brandName;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;
    @XmlAttribute(name = "minAverPublishPrice")
    protected BigDecimal minAverPublishPrice;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bestValue", required = true)
    protected boolean bestValue;
    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "minAverPrice", required = true)
    protected BigDecimal minAverPrice;
    @XmlAttribute(name = "starsLevel", required = true)
    protected BigDecimal starsLevel;
    @XmlAttribute(name = "desc")
    protected String desc;

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelLocation }
     *     
     */
    public HotelLocation getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelLocation }
     *     
     */
    public void setLocation(HotelLocation value) {
        this.location = value;
    }

    /**
     * 获取roomTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * 设置roomTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

    /**
     * 获取brandId属性的值。
     * 
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * 设置brandId属性的值。
     * 
     */
    public void setBrandId(int value) {
        this.brandId = value;
    }

    /**
     * 获取brandName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置brandName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * 获取propertySubType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySubType() {
        return propertySubType;
    }

    /**
     * 设置propertySubType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySubType(String value) {
        this.propertySubType = value;
    }

    /**
     * 获取numOfRoom属性的值。
     * 
     */
    public int getNumOfRoom() {
        return numOfRoom;
    }

    /**
     * 设置numOfRoom属性的值。
     * 
     */
    public void setNumOfRoom(int value) {
        this.numOfRoom = value;
    }

    /**
     * 获取minAverPublishPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAverPublishPrice() {
        return minAverPublishPrice;
    }

    /**
     * 设置minAverPublishPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAverPublishPrice(BigDecimal value) {
        this.minAverPublishPrice = value;
    }

    /**
     * 获取propertyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * 设置propertyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取bestValue属性的值。
     * 
     */
    public boolean isBestValue() {
        return bestValue;
    }

    /**
     * 设置bestValue属性的值。
     * 
     */
    public void setBestValue(boolean value) {
        this.bestValue = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * 获取provider属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置provider属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * 获取thumb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * 设置thumb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumb(String value) {
        this.thumb = value;
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
     * 获取minAverPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAverPrice() {
        return minAverPrice;
    }

    /**
     * 设置minAverPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAverPrice(BigDecimal value) {
        this.minAverPrice = value;
    }

    /**
     * 获取starsLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStarsLevel() {
        return starsLevel;
    }

    /**
     * 设置starsLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStarsLevel(BigDecimal value) {
        this.starsLevel = value;
    }

    /**
     * 获取desc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置desc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
