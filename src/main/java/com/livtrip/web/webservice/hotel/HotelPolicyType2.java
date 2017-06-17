
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>HotelPolicyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelPolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypePolicy" type="{http://schemas.tourico.com/webservices/hotelv3}RoomTypePolicyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPolicyType", propOrder = {
    "roomTypePolicy"
})
public class HotelPolicyType2 {

    @XmlElement(name = "RoomTypePolicy")
    protected RoomTypePolicyType2 roomTypePolicy;
    @XmlAttribute(name = "hotelId")
    protected Integer hotelId;

    /**
     * 获取roomTypePolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypePolicyType2 }
     *     
     */
    public RoomTypePolicyType2 getRoomTypePolicy() {
        return roomTypePolicy;
    }

    /**
     * 设置roomTypePolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypePolicyType2 }
     *     
     */
    public void setRoomTypePolicy(RoomTypePolicyType2 value) {
        this.roomTypePolicy = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelId(Integer value) {
        this.hotelId = value;
    }

}
