
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Room complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Room"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo"&gt;
 *       &lt;attribute name="seqNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room")
public class Room
    extends RoomInfo
{

    @XmlAttribute(name = "seqNum", required = true)
    protected int seqNum;

    /**
     * 获取seqNum属性的值。
     * 
     */
    public int getSeqNum() {
        return seqNum;
    }

    /**
     * 设置seqNum属性的值。
     * 
     */
    public void setSeqNum(int value) {
        this.seqNum = value;
    }

}
