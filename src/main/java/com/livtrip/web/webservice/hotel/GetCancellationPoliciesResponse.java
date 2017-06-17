
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}HotelPolicy" minOccurs="0"/&gt;
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
    "hotelPolicy"
})
@XmlRootElement(name = "GetCancellationPoliciesResponse", namespace = "http://tourico.com/webservices/")
public class GetCancellationPoliciesResponse {

    @XmlElement(name = "HotelPolicy", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd")
    protected HotelPolicyType hotelPolicy;

    /**
     * 获取hotelPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelPolicyType }
     *     
     */
    public HotelPolicyType getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * 设置hotelPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPolicyType }
     *     
     */
    public void setHotelPolicy(HotelPolicyType value) {
        this.hotelPolicy = value;
    }

}
