
package com.livtrip.web.webservice.destination;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Culture的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Culture"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="en_US"/&gt;
 *     &lt;enumeration value="he_IL"/&gt;
 *     &lt;enumeration value="es_ES"/&gt;
 *     &lt;enumeration value="pt_PT"/&gt;
 *     &lt;enumeration value="ru_RU"/&gt;
 *     &lt;enumeration value="fr_FR"/&gt;
 *     &lt;enumeration value="de_DE"/&gt;
 *     &lt;enumeration value="ja_JP"/&gt;
 *     &lt;enumeration value="it_IT"/&gt;
 *     &lt;enumeration value="zh_CN"/&gt;
 *     &lt;enumeration value="ko_KR"/&gt;
 *     &lt;enumeration value="pl_PL"/&gt;
 *     &lt;enumeration value="zh_TW"/&gt;
 *     &lt;enumeration value="nl_NL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Culture")
@XmlEnum
public enum Culture {

    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("he_IL")
    HE_IL("he_IL"),
    @XmlEnumValue("es_ES")
    ES_ES("es_ES"),
    @XmlEnumValue("pt_PT")
    PT_PT("pt_PT"),
    @XmlEnumValue("ru_RU")
    RU_RU("ru_RU"),
    @XmlEnumValue("fr_FR")
    FR_FR("fr_FR"),
    @XmlEnumValue("de_DE")
    DE_DE("de_DE"),
    @XmlEnumValue("ja_JP")
    JA_JP("ja_JP"),
    @XmlEnumValue("it_IT")
    IT_IT("it_IT"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),
    @XmlEnumValue("ko_KR")
    KO_KR("ko_KR"),
    @XmlEnumValue("pl_PL")
    PL_PL("pl_PL"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("nl_NL")
    NL_NL("nl_NL");
    private final String value;

    Culture(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Culture fromValue(String v) {
        for (Culture c: Culture.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
