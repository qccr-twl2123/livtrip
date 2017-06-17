
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>AmendInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmendInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ResGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendInfo", propOrder = {
    "resGroup"
})
public class AmendInfo {

    @XmlElement(name = "ResGroup")
    protected ResGroupType resGroup;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * 获取resGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGroupType }
     *     
     */
    public ResGroupType getResGroup() {
        return resGroup;
    }

    /**
     * 设置resGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGroupType }
     *     
     */
    public void setResGroup(ResGroupType value) {
        this.resGroup = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
