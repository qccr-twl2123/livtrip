
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
 *         &lt;element name="CheckAvailabilityAndPricesResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/&gt;
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
    "checkAvailabilityAndPricesResult"
})
@XmlRootElement(name = "CheckAvailabilityAndPricesResponse", namespace = "http://tourico.com/webservices/hotelv3")
public class CheckAvailabilityAndPricesResponse {

    @XmlElement(name = "CheckAvailabilityAndPricesResult", namespace = "http://tourico.com/webservices/hotelv3")
    protected SearchResult checkAvailabilityAndPricesResult;

    /**
     * 获取checkAvailabilityAndPricesResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getCheckAvailabilityAndPricesResult() {
        return checkAvailabilityAndPricesResult;
    }

    /**
     * 设置checkAvailabilityAndPricesResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setCheckAvailabilityAndPricesResult(SearchResult value) {
        this.checkAvailabilityAndPricesResult = value;
    }

}
