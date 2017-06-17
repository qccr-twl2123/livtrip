
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeadlineTypeOffsetDropTime的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DeadlineTypeOffsetDropTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BeforeArrival"/&gt;
 *     &lt;enumeration value="AfterBooking"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeadlineTypeOffsetDropTime", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd")
@XmlEnum
public enum DeadlineTypeOffsetDropTime {

    @XmlEnumValue("BeforeArrival")
    BEFORE_ARRIVAL("BeforeArrival"),
    @XmlEnumValue("AfterBooking")
    AFTER_BOOKING("AfterBooking");
    private final String value;

    DeadlineTypeOffsetDropTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeadlineTypeOffsetDropTime fromValue(String v) {
        for (DeadlineTypeOffsetDropTime c: DeadlineTypeOffsetDropTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
