
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
 *         &lt;element name="BookHotelV3Result" type="{http://schemas.tourico.com/webservices/hotelv3}RGInfoResults" minOccurs="0"/&gt;
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
    "bookHotelV3Result"
})
@XmlRootElement(name = "BookHotelV3Response", namespace = "http://tourico.com/webservices/hotelv3")
public class BookHotelV3Response {

    @XmlElement(name = "BookHotelV3Result", namespace = "http://tourico.com/webservices/hotelv3")
    protected RGInfoResults bookHotelV3Result;

    /**
     * 获取bookHotelV3Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RGInfoResults }
     *     
     */
    public RGInfoResults getBookHotelV3Result() {
        return bookHotelV3Result;
    }

    /**
     * 设置bookHotelV3Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RGInfoResults }
     *     
     */
    public void setBookHotelV3Result(RGInfoResults value) {
        this.bookHotelV3Result = value;
    }

}
