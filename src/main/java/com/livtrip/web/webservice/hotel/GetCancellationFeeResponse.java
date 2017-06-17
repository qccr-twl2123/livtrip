
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
 *         &lt;element name="GetCancellationFeeResult" type="{http://tourico.com/webservices/}CancellationFeeInfo" minOccurs="0"/&gt;
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
    "getCancellationFeeResult"
})
@XmlRootElement(name = "GetCancellationFeeResponse", namespace = "http://tourico.com/webservices/")
public class GetCancellationFeeResponse {

    @XmlElement(name = "GetCancellationFeeResult", namespace = "http://tourico.com/webservices/")
    protected CancellationFeeInfo getCancellationFeeResult;

    /**
     * 获取getCancellationFeeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationFeeInfo }
     *     
     */
    public CancellationFeeInfo getGetCancellationFeeResult() {
        return getCancellationFeeResult;
    }

    /**
     * 设置getCancellationFeeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationFeeInfo }
     *     
     */
    public void setGetCancellationFeeResult(CancellationFeeInfo value) {
        this.getCancellationFeeResult = value;
    }

}
