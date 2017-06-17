
package com.livtrip.web.webservice.destination;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>State complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="State"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}BaseNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="City" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}City" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StateShort" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "State", propOrder = {
    "city"
})
public class State
    extends BaseNode
{

    @XmlElement(name = "City")
    protected List<City> city;
    @XmlAttribute(name = "StateShort")
    protected String stateShort;

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link City }
     * 
     * 
     */
    public List<City> getCity() {
        if (city == null) {
            city = new ArrayList<City>();
        }
        return this.city;
    }

    /**
     * 获取stateShort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateShort() {
        return stateShort;
    }

    /**
     * 设置stateShort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateShort(String value) {
        this.stateShort = value;
    }

}
