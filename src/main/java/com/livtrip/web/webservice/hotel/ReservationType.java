
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>ReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdultsNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChildNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChildAges" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="RoomReserveInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendRoomReserveInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationType", propOrder = {
    "adultsNum",
    "childNum",
    "childAges",
    "roomReserveInfo"
})
public class ReservationType {

    @XmlElementRef(name = "AdultsNum", namespace = "http://schemas.tourico.com/webservices/hotelv3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> adultsNum;
    @XmlElementRef(name = "ChildNum", namespace = "http://schemas.tourico.com/webservices/hotelv3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfInt childAges;
    @XmlElement(name = "RoomReserveInfo")
    protected AmendRoomReserveInfo roomReserveInfo;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;

    /**
     * 获取adultsNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdultsNum() {
        return adultsNum;
    }

    /**
     * 设置adultsNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdultsNum(JAXBElement<Integer> value) {
        this.adultsNum = value;
    }

    /**
     * 获取childNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChildNum() {
        return childNum;
    }

    /**
     * 设置childNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChildNum(JAXBElement<Integer> value) {
        this.childNum = value;
    }

    /**
     * 获取childAges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildAges() {
        return childAges;
    }

    /**
     * 设置childAges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildAges(ArrayOfInt value) {
        this.childAges = value;
    }

    /**
     * 获取roomReserveInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmendRoomReserveInfo }
     *     
     */
    public AmendRoomReserveInfo getRoomReserveInfo() {
        return roomReserveInfo;
    }

    /**
     * 设置roomReserveInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmendRoomReserveInfo }
     *     
     */
    public void setRoomReserveInfo(AmendRoomReserveInfo value) {
        this.roomReserveInfo = value;
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

}
