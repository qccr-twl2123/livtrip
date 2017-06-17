
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>ReservationResType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}HotelExtraInfo" minOccurs="0"/&gt;
 *         &lt;element name="RoomExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendRoomExtraInfo" minOccurs="0"/&gt;
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}Passenger" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPolicies" type="{http://schemas.tourico.com/webservices/hotelv3}CancellationPoliciesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="origResId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fromDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="toDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="amendmentPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentType" /&gt;
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tranNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="agentRefNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationResType", propOrder = {
    "hotelExtraInfo",
    "roomExtraInfo",
    "passenger",
    "cancellationPolicies"
})
public class ReservationResType {

    @XmlElement(name = "HotelExtraInfo")
    protected HotelExtraInfo hotelExtraInfo;
    @XmlElement(name = "RoomExtraInfo")
    protected AmendRoomExtraInfo roomExtraInfo;
    @XmlElement(name = "Passenger")
    protected Passenger passenger;
    @XmlElement(name = "CancellationPolicies")
    protected CancellationPoliciesType cancellationPolicies;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;
    @XmlAttribute(name = "origResId")
    protected Integer origResId;
    @XmlAttribute(name = "fromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlAttribute(name = "toDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlAttribute(name = "amendmentPrice", required = true)
    protected BigDecimal amendmentPrice;
    @XmlAttribute(name = "type", required = true)
    protected PaymentType type;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "tranNum")
    protected String tranNum;
    @XmlAttribute(name = "agentRefNum")
    protected String agentRefNum;

    /**
     * 获取hotelExtraInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelExtraInfo }
     *     
     */
    public HotelExtraInfo getHotelExtraInfo() {
        return hotelExtraInfo;
    }

    /**
     * 设置hotelExtraInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelExtraInfo }
     *     
     */
    public void setHotelExtraInfo(HotelExtraInfo value) {
        this.hotelExtraInfo = value;
    }

    /**
     * 获取roomExtraInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmendRoomExtraInfo }
     *     
     */
    public AmendRoomExtraInfo getRoomExtraInfo() {
        return roomExtraInfo;
    }

    /**
     * 设置roomExtraInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmendRoomExtraInfo }
     *     
     */
    public void setRoomExtraInfo(AmendRoomExtraInfo value) {
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
     * 获取cancellationPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationPoliciesType }
     *     
     */
    public CancellationPoliciesType getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * 设置cancellationPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPoliciesType }
     *     
     */
    public void setCancellationPolicies(CancellationPoliciesType value) {
        this.cancellationPolicies = value;
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

    /**
     * 获取origResId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrigResId() {
        return origResId;
    }

    /**
     * 设置origResId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrigResId(Integer value) {
        this.origResId = value;
    }

    /**
     * 获取fromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * 设置fromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * 获取toDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * 设置toDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * 获取amendmentPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmendmentPrice() {
        return amendmentPrice;
    }

    /**
     * 设置amendmentPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmendmentPrice(BigDecimal value) {
        this.amendmentPrice = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setType(PaymentType value) {
        this.type = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * 获取tranNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranNum() {
        return tranNum;
    }

    /**
     * 设置tranNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranNum(String value) {
        this.tranNum = value;
    }

    /**
     * 获取agentRefNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRefNum() {
        return agentRefNum;
    }

    /**
     * 设置agentRefNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRefNum(String value) {
        this.agentRefNum = value;
    }

}
