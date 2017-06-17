
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClientCreditCardInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClientCreditCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="System" type="{http://schemas.tourico.com/webservices/hotelv3}CyberSourceParams" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardToken" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCreditCardInfo", propOrder = {
    "system",
    "creditCardToken"
})
public class ClientCreditCardInfo {

    @XmlElement(name = "System")
    protected CyberSourceParams system;
    @XmlElement(name = "CreditCardToken", required = true)
    protected String creditCardToken;

    /**
     * 获取system属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CyberSourceParams }
     *     
     */
    public CyberSourceParams getSystem() {
        return system;
    }

    /**
     * 设置system属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CyberSourceParams }
     *     
     */
    public void setSystem(CyberSourceParams value) {
        this.system = value;
    }

    /**
     * 获取creditCardToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardToken() {
        return creditCardToken;
    }

    /**
     * 设置creditCardToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardToken(String value) {
        this.creditCardToken = value;
    }

}
