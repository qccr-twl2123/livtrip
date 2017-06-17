
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlightPassenger complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Passenger"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrequentTravellerDetails" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfFrequentTraveller" minOccurs="0"/&gt;
 *         &lt;element name="PreferredSeat" type="{http://schemas.tourico.com/webservices/hotelv3}PreferredSeat" minOccurs="0"/&gt;
 *         &lt;element name="PreferredMeal" type="{http://schemas.tourico.com/webservices/hotelv3}PreferredMeal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPassenger", propOrder = {
    "frequentTravellerDetails",
    "preferredSeat",
    "preferredMeal"
})
public class FlightPassenger
    extends Passenger
{

    @XmlElement(name = "FrequentTravellerDetails")
    protected ArrayOfFrequentTraveller frequentTravellerDetails;
    @XmlElement(name = "PreferredSeat")
    protected PreferredSeat preferredSeat;
    @XmlElement(name = "PreferredMeal")
    protected PreferredMeal preferredMeal;

    /**
     * 获取frequentTravellerDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFrequentTraveller }
     *     
     */
    public ArrayOfFrequentTraveller getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * 设置frequentTravellerDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFrequentTraveller }
     *     
     */
    public void setFrequentTravellerDetails(ArrayOfFrequentTraveller value) {
        this.frequentTravellerDetails = value;
    }

    /**
     * 获取preferredSeat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferredSeat }
     *     
     */
    public PreferredSeat getPreferredSeat() {
        return preferredSeat;
    }

    /**
     * 设置preferredSeat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredSeat }
     *     
     */
    public void setPreferredSeat(PreferredSeat value) {
        this.preferredSeat = value;
    }

    /**
     * 获取preferredMeal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferredMeal }
     *     
     */
    public PreferredMeal getPreferredMeal() {
        return preferredMeal;
    }

    /**
     * 设置preferredMeal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredMeal }
     *     
     */
    public void setPreferredMeal(PreferredMeal value) {
        this.preferredMeal = value;
    }

}
