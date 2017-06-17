
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>RoomInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdultNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChildNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChildAges" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfChildAge" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomInfo", propOrder = {
    "adultNum",
    "childNum",
    "childAges"
})
@XmlSeeAlso({
    Room.class
})
public class RoomInfo {

    @XmlElement(name = "AdultNum")
    protected int adultNum;
    @XmlElement(name = "ChildNum")
    protected int childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfChildAge childAges;

    /**
     * 获取adultNum属性的值。
     * 
     */
    public int getAdultNum() {
        return adultNum;
    }

    /**
     * 设置adultNum属性的值。
     * 
     */
    public void setAdultNum(int value) {
        this.adultNum = value;
    }

    /**
     * 获取childNum属性的值。
     * 
     */
    public int getChildNum() {
        return childNum;
    }

    /**
     * 设置childNum属性的值。
     * 
     */
    public void setChildNum(int value) {
        this.childNum = value;
    }

    /**
     * 获取childAges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChildAge }
     *     
     */
    public ArrayOfChildAge getChildAges() {
        return childAges;
    }

    /**
     * 设置childAges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChildAge }
     *     
     */
    public void setChildAges(ArrayOfChildAge value) {
        this.childAges = value;
    }

}
