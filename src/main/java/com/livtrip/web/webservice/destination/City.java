
package com.livtrip.web.webservice.destination;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>City complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="City"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}BaseNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CityLocation" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}CityLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hotels" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}Hotels" minOccurs="0"/&gt;
 *         &lt;element name="Activities" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}Activities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cityLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cityLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "City", propOrder = {
    "cityLocation",
    "hotels",
    "activities"
})
public class City
    extends BaseNode
{

    @XmlElement(name = "CityLocation")
    protected List<CityLocation> cityLocation;
    @XmlElement(name = "Hotels")
    protected Hotels hotels;
    @XmlElement(name = "Activities")
    protected Activities activities;
    @XmlAttribute(name = "destinationCode")
    protected String destinationCode;
    @XmlAttribute(name = "cityLatitude")
    protected String cityLatitude;
    @XmlAttribute(name = "cityLongitude")
    protected String cityLongitude;

    /**
     * Gets the value of the cityLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityLocation }
     * 
     * 
     */
    public List<CityLocation> getCityLocation() {
        if (cityLocation == null) {
            cityLocation = new ArrayList<CityLocation>();
        }
        return this.cityLocation;
    }

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
     * 获取cityLatitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityLatitude() {
        return cityLatitude;
    }

    /**
     * 设置cityLatitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityLatitude(String value) {
        this.cityLatitude = value;
    }

    /**
     * 获取cityLongitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityLongitude() {
        return cityLongitude;
    }

    /**
     * 设置cityLongitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityLongitude(String value) {
        this.cityLongitude = value;
    }

}
