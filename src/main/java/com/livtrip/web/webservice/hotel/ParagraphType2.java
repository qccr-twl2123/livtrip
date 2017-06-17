
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParagraphType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ParagraphType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="items" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfFormattedTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paragraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "items"
})
public class ParagraphType2 {

    protected ArrayOfFormattedTextType items;
    @XmlAttribute(name = "paragraphNumber")
    protected Integer paragraphNumber;

    /**
     * 获取items属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public ArrayOfFormattedTextType getItems() {
        return items;
    }

    /**
     * 设置items属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public void setItems(ArrayOfFormattedTextType value) {
        this.items = value;
    }

    /**
     * 获取paragraphNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParagraphNumber() {
        return paragraphNumber;
    }

    /**
     * 设置paragraphNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParagraphNumber(Integer value) {
        this.paragraphNumber = value;
    }

}
