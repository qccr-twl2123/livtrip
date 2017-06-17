
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PolicyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}HotelPolicyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "hotelPolicy"
})
public class PolicyType {

    @XmlElement(name = "HotelPolicy")
    protected HotelPolicyType2 hotelPolicy;

    /**
     * 获取hotelPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelPolicyType2 }
     *     
     */
    public HotelPolicyType2 getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * 设置hotelPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPolicyType2 }
     *     
     */
    public void setHotelPolicy(HotelPolicyType2 value) {
        this.hotelPolicy = value;
    }

}
