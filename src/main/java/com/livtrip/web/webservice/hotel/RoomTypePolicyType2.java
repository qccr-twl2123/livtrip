
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>RoomTypePolicyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomTypePolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfCancelPenaltyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="checkIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="checkOut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypePolicyType", propOrder = {
    "cancelPolicy"
})
public class RoomTypePolicyType2 {

    @XmlElement(name = "CancelPolicy")
    protected ArrayOfCancelPenaltyType2 cancelPolicy;
    @XmlAttribute(name = "hotelRoomTypeId")
    protected Integer hotelRoomTypeId;
    @XmlAttribute(name = "checkIn")
    protected String checkIn;
    @XmlAttribute(name = "checkOut")
    protected String checkOut;

    /**
     * 获取cancelPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPenaltyType2 }
     *     
     */
    public ArrayOfCancelPenaltyType2 getCancelPolicy() {
        return cancelPolicy;
    }

    /**
     * 设置cancelPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPenaltyType2 }
     *     
     */
    public void setCancelPolicy(ArrayOfCancelPenaltyType2 value) {
        this.cancelPolicy = value;
    }

    /**
     * 获取hotelRoomTypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * 设置hotelRoomTypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelRoomTypeId(Integer value) {
        this.hotelRoomTypeId = value;
    }

    /**
     * 获取checkIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * 设置checkIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckIn(String value) {
        this.checkIn = value;
    }

    /**
     * 获取checkOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * 设置checkOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOut(String value) {
        this.checkOut = value;
    }

}
