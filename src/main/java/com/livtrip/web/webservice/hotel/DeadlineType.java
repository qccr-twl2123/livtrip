
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
 *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OffsetTimeUnit" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}TimeUnitType" /&gt;
 *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OffsetDropTime" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}DeadlineTypeOffsetDropTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadlineType", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd")
public class DeadlineType {

    @XmlAttribute(name = "AbsoluteDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected TimeUnitType offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected DeadlineTypeOffsetDropTime offsetDropTime;

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
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * 设置offsetTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setOffsetTimeUnit(TimeUnitType value) {
        this.offsetTimeUnit = value;
    }

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
     *     {@link DeadlineTypeOffsetDropTime }
     *     
     */
    public DeadlineTypeOffsetDropTime getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * 设置offsetDropTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineTypeOffsetDropTime }
     *     
     */
    public void setOffsetDropTime(DeadlineTypeOffsetDropTime value) {
        this.offsetDropTime = value;
    }

}
