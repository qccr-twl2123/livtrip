
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelExtraInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelExtraInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stars" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="roomId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" /&gt;
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelExtraInfo")
public class HotelExtraInfo {

    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "stars", required = true)
    protected float stars;
    @XmlAttribute(name = "hotelPhone")
    protected String hotelPhone;
    @XmlAttribute(name = "hotelFax")
    protected String hotelFax;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "roomId")
    protected Integer roomId;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;

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
     * 获取stars属性的值。
     * 
     */
    public float getStars() {
        return stars;
    }

    /**
     * 设置stars属性的值。
     * 
     */
    public void setStars(float value) {
        this.stars = value;
    }

    /**
     * 获取hotelPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPhone() {
        return hotelPhone;
    }

    /**
     * 设置hotelPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPhone(String value) {
        this.hotelPhone = value;
    }

    /**
     * 获取hotelFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelFax() {
        return hotelFax;
    }

    /**
     * 设置hotelFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelFax(String value) {
        this.hotelFax = value;
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
     * 获取roomId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置roomId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomId(Integer value) {
        this.roomId = value;
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

}
