
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
 *         &lt;element name="GetHotelDetailsV3Result" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any namespace='http://tempuri.org/TWS_HotelDetailsV3.xsd'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "getHotelDetailsV3Result"
})
@XmlRootElement(name = "GetHotelDetailsV3Response", namespace = "http://tourico.com/webservices/hotelv3")
public class GetHotelDetailsV3Response {

    @XmlElement(name = "GetHotelDetailsV3Result", namespace = "http://tourico.com/webservices/hotelv3")
    protected GetHotelDetailsV3Response.GetHotelDetailsV3Result getHotelDetailsV3Result;

    /**
     * 获取getHotelDetailsV3Result属性的值。
     *
     * @return
     *     possible object is
     *     {@link GetHotelDetailsV3Response.GetHotelDetailsV3Result }
     *
     */
    public GetHotelDetailsV3Response.GetHotelDetailsV3Result getGetHotelDetailsV3Result() {
        return getHotelDetailsV3Result;
    }

    /**
     * 设置getHotelDetailsV3Result属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GetHotelDetailsV3Response.GetHotelDetailsV3Result }
     *
     */
    public void setGetHotelDetailsV3Result(GetHotelDetailsV3Response.GetHotelDetailsV3Result value) {
        this.getHotelDetailsV3Result = value;
    }


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
     *         &lt;any namespace='http://tempuri.org/TWS_HotelDetailsV3.xsd'/&gt;
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
        "any"
    })
    public static class GetHotelDetailsV3Result {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
