
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
 *         &lt;element name="nResID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="clxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "nResID",
    "clxDate"
})
@XmlRootElement(name = "GetCancellationFee", namespace = "http://tourico.com/webservices/hotelv3")
public class GetCancellationFee {

    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected int nResID;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clxDate;

    /**
     * 获取nResID属性的值。
     * 
     */
    public int getNResID() {
        return nResID;
    }

    /**
     * 设置nResID属性的值。
     * 
     */
    public void setNResID(int value) {
        this.nResID = value;
    }

    /**
     * 获取clxDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClxDate() {
        return clxDate;
    }

    /**
     * 设置clxDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClxDate(XMLGregorianCalendar value) {
        this.clxDate = value;
    }

}
