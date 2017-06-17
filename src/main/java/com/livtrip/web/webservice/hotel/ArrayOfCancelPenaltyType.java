
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCancelPenaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelPenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelPenalty" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}CancelPenaltyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelPenaltyType", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd", propOrder = {
    "cancelPenalty"
})
public class ArrayOfCancelPenaltyType {

    @XmlElement(name = "CancelPenalty")
    protected List<CancelPenaltyType> cancelPenalty;

    /**
     * Gets the value of the cancelPenalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPenaltyType }
     * 
     * 
     */
    public List<CancelPenaltyType> getCancelPenalty() {
        if (cancelPenalty == null) {
            cancelPenalty = new ArrayList<CancelPenaltyType>();
        }
        return this.cancelPenalty;
    }

}
