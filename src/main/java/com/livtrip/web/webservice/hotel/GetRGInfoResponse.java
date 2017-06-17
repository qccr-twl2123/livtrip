
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
 *         &lt;element name="GetRGInfoResult" type="{http://schemas.tourico.com/webservices/hotelv3}RGInfoResults" minOccurs="0"/&gt;
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
    "getRGInfoResult"
})
@XmlRootElement(name = "GetRGInfoResponse", namespace = "http://tourico.com/webservices/hotelv3")
public class GetRGInfoResponse {

    @XmlElement(name = "GetRGInfoResult", namespace = "http://tourico.com/webservices/hotelv3")
    protected RGInfoResults getRGInfoResult;

    /**
     * 获取getRGInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RGInfoResults }
     *     
     */
    public RGInfoResults getGetRGInfoResult() {
        return getRGInfoResult;
    }

    /**
     * 设置getRGInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RGInfoResults }
     *     
     */
    public void setGetRGInfoResult(RGInfoResults value) {
        this.getRGInfoResult = value;
    }

}
