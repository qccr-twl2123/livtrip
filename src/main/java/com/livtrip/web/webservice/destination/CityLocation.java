
package com.livtrip.web.webservice.destination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CityLocation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CityLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}BaseNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hotels" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}Hotels" minOccurs="0"/&gt;
 *         &lt;element name="Activities" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}Activities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cityDestinationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLocation", propOrder = {
    "hotels",
    "activities"
})
public class CityLocation
    extends BaseNode
{

    @XmlElement(name = "Hotels")
    protected Hotels hotels;
    @XmlElement(name = "Activities")
    protected Activities activities;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "destinationCode")
    protected String destinationCode;
    @XmlAttribute(name = "city")
    protected String city;
    @XmlAttribute(name = "cityDestinationId", required = true)
    protected int cityDestinationId;

    /**
     * 获取hotels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Hotels }
     *     
     */
    public Hotels getHotels() {
        return hotels;
    }

    /**
     * 设置hotels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Hotels }
     *     
     */
    public void setHotels(Hotels value) {
        this.hotels = value;
    }

    /**
     * 获取activities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * 设置activities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setActivities(Activities value) {
        this.activities = value;
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
     * 获取cityDestinationId属性的值。
     * 
     */
    public int getCityDestinationId() {
        return cityDestinationId;
    }

    /**
     * 设置cityDestinationId属性的值。
     * 
     */
    public void setCityDestinationId(int value) {
        this.cityDestinationId = value;
    }

}
