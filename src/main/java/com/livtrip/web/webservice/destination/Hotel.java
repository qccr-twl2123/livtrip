
package com.livtrip.web.webservice.destination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Hotel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Hotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="destinationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="hotelLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hotelLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stars" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bestVal" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *       &lt;attribute name="providerId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="uploaded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel")
public class Hotel {

    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "hotelName")
    protected String hotelName;
    @XmlAttribute(name = "destinationId", required = true)
    protected int destinationId;
    @XmlAttribute(name = "hotelLatitude")
    protected String hotelLatitude;
    @XmlAttribute(name = "hotelLongitude")
    protected String hotelLongitude;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "zip")
    protected String zip;
    @XmlAttribute(name = "city")
    protected String city;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "stateCode")
    protected String stateCode;
    @XmlAttribute(name = "countryCode")
    protected String countryCode;
    @XmlAttribute(name = "destinationCode")
    protected String destinationCode;
    @XmlAttribute(name = "stars", required = true)
    protected double stars;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "bestVal", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short bestVal;
    @XmlAttribute(name = "providerId", required = true)
    protected int providerId;
    @XmlAttribute(name = "uploaded", required = true)
    protected boolean uploaded;

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
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取destinationId属性的值。
     * 
     */
    public int getDestinationId() {
        return destinationId;
    }

    /**
     * 设置destinationId属性的值。
     * 
     */
    public void setDestinationId(int value) {
        this.destinationId = value;
    }

    /**
     * 获取hotelLatitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelLatitude() {
        return hotelLatitude;
    }

    /**
     * 设置hotelLatitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelLatitude(String value) {
        this.hotelLatitude = value;
    }

    /**
     * 获取hotelLongitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelLongitude() {
        return hotelLongitude;
    }

    /**
     * 设置hotelLongitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelLongitude(String value) {
        this.hotelLongitude = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取zip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * 设置zip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取stateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 设置stateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取destinationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * 设置destinationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * 获取stars属性的值。
     * 
     */
    public double getStars() {
        return stars;
    }

    /**
     * 设置stars属性的值。
     * 
     */
    public void setStars(double value) {
        this.stars = value;
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
     * 获取bestVal属性的值。
     * 
     */
    public short getBestVal() {
        return bestVal;
    }

    /**
     * 设置bestVal属性的值。
     * 
     */
    public void setBestVal(short value) {
        this.bestVal = value;
    }

    /**
     * 获取providerId属性的值。
     * 
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * 设置providerId属性的值。
     * 
     */
    public void setProviderId(int value) {
        this.providerId = value;
    }

    /**
     * 获取uploaded属性的值。
     * 
     */
    public boolean isUploaded() {
        return uploaded;
    }

    /**
     * 设置uploaded属性的值。
     * 
     */
    public void setUploaded(boolean value) {
        this.uploaded = value;
    }

}
