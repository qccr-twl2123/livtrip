
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CanadianTaxType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CanadianTaxType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DMF"/&gt;
 *     &lt;enumeration value="GST"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CanadianTaxType")
@XmlEnum
public enum CanadianTaxType {

    DMF,
    GST,
    PST;

    public String value() {
        return name();
    }

    public static CanadianTaxType fromValue(String v) {
        return valueOf(v);
    }

}
