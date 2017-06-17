
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PayStayPromotion complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PayStayPromotion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Promotion"&gt;
 *       &lt;attribute name="pay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="stay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayStayPromotion")
public class PayStayPromotion
    extends Promotion
{

    @XmlAttribute(name = "pay", required = true)
    protected int pay;
    @XmlAttribute(name = "stay", required = true)
    protected int stay;

    /**
     * 获取pay属性的值。
     * 
     */
    public int getPay() {
        return pay;
    }

    /**
     * 设置pay属性的值。
     * 
     */
    public void setPay(int value) {
        this.pay = value;
    }

    /**
     * 获取stay属性的值。
     * 
     */
    public int getStay() {
        return stay;
    }

    /**
     * 设置stay属性的值。
     * 
     */
    public void setStay(int value) {
        this.stay = value;
    }

}
