
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CyberSourceParams complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CyberSourceParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HttpBrowserCookiesAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HttpBrowserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HttpBrowserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CyberSourceParams", propOrder = {
    "userId",
    "domainName",
    "httpBrowserCookiesAccepted",
    "httpBrowserType",
    "ipAddress",
    "httpBrowserEmail"
})
public class CyberSourceParams {

    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "HttpBrowserCookiesAccepted")
    protected String httpBrowserCookiesAccepted;
    @XmlElement(name = "HttpBrowserType")
    protected String httpBrowserType;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "HttpBrowserEmail")
    protected String httpBrowserEmail;

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取domainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * 设置domainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * 获取httpBrowserCookiesAccepted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserCookiesAccepted() {
        return httpBrowserCookiesAccepted;
    }

    /**
     * 设置httpBrowserCookiesAccepted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserCookiesAccepted(String value) {
        this.httpBrowserCookiesAccepted = value;
    }

    /**
     * 获取httpBrowserType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserType() {
        return httpBrowserType;
    }

    /**
     * 设置httpBrowserType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserType(String value) {
        this.httpBrowserType = value;
    }

    /**
     * 获取ipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置ipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * 获取httpBrowserEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserEmail() {
        return httpBrowserEmail;
    }

    /**
     * 设置httpBrowserEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserEmail(String value) {
        this.httpBrowserEmail = value;
    }

}
