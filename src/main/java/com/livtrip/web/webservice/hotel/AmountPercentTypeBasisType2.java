
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmountPercentTypeBasisType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AmountPercentTypeBasisType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullStay"/&gt;
 *     &lt;enumeration value="Nights"/&gt;
 *     &lt;enumeration value="FirstLast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountPercentTypeBasisType")
@XmlEnum
public enum AmountPercentTypeBasisType2 {

    @XmlEnumValue("FullStay")
    FULL_STAY("FullStay"),
    @XmlEnumValue("Nights")
    NIGHTS("Nights"),
    @XmlEnumValue("FirstLast")
    FIRST_LAST("FirstLast");
    private final String value;

    AmountPercentTypeBasisType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountPercentTypeBasisType2 fromValue(String v) {
        for (AmountPercentTypeBasisType2 c: AmountPercentTypeBasisType2.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
