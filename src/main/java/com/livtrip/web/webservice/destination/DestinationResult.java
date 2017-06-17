
package com.livtrip.web.webservice.destination;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DestinationResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestinationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Continent" type="{http://touricoholidays.com/WSDestinations/2008/08/DataContracts}Continent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Culture" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResultNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationResult", propOrder = {
    "continent"
})
public class DestinationResult {

    @XmlElement(name = "Continent")
    protected List<Continent> continent;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Culture")
    protected String culture;
    @XmlAttribute(name = "ResultNum", required = true)
    protected int resultNum;
    @XmlAttribute(name = "ServerTime")
    protected String serverTime;

    /**
     * Gets the value of the continent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Continent }
     * 
     * 
     */
    public List<Continent> getContinent() {
        if (continent == null) {
            continent = new ArrayList<Continent>();
        }
        return this.continent;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取culture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * 设置culture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * 获取resultNum属性的值。
     * 
     */
    public int getResultNum() {
        return resultNum;
    }

    /**
     * 设置resultNum属性的值。
     * 
     */
    public void setResultNum(int value) {
        this.resultNum = value;
    }

    /**
     * 获取serverTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTime() {
        return serverTime;
    }

    /**
     * 设置serverTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTime(String value) {
        this.serverTime = value;
    }

}
