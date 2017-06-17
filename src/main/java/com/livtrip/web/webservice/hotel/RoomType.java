
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RoomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfAvailability" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://schemas.tourico.com/webservices/hotelv3}Promotion" minOccurs="0"/&gt;
 *         &lt;element name="Occupancies" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfOccupancy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isNonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="nights" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="startDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="hotelRoomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="isAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomType", propOrder = {
    "availabilityBreakdown",
    "discount",
    "occupancies"
})
public class RoomType {

    @XmlElement(name = "AvailabilityBreakdown")
    protected ArrayOfAvailability availabilityBreakdown;
    @XmlElement(name = "Discount")
    protected Promotion discount;
    @XmlElement(name = "Occupancies")
    protected ArrayOfOccupancy occupancies;
    @XmlAttribute(name = "isNonRefundable")
    protected Boolean isNonRefundable;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "nights", required = true)
    protected int nights;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "productId")
    protected String productId;
    @XmlAttribute(name = "startDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "hotelRoomTypeId", required = true)
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "roomId", required = true)
    protected int roomId;
    @XmlAttribute(name = "isAvailable", required = true)
    protected boolean isAvailable;

    /**
     * 获取availabilityBreakdown属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public ArrayOfAvailability getAvailabilityBreakdown() {
        return availabilityBreakdown;
    }

    /**
     * 设置availabilityBreakdown属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setAvailabilityBreakdown(ArrayOfAvailability value) {
        this.availabilityBreakdown = value;
    }

    /**
     * 获取discount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setDiscount(Promotion value) {
        this.discount = value;
    }

    /**
     * 获取occupancies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOccupancy }
     *     
     */
    public ArrayOfOccupancy getOccupancies() {
        return occupancies;
    }

    /**
     * 设置occupancies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOccupancy }
     *     
     */
    public void setOccupancies(ArrayOfOccupancy value) {
        this.occupancies = value;
    }

    /**
     * 获取isNonRefundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonRefundable() {
        return isNonRefundable;
    }

    /**
     * 设置isNonRefundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRefundable(Boolean value) {
        this.isNonRefundable = value;
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
     * 获取nights属性的值。
     * 
     */
    public int getNights() {
        return nights;
    }

    /**
     * 设置nights属性的值。
     * 
     */
    public void setNights(int value) {
        this.nights = value;
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
     * 获取productId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取hotelRoomTypeId属性的值。
     * 
     */
    public int getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * 设置hotelRoomTypeId属性的值。
     * 
     */
    public void setHotelRoomTypeId(int value) {
        this.hotelRoomTypeId = value;
    }

    /**
     * 获取roomId属性的值。
     * 
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * 设置roomId属性的值。
     * 
     */
    public void setRoomId(int value) {
        this.roomId = value;
    }

    /**
     * 获取isAvailable属性的值。
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * 设置isAvailable属性的值。
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

}
