
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Leg complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Leg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="depArCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="arrArCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="depDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="arrDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="airlineCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="airlineName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="depTerm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="arrTerm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mealType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="duration" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg")
public class Leg {

    @XmlAttribute(name = "depArCode")
    protected String depArCode;
    @XmlAttribute(name = "arrArCode")
    protected String arrArCode;
    @XmlAttribute(name = "depDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDateTime;
    @XmlAttribute(name = "arrDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDateTime;
    @XmlAttribute(name = "airlineCode")
    protected String airlineCode;
    @XmlAttribute(name = "airlineName")
    protected String airlineName;
    @XmlAttribute(name = "flightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "depTerm")
    protected String depTerm;
    @XmlAttribute(name = "arrTerm")
    protected String arrTerm;
    @XmlAttribute(name = "mealType")
    protected String mealType;
    @XmlAttribute(name = "duration", required = true)
    protected int duration;

    /**
     * 获取depArCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepArCode() {
        return depArCode;
    }

    /**
     * 设置depArCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArCode(String value) {
        this.depArCode = value;
    }

    /**
     * 获取arrArCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrArCode() {
        return arrArCode;
    }

    /**
     * 设置arrArCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrArCode(String value) {
        this.arrArCode = value;
    }

    /**
     * 获取depDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDateTime() {
        return depDateTime;
    }

    /**
     * 设置depDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDateTime(XMLGregorianCalendar value) {
        this.depDateTime = value;
    }

    /**
     * 获取arrDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrDateTime() {
        return arrDateTime;
    }

    /**
     * 设置arrDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrDateTime(XMLGregorianCalendar value) {
        this.arrDateTime = value;
    }

    /**
     * 获取airlineCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * 设置airlineCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * 获取airlineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * 设置airlineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * 获取depTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTerm() {
        return depTerm;
    }

    /**
     * 设置depTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTerm(String value) {
        this.depTerm = value;
    }

    /**
     * 获取arrTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTerm() {
        return arrTerm;
    }

    /**
     * 设置arrTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTerm(String value) {
        this.arrTerm = value;
    }

    /**
     * 获取mealType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealType() {
        return mealType;
    }

    /**
     * 设置mealType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealType(String value) {
        this.mealType = value;
    }

    /**
     * 获取duration属性的值。
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

}
