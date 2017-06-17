
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>RoomExtraInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomExtraInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo" minOccurs="0"/&gt;
 *         &lt;element name="BoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}Boardbase" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hotelRoomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bedding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomExtraInfo", propOrder = {
    "roomInfo",
    "boardBase",
    "selectedSupplements"
})
public class RoomExtraInfo {

    @XmlElement(name = "RoomInfo")
    protected RoomInfo roomInfo;
    @XmlElement(name = "BoardBase")
    protected Boardbase boardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplement selectedSupplements;
    @XmlAttribute(name = "hotelRoomTypeId", required = true)
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomId", required = true)
    protected int roomId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bedding")
    protected String bedding;

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
     * 获取boardBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boardbase }
     *     
     */
    public Boardbase getBoardBase() {
        return boardBase;
    }

    /**
     * 设置boardBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boardbase }
     *     
     */
    public void setBoardBase(Boardbase value) {
        this.boardBase = value;
    }

    /**
     * 获取selectedSupplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSelectedSupplements() {
        return selectedSupplements;
    }

    /**
     * 设置selectedSupplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSelectedSupplements(ArrayOfSupplement value) {
        this.selectedSupplements = value;
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
