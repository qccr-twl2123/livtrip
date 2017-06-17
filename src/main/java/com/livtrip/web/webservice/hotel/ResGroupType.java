
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>ResGroupType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reservation" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservationResType" minOccurs="0"/&gt;
 *         &lt;element name="Billing" type="{http://schemas.tourico.com/webservices/hotelv3}BillingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rGID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="rgldRefNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGroupType", propOrder = {
    "reservation",
    "billing"
})
public class ResGroupType {

    @XmlElement(name = "Reservation")
    protected ArrayOfReservationResType reservation;
    @XmlElement(name = "Billing")
    protected BillingType billing;
    @XmlAttribute(name = "rGID", required = true)
    protected int rgid;
    @XmlAttribute(name = "rgldRefNum")
    protected String rgldRefNum;

    /**
     * 获取reservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationResType }
     *     
     */
    public ArrayOfReservationResType getReservation() {
        return reservation;
    }

    /**
     * 设置reservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationResType }
     *     
     */
    public void setReservation(ArrayOfReservationResType value) {
        this.reservation = value;
    }

    /**
     * 获取billing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingType }
     *     
     */
    public BillingType getBilling() {
        return billing;
    }

    /**
     * 设置billing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingType }
     *     
     */
    public void setBilling(BillingType value) {
        this.billing = value;
    }

    /**
     * 获取rgid属性的值。
     * 
     */
    public int getRGID() {
        return rgid;
    }

    /**
     * 设置rgid属性的值。
     * 
     */
    public void setRGID(int value) {
        this.rgid = value;
    }

    /**
     * 获取rgldRefNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgldRefNum() {
        return rgldRefNum;
    }

    /**
     * 设置rgldRefNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgldRefNum(String value) {
        this.rgldRefNum = value;
    }

}
