
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>AmendRoomExtraInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmendRoomExtraInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boardBase" type="{http://schemas.tourico.com/webservices/hotelv3}BoardBaseType" minOccurs="0"/&gt;
 *         &lt;element name="Supplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/&gt;
 *         &lt;element name="roomInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo" minOccurs="0"/&gt;
 *         &lt;element name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="roomId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dblBed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="occupId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRoomExtraInfo", propOrder = {
    "boardBase",
    "supplements",
    "roomInfo",
    "hotelRoomTypeId"
})
public class AmendRoomExtraInfo {

    protected BoardBaseType boardBase;
    @XmlElement(name = "Supplements")
    protected ArrayOfSupplement supplements;
    protected RoomInfo roomInfo;
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "roomId")
    protected Integer roomId;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "dblBed", required = true)
    protected boolean dblBed;
    @XmlAttribute(name = "occupId")
    protected String occupId;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;

    /**
     * 获取boardBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BoardBaseType }
     *     
     */
    public BoardBaseType getBoardBase() {
        return boardBase;
    }

    /**
     * 设置boardBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BoardBaseType }
     *     
     */
    public void setBoardBase(BoardBaseType value) {
        this.boardBase = value;
    }

    /**
     * 获取supplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSupplements() {
        return supplements;
    }

    /**
     * 设置supplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSupplements(ArrayOfSupplement value) {
        this.supplements = value;
    }

    /**
     * 获取roomInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomInfo }
     *     
     */
    public RoomInfo getRoomInfo() {
        return roomInfo;
    }

    /**
     * 设置roomInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomInfo }
     *     
     */
    public void setRoomInfo(RoomInfo value) {
        this.roomInfo = value;
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
     * 获取dblBed属性的值。
     * 
     */
    public boolean isDblBed() {
        return dblBed;
    }

    /**
     * 设置dblBed属性的值。
     * 
     */
    public void setDblBed(boolean value) {
        this.dblBed = value;
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

}
