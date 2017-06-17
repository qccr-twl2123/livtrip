
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nResId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtCheckIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dtCheckOut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nResId",
    "hotelId",
    "hotelRoomTypeId",
    "productId",
    "dtCheckIn",
    "dtCheckOut"
})
@XmlRootElement(name = "GetCancellationPolicies", namespace = "http://tourico.com/webservices/hotelv3")
public class GetCancellationPolicies {

    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected int nResId;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected int hotelId;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected int hotelRoomTypeId;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected String productId;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCheckIn;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCheckOut;

    /**
     * 获取nResId属性的值。
     * 
     */
    public int getNResId() {
        return nResId;
    }

    /**
     * 设置nResId属性的值。
     * 
     */
    public void setNResId(int value) {
        this.nResId = value;
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
     * 获取dtCheckIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCheckIn() {
        return dtCheckIn;
    }

    /**
     * 设置dtCheckIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCheckIn(XMLGregorianCalendar value) {
        this.dtCheckIn = value;
    }

    /**
     * 获取dtCheckOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCheckOut() {
        return dtCheckOut;
    }

    /**
     * 设置dtCheckOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCheckOut(XMLGregorianCalendar value) {
        this.dtCheckOut = value;
    }

}
