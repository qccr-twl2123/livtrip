
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RGInfoResults complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RGInfoResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Info" type="{http://schemas.tourico.com/webservices}BookInfo" minOccurs="0"/&gt;
 *         &lt;element name="ResGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ResGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGInfoResults", propOrder = {
    "info",
    "resGroup"
})
public class RGInfoResults {

    @XmlElement(name = "Info")
    protected BookInfo info;
    @XmlElement(name = "ResGroup")
    protected ResGroup resGroup;

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
     * 获取resGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGroup }
     *     
     */
    public ResGroup getResGroup() {
        return resGroup;
    }

    /**
     * 设置resGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGroup }
     *     
     */
    public void setResGroup(ResGroup value) {
        this.resGroup = value;
    }

}
