
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>SupplementInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplementInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupAgeGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSuppAges" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="suppId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="supTotalPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="suppType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementInfo", propOrder = {
    "supAgeGroup"
})
public class SupplementInfo {

    @XmlElement(name = "SupAgeGroup")
    protected ArrayOfSuppAges supAgeGroup;
    @XmlAttribute(name = "suppId", required = true)
    protected int suppId;
    @XmlAttribute(name = "supTotalPrice", required = true)
    protected BigDecimal supTotalPrice;
    @XmlAttribute(name = "suppType", required = true)
    protected int suppType;

    /**
     * 获取supAgeGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuppAges }
     *     
     */
    public ArrayOfSuppAges getSupAgeGroup() {
        return supAgeGroup;
    }

    /**
     * 设置supAgeGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuppAges }
     *     
     */
    public void setSupAgeGroup(ArrayOfSuppAges value) {
        this.supAgeGroup = value;
    }

    /**
     * 获取suppId属性的值。
     * 
     */
    public int getSuppId() {
        return suppId;
    }

    /**
     * 设置suppId属性的值。
     * 
     */
    public void setSuppId(int value) {
        this.suppId = value;
    }

    /**
     * 获取supTotalPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupTotalPrice() {
        return supTotalPrice;
    }

    /**
     * 设置supTotalPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupTotalPrice(BigDecimal value) {
        this.supTotalPrice = value;
    }

    /**
     * 获取suppType属性的值。
     * 
     */
    public int getSuppType() {
        return suppType;
    }

    /**
     * 设置suppType属性的值。
     * 
     */
    public void setSuppType(int value) {
        this.suppType = value;
    }

}
