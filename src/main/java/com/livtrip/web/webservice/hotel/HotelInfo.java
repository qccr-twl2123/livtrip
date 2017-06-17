
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>HotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomExtraInfo" minOccurs="0"/&gt;
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}Passenger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" /&gt;
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bestVal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numOfStars" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {
    "roomExtraInfo",
    "passenger"
})
public class HotelInfo
    extends ProductInfo
{

    @XmlElement(name = "RoomExtraInfo")
    protected RoomExtraInfo roomExtraInfo;
    @XmlElement(name = "Passenger")
    protected Passenger passenger;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bestVal", required = true)
    protected boolean bestVal;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "roomType")
    protected String roomType;
    @XmlAttribute(name = "numOfStars", required = true)
    protected BigDecimal numOfStars;

    /**
     * 获取roomExtraInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomExtraInfo }
     *     
     */
    public RoomExtraInfo getRoomExtraInfo() {
        return roomExtraInfo;
    }

    /**
     * 设置roomExtraInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomExtraInfo }
     *     
     */
    public void setRoomExtraInfo(RoomExtraInfo value) {
        this.roomExtraInfo = value;
    }

    /**
     * 获取passenger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * 设置passenger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassenger(Passenger value) {
        this.passenger = value;
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
     * 获取numOfBathrooms属性的值。
     * 
     */
    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    /**
     * 设置numOfBathrooms属性的值。
     * 
     */
    public void setNumOfBathrooms(int value) {
        this.numOfBathrooms = value;
    }

    /**
     * 获取roomTypeCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCategory() {
        return roomTypeCategory;
    }

    /**
     * 设置roomTypeCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCategory(String value) {
        this.roomTypeCategory = value;
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
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * 获取bestVal属性的值。
     * 
     */
    public boolean isBestVal() {
        return bestVal;
    }

    /**
     * 设置bestVal属性的值。
     * 
     */
    public void setBestVal(boolean value) {
        this.bestVal = value;
    }

    /**
     * 获取roomTypeCategoryId属性的值。
     * 
     */
    public int getRoomTypeCategoryId() {
        return roomTypeCategoryId;
    }

    /**
     * 设置roomTypeCategoryId属性的值。
     * 
     */
    public void setRoomTypeCategoryId(int value) {
        this.roomTypeCategoryId = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取numOfStars属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumOfStars() {
        return numOfStars;
    }

    /**
     * 设置numOfStars属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumOfStars(BigDecimal value) {
        this.numOfStars = value;
    }

}
