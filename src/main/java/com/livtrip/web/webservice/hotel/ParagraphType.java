
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Text" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}FormattedTextTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd", propOrder = {
    "text"
})
public class ParagraphType {

    @XmlElement(name = "Text")
    protected List<FormattedTextTextType> text;
    @XmlAttribute(name = "ParagraphNumber")
    protected Integer paragraphNumber;

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * 
     * 
     */
    public List<FormattedTextTextType> getText() {
        if (text == null) {
            text = new ArrayList<FormattedTextTextType>();
        }
        return this.text;
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
