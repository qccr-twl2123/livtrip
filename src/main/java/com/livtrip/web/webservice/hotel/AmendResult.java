
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmendResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmendResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Info" type="{http://schemas.tourico.com/webservices}BookInfo" minOccurs="0"/&gt;
 *         &lt;element name="AmendInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendResult", propOrder = {
    "info",
    "amendInfo"
})
public class AmendResult {

    @XmlElement(name = "Info")
    protected BookInfo info;
    @XmlElement(name = "AmendInfo")
    protected AmendInfo amendInfo;

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookInfo }
     *     
     */
    public BookInfo getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookInfo }
     *     
     */
    public void setInfo(BookInfo value) {
        this.info = value;
    }

    /**
     * 获取amendInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmendInfo }
     *     
     */
    public AmendInfo getAmendInfo() {
        return amendInfo;
    }

    /**
     * 设置amendInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInfo }
     *     
     */
    public void setAmendInfo(AmendInfo value) {
        this.amendInfo = value;
    }

}
