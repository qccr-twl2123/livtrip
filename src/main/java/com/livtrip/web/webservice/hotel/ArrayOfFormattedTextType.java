
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfFormattedTextType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFormattedTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedTextType" type="{http://schemas.tourico.com/webservices/hotelv3}FormattedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFormattedTextType", propOrder = {
    "formattedTextType"
})
public class ArrayOfFormattedTextType {

    @XmlElement(name = "FormattedTextType", nillable = true)
    protected List<FormattedTextType> formattedTextType;

    /**
     * Gets the value of the formattedTextType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedTextType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedTextType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextType }
     * 
     * 
     */
    public List<FormattedTextType> getFormattedTextType() {
        if (formattedTextType == null) {
            formattedTextType = new ArrayList<FormattedTextType>();
        }
        return this.formattedTextType;
    }

}
