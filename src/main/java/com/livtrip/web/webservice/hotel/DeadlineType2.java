
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DeadlineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeadlineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="offsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="offsetDropTime" type="{http://schemas.tourico.com/webservices/hotelv3}DeadlineTypeOffsetDropTime" /&gt;
 *       &lt;attribute name="absoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="offsetTimeUnit" type="{http://schemas.tourico.com/webservices/hotelv3}TimeUnitType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadlineType")
public class DeadlineType2 {

    @XmlAttribute(name = "offsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "offsetDropTime")
    protected DeadlineTypeOffsetDropTime2 offsetDropTime;
    @XmlAttribute(name = "absoluteDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    @XmlAttribute(name = "offsetTimeUnit")
    protected TimeUnitType2 offsetTimeUnit;

    /**
     * 获取offsetUnitMultiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /**
     * 设置offsetUnitMultiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetUnitMultiplier(Integer value) {
        this.offsetUnitMultiplier = value;
    }

    /**
     * 获取offsetDropTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeadlineTypeOffsetDropTime2 }
     *     
     */
    public DeadlineTypeOffsetDropTime2 getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * 设置offsetDropTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineTypeOffsetDropTime2 }
     *     
     */
    public void setOffsetDropTime(DeadlineTypeOffsetDropTime2 value) {
        this.offsetDropTime = value;
    }

    /**
     * 获取absoluteDeadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * 设置absoluteDeadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDeadline(XMLGregorianCalendar value) {
        this.absoluteDeadline = value;
    }

    /**
     * 获取offsetTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType2 }
     *     
     */
    public TimeUnitType2 getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * 设置offsetTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType2 }
     *     
     */
    public void setOffsetTimeUnit(TimeUnitType2 value) {
        this.offsetTimeUnit = value;
    }

}
