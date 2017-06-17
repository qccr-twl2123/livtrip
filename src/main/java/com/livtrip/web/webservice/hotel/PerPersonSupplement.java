
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerPersonSupplement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerPersonSupplement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Supplement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuppAgeGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementAge" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPersonSupplement", propOrder = {
    "suppAgeGroup"
})
public class PerPersonSupplement
    extends Supplement
{

    @XmlElement(name = "SuppAgeGroup")
    protected ArrayOfSupplementAge suppAgeGroup;

    /**
     * 获取suppAgeGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplementAge }
     *     
     */
    public ArrayOfSupplementAge getSuppAgeGroup() {
        return suppAgeGroup;
    }

    /**
     * 设置suppAgeGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplementAge }
     *     
     */
    public void setSuppAgeGroup(ArrayOfSupplementAge value) {
        this.suppAgeGroup = value;
    }

}
