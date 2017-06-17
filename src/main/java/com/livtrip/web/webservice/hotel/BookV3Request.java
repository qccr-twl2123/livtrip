
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>BookV3Request complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookV3Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordLocatorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RoomsInfo" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomReserveInfo" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentTypes"/&gt;
 *         &lt;element name="CCI" type="{http://schemas.tourico.com/webservices/hotelv3}ClientCreditCardInfo" minOccurs="0"/&gt;
 *         &lt;element name="AgentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeltaPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOnlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookV3Request", propOrder = {
    "recordLocatorId",
    "hotelId",
    "hotelRoomTypeId",
    "checkIn",
    "checkOut",
    "roomsInfo",
    "paymentType",
    "cci",
    "agentRefNumber",
    "contactInfo",
    "requestedPrice",
    "deltaPrice",
    "currency",
    "isOnlyAvailable",
    "confirmationEmail",
    "confirmationLogo"
})
public class BookV3Request {

    @XmlElement(name = "RecordLocatorId")
    protected int recordLocatorId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelRoomTypeId")
    protected int hotelRoomTypeId;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "RoomsInfo")
    protected ArrayOfRoomReserveInfo roomsInfo;
    @XmlElement(name = "PaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentTypes paymentType;
    @XmlElement(name = "CCI")
    protected ClientCreditCardInfo cci;
    @XmlElement(name = "AgentRefNumber")
    protected String agentRefNumber;
    @XmlElement(name = "ContactInfo")
    protected String contactInfo;
    @XmlElement(name = "RequestedPrice", required = true)
    protected BigDecimal requestedPrice;
    @XmlElement(name = "DeltaPrice", required = true)
    protected BigDecimal deltaPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "IsOnlyAvailable")
    protected boolean isOnlyAvailable;
    @XmlElement(name = "ConfirmationEmail")
    protected String confirmationEmail;
    @XmlElement(name = "ConfirmationLogo")
    protected String confirmationLogo;

    /**
     * 获取recordLocatorId属性的值。
     * 
     */
    public int getRecordLocatorId() {
        return recordLocatorId;
    }

    /**
     * 设置recordLocatorId属性的值。
     * 
     */
    public void setRecordLocatorId(int value) {
        this.recordLocatorId = value;
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
     * 获取checkIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * 设置checkIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * 获取checkOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * 设置checkOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * 获取roomsInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomReserveInfo }
     *     
     */
    public ArrayOfRoomReserveInfo getRoomsInfo() {
        return roomsInfo;
    }

    /**
     * 设置roomsInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomReserveInfo }
     *     
     */
    public void setRoomsInfo(ArrayOfRoomReserveInfo value) {
        this.roomsInfo = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentType(PaymentTypes value) {
        this.paymentType = value;
    }

    /**
     * 获取cci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientCreditCardInfo }
     *     
     */
    public ClientCreditCardInfo getCCI() {
        return cci;
    }

    /**
     * 设置cci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCreditCardInfo }
     *     
     */
    public void setCCI(ClientCreditCardInfo value) {
        this.cci = value;
    }

    /**
     * 获取agentRefNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRefNumber() {
        return agentRefNumber;
    }

    /**
     * 设置agentRefNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRefNumber(String value) {
        this.agentRefNumber = value;
    }

    /**
     * 获取contactInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * 设置contactInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * 获取requestedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * 设置requestedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedPrice(BigDecimal value) {
        this.requestedPrice = value;
    }

    /**
     * 获取deltaPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaPrice() {
        return deltaPrice;
    }

    /**
     * 设置deltaPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaPrice(BigDecimal value) {
        this.deltaPrice = value;
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
     * 获取isOnlyAvailable属性的值。
     * 
     */
    public boolean isIsOnlyAvailable() {
        return isOnlyAvailable;
    }

    /**
     * 设置isOnlyAvailable属性的值。
     * 
     */
    public void setIsOnlyAvailable(boolean value) {
        this.isOnlyAvailable = value;
    }

    /**
     * 获取confirmationEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * 设置confirmationEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmail(String value) {
        this.confirmationEmail = value;
    }

    /**
     * 获取confirmationLogo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationLogo() {
        return confirmationLogo;
    }

    /**
     * 设置confirmationLogo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationLogo(String value) {
        this.confirmationLogo = value;
    }

}
