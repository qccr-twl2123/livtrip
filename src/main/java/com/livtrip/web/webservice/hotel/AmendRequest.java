
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>AmendRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmendRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordLocatorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SelectedReservations" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservationType" minOccurs="0"/&gt;
 *         &lt;element name="Cci" type="{http://schemas.tourico.com/webservices/hotelv3}CciType" minOccurs="0"/&gt;
 *         &lt;element name="AmendmentPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AmendType" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentType"/&gt;
 *         &lt;element name="DeltaPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOnlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RgldRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyType" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRequest", propOrder = {
    "recordLocatorId",
    "hotelId",
    "hotelRoomTypeId",
    "checkIn",
    "checkOut",
    "selectedReservations",
    "cci",
    "amendmentPrice",
    "amendType",
    "deltaPrice",
    "currency",
    "agentRefNumber",
    "isOnlyAvailable",
    "rgldRefNum",
    "propertyType"
})
public class AmendRequest {

    @XmlElement(name = "RecordLocatorId", required = true, type = Integer.class, nillable = true)
    protected Integer recordLocatorId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelRoomTypeId")
    protected int hotelRoomTypeId;
    @XmlElement(name = "CheckIn", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "SelectedReservations")
    protected ArrayOfReservationType selectedReservations;
    @XmlElement(name = "Cci")
    protected CciType cci;
    @XmlElement(name = "AmendmentPrice", required = true, nillable = true)
    protected BigDecimal amendmentPrice;
    @XmlElement(name = "AmendType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType amendType;
    @XmlElement(name = "DeltaPrice", required = true, nillable = true)
    protected BigDecimal deltaPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "AgentRefNumber")
    protected String agentRefNumber;
    @XmlElement(name = "IsOnlyAvailable")
    protected boolean isOnlyAvailable;
    @XmlElement(name = "RgldRefNum")
    protected String rgldRefNum;
    @XmlElement(name = "PropertyType", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;

    /**
     * 获取recordLocatorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordLocatorId() {
        return recordLocatorId;
    }

    /**
     * 设置recordLocatorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordLocatorId(Integer value) {
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
     * 获取selectedReservations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationType }
     *     
     */
    public ArrayOfReservationType getSelectedReservations() {
        return selectedReservations;
    }

    /**
     * 设置selectedReservations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationType }
     *     
     */
    public void setSelectedReservations(ArrayOfReservationType value) {
        this.selectedReservations = value;
    }

    /**
     * 获取cci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CciType }
     *     
     */
    public CciType getCci() {
        return cci;
    }

    /**
     * 设置cci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CciType }
     *     
     */
    public void setCci(CciType value) {
        this.cci = value;
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
     * 获取amendType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getAmendType() {
        return amendType;
    }

    /**
     * 设置amendType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setAmendType(PaymentType value) {
        this.amendType = value;
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
     * 获取rgldRefNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgldRefNum() {
        return rgldRefNum;
    }

    /**
     * 设置rgldRefNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgldRefNum(String value) {
        this.rgldRefNum = value;
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

}
