
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
 *         &lt;element name="GetTermAndConditionsResult" type="{http://schemas.tourico.com/webservices/hotelv3}TermAndConditionsResult" minOccurs="0"/&gt;
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
    "getTermAndConditionsResult"
})
@XmlRootElement(name = "GetTermAndConditionsResponse", namespace = "http://tourico.com/webservices/hotelv3")
public class GetTermAndConditionsResponse {

    @XmlElement(name = "GetTermAndConditionsResult", namespace = "http://tourico.com/webservices/hotelv3")
    protected TermAndConditionsResult getTermAndConditionsResult;

    /**
     * 获取getTermAndConditionsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TermAndConditionsResult }
     *     
     */
    public TermAndConditionsResult getGetTermAndConditionsResult() {
        return getTermAndConditionsResult;
    }

    /**
     * 设置getTermAndConditionsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TermAndConditionsResult }
     *     
     */
    public void setGetTermAndConditionsResult(TermAndConditionsResult value) {
        this.getTermAndConditionsResult = value;
    }

}
