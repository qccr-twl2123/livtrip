
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
 *         &lt;element name="HotelId" type="{http://schemas.tourico.com/webservices/hotelv3}TermAndConditionsRequest" minOccurs="0"/&gt;
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
    "hotelId"
})
@XmlRootElement(name = "GetTermAndConditions", namespace = "http://tourico.com/webservices/hotelv3")
public class GetTermAndConditions {

    @XmlElement(name = "HotelId", namespace = "http://tourico.com/webservices/hotelv3")
    protected TermAndConditionsRequest hotelId;

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TermAndConditionsRequest }
     *     
     */
    public TermAndConditionsRequest getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TermAndConditionsRequest }
     *     
     */
    public void setHotelId(TermAndConditionsRequest value) {
        this.hotelId = value;
    }

}
