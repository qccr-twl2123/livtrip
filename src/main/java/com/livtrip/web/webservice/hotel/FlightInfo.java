
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>FlightInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segments" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSegment" minOccurs="0"/&gt;
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}FlightPassenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="flightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *       &lt;attribute name="pnr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eTick" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="srvFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="dlvFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfo", propOrder = {
    "segments",
    "passenger"
})
public class FlightInfo
    extends ProductInfo
{

    @XmlElement(name = "Segments")
    protected ArrayOfSegment segments;
    @XmlElement(name = "Passenger")
    protected List<FlightPassenger> passenger;
    @XmlAttribute(name = "flightMode", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short flightMode;
    @XmlAttribute(name = "pnr")
    protected String pnr;
    @XmlAttribute(name = "eTick", required = true)
    protected boolean eTick;
    @XmlAttribute(name = "srvFee", required = true)
    protected BigDecimal srvFee;
    @XmlAttribute(name = "dlvFee", required = true)
    protected BigDecimal dlvFee;

    /**
     * 获取segments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegment }
     *     
     */
    public ArrayOfSegment getSegments() {
        return segments;
    }

    /**
     * 设置segments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegment }
     *     
     */
    public void setSegments(ArrayOfSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightPassenger }
     * 
     * 
     */
    public List<FlightPassenger> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<FlightPassenger>();
        }
        return this.passenger;
    }

    /**
     * 获取flightMode属性的值。
     * 
     */
    public short getFlightMode() {
        return flightMode;
    }

    /**
     * 设置flightMode属性的值。
     * 
     */
    public void setFlightMode(short value) {
        this.flightMode = value;
    }

    /**
     * 获取pnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * 设置pnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnr(String value) {
        this.pnr = value;
    }

    /**
     * 获取eTick属性的值。
     * 
     */
    public boolean isETick() {
        return eTick;
    }

    /**
     * 设置eTick属性的值。
     * 
     */
    public void setETick(boolean value) {
        this.eTick = value;
    }

    /**
     * 获取srvFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrvFee() {
        return srvFee;
    }

    /**
     * 设置srvFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrvFee(BigDecimal value) {
        this.srvFee = value;
    }

    /**
     * 获取dlvFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDlvFee() {
        return dlvFee;
    }

    /**
     * 设置dlvFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDlvFee(BigDecimal value) {
        this.dlvFee = value;
    }

}
