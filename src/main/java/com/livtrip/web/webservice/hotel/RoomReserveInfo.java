
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomReserveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomReserveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContactPassenger" type="{http://schemas.tourico.com/webservices/hotelv3}ContactPassenger" minOccurs="0"/&gt;
 *         &lt;element name="SelectedBoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}SelectedBoardBase" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementInfo" minOccurs="0"/&gt;
 *         &lt;element name="Bedding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RoomReserveInfo", propOrder = {
    "roomId",
    "contactPassenger",
    "selectedBoardBase",
    "selectedSupplements",
    "bedding",
    "note",
    "adultNum",
    "childNum",
    "childAges"
})
public class RoomReserveInfo {

    @XmlElement(name = "RoomId")
    protected int roomId;
    @XmlElement(name = "ContactPassenger")
    protected ContactPassenger contactPassenger;
    @XmlElement(name = "SelectedBoardBase")
    protected SelectedBoardBase selectedBoardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplementInfo selectedSupplements;
    @XmlElement(name = "Bedding")
    protected String bedding;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AdultNum")
    protected int adultNum;
    @XmlElement(name = "ChildNum")
    protected int childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfChildAge childAges;

    /**
     * 获取roomId属性的值。
     * 
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * 设置roomId属性的值。
     * 
     */
    public void setRoomId(int value) {
        this.roomId = value;
    }

    /**
     * 获取contactPassenger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactPassenger }
     *     
     */
    public ContactPassenger getContactPassenger() {
        return contactPassenger;
    }

    /**
     * 设置contactPassenger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPassenger }
     *     
     */
    public void setContactPassenger(ContactPassenger value) {
        this.contactPassenger = value;
    }

    /**
     * 获取selectedBoardBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SelectedBoardBase }
     *     
     */
    public SelectedBoardBase getSelectedBoardBase() {
        return selectedBoardBase;
    }

    /**
     * 设置selectedBoardBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedBoardBase }
     *     
     */
    public void setSelectedBoardBase(SelectedBoardBase value) {
        this.selectedBoardBase = value;
    }

    /**
     * 获取selectedSupplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplementInfo }
     *     
     */
    public ArrayOfSupplementInfo getSelectedSupplements() {
        return selectedSupplements;
    }

    /**
     * 设置selectedSupplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplementInfo }
     *     
     */
    public void setSelectedSupplements(ArrayOfSupplementInfo value) {
        this.selectedSupplements = value;
    }

    /**
     * 获取bedding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedding() {
        return bedding;
    }

    /**
     * 设置bedding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedding(String value) {
        this.bedding = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

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
