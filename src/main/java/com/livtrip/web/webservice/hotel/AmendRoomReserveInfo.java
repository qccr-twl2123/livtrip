
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmendRoomReserveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmendRoomReserveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactPassenger" type="{http://schemas.tourico.com/webservices/hotelv3}ContactPassenger" minOccurs="0"/&gt;
 *         &lt;element name="SelectedBoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}SelectedBoardBase" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementInfo" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRoomReserveInfo", propOrder = {
    "contactPassenger",
    "selectedBoardBase",
    "selectedSupplements",
    "note"
})
public class AmendRoomReserveInfo {

    @XmlElement(name = "ContactPassenger")
    protected ContactPassenger contactPassenger;
    @XmlElement(name = "SelectedBoardBase")
    protected SelectedBoardBase selectedBoardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplementInfo selectedSupplements;
    @XmlElement(name = "Note")
    protected String note;

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

}
