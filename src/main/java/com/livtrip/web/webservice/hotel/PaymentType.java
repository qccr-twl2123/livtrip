
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Charge"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="NoChange"/&gt;
 *     &lt;enumeration value="NotDefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentType")
@XmlEnum
public enum PaymentType {

    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange"),
    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined");
    private final String value;

    PaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentType fromValue(String v) {
        for (PaymentType c: PaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
