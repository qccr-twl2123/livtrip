
package com.livtrip.web.webservice.destination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Activity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Activity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="activityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="destinationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="activityLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="activityLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *       &lt;attribute name="activityCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="activityCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="providerId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity")
public class Activity {

    @XmlAttribute(name = "activityId", required = true)
    protected int activityId;
    @XmlAttribute(name = "activityName")
    protected String activityName;
    @XmlAttribute(name = "destinationId", required = true)
    protected int destinationId;
    @XmlAttribute(name = "activityLatitude")
    protected String activityLatitude;
    @XmlAttribute(name = "activityLongitude")
    protected String activityLongitude;
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
    @XmlAttribute(name = "activityCategoryID")
    protected String activityCategoryID;
    @XmlAttribute(name = "activityCategory")
    protected String activityCategory;
    @XmlAttribute(name = "providerId", required = true)
    protected int providerId;

    /**
     * 获取activityId属性的值。
     * 
     */
    public int getActivityId() {
        return activityId;
    }

    /**
     * 设置activityId属性的值。
     * 
     */
    public void setActivityId(int value) {
        this.activityId = value;
    }

    /**
     * 获取activityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置activityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
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
     * 获取activityLatitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityLatitude() {
        return activityLatitude;
    }

    /**
     * 设置activityLatitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityLatitude(String value) {
        this.activityLatitude = value;
    }

    /**
     * 获取activityLongitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityLongitude() {
        return activityLongitude;
    }

    /**
     * 设置activityLongitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityLongitude(String value) {
        this.activityLongitude = value;
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
     * 获取activityCategoryID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCategoryID() {
        return activityCategoryID;
    }

    /**
     * 设置activityCategoryID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCategoryID(String value) {
        this.activityCategoryID = value;
    }

    /**
     * 获取activityCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCategory() {
        return activityCategory;
    }

    /**
     * 设置activityCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCategory(String value) {
        this.activityCategory = value;
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

}
