
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Segment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Segment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Legs" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfLeg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="totalDur" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="depArCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="arrDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="arrArCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="depDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "legs"
})
public class Segment {

    @XmlElement(name = "Legs")
    protected ArrayOfLeg legs;
    @XmlAttribute(name = "totalDur", required = true)
    protected int totalDur;
    @XmlAttribute(name = "depArCode")
    protected String depArCode;
    @XmlAttribute(name = "arrDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDate;
    @XmlAttribute(name = "arrArCode")
    protected String arrArCode;
    @XmlAttribute(name = "depDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDate;

    /**
     * 获取legs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeg }
     *     
     */
    public ArrayOfLeg getLegs() {
        return legs;
    }

    /**
     * 设置legs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeg }
     *     
     */
    public void setLegs(ArrayOfLeg value) {
        this.legs = value;
    }

    /**
     * 获取totalDur属性的值。
     * 
     */
    public int getTotalDur() {
        return totalDur;
    }

    /**
     * 设置totalDur属性的值。
     * 
     */
    public void setTotalDur(int value) {
        this.totalDur = value;
    }

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
     * 获取arrDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrDate() {
        return arrDate;
    }

    /**
     * 设置arrDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrDate(XMLGregorianCalendar value) {
        this.arrDate = value;
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
     * 获取depDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDate() {
        return depDate;
    }

    /**
     * 设置depDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDate(XMLGregorianCalendar value) {
        this.depDate = value;
    }

}
