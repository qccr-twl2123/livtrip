
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSFault complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WSFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WSErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TouricoLogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFault", namespace = "http://schemas.tourico.com/webservices/faults", propOrder = {
    "wsErrorCode",
    "touricoLogId",
    "description"
})
public class WSFault {

    @XmlElement(name = "WSErrorCode")
    protected int wsErrorCode;
    @XmlElement(name = "TouricoLogId")
    protected String touricoLogId;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * 获取wsErrorCode属性的值。
     * 
     */
    public int getWSErrorCode() {
        return wsErrorCode;
    }

    /**
     * 设置wsErrorCode属性的值。
     * 
     */
    public void setWSErrorCode(int value) {
        this.wsErrorCode = value;
    }

    /**
     * 获取touricoLogId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouricoLogId() {
        return touricoLogId;
    }

    /**
     * 设置touricoLogId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouricoLogId(String value) {
        this.touricoLogId = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
