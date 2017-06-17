
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
 *         &lt;element name="SearchHotelsByIdResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/&gt;
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
    "searchHotelsByIdResult"
})
@XmlRootElement(name = "SearchHotelsByIdResponse", namespace = "http://tourico.com/webservices/hotelv3")
public class SearchHotelsByIdResponse {

    @XmlElement(name = "SearchHotelsByIdResult", namespace = "http://tourico.com/webservices/hotelv3")
    protected SearchResult searchHotelsByIdResult;

    /**
     * 获取searchHotelsByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchHotelsByIdResult() {
        return searchHotelsByIdResult;
    }

    /**
     * 设置searchHotelsByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchHotelsByIdResult(SearchResult value) {
        this.searchHotelsByIdResult = value;
    }

}
