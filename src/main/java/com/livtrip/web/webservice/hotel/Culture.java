
package com.livtrip.web.webservice.hotel;

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
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="en_US"/&gt;
 *     &lt;enumeration value="zh_CN"/&gt;
 *     &lt;enumeration value="it_IT"/&gt;
 *     &lt;enumeration value="ja_JP"/&gt;
 *     &lt;enumeration value="de_DE"/&gt;
 *     &lt;enumeration value="fr_FR"/&gt;
 *     &lt;enumeration value="ru_RU"/&gt;
 *     &lt;enumeration value="pt_PT"/&gt;
 *     &lt;enumeration value="es_AR"/&gt;
 *     &lt;enumeration value="he_IL"/&gt;
 *     &lt;enumeration value="ko_KR"/&gt;
 *     &lt;enumeration value="pl_PL"/&gt;
 *     &lt;enumeration value="zh_TW"/&gt;
 *     &lt;enumeration value="nl_NL"/&gt;
 *     &lt;enumeration value="da_DK"/&gt;
 *     &lt;enumeration value="en_GB"/&gt;
 *     &lt;enumeration value="es_ES"/&gt;
 *     &lt;enumeration value="sv_SE"/&gt;
 *     &lt;enumeration value="pt_BR"/&gt;
 *     &lt;enumeration value="ar_SA"/&gt;
 *     &lt;enumeration value="el_GR"/&gt;
 *     &lt;enumeration value="cs_CZ"/&gt;
 *     &lt;enumeration value="bg_BG"/&gt;
 *     &lt;enumeration value="ro_RO"/&gt;
 *     &lt;enumeration value="tr_TR"/&gt;
 *     &lt;enumeration value="fi_FI"/&gt;
 *     &lt;enumeration value="nb_NO"/&gt;
 *     &lt;enumeration value="ar_EG"/&gt;
 *     &lt;enumeration value="es_MX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Culture", namespace = "http://schemas.tourico.com/webservices/authentication")
@XmlEnum
public enum Culture {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),
    @XmlEnumValue("it_IT")
    IT_IT("it_IT"),
    @XmlEnumValue("ja_JP")
    JA_JP("ja_JP"),
    @XmlEnumValue("de_DE")
    DE_DE("de_DE"),
    @XmlEnumValue("fr_FR")
    FR_FR("fr_FR"),
    @XmlEnumValue("ru_RU")
    RU_RU("ru_RU"),
    @XmlEnumValue("pt_PT")
    PT_PT("pt_PT"),
    @XmlEnumValue("es_AR")
    ES_AR("es_AR"),
    @XmlEnumValue("he_IL")
    HE_IL("he_IL"),
    @XmlEnumValue("ko_KR")
    KO_KR("ko_KR"),
    @XmlEnumValue("pl_PL")
    PL_PL("pl_PL"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("nl_NL")
    NL_NL("nl_NL"),
    @XmlEnumValue("da_DK")
    DA_DK("da_DK"),
    @XmlEnumValue("en_GB")
    EN_GB("en_GB"),
    @XmlEnumValue("es_ES")
    ES_ES("es_ES"),
    @XmlEnumValue("sv_SE")
    SV_SE("sv_SE"),
    @XmlEnumValue("pt_BR")
    PT_BR("pt_BR"),
    @XmlEnumValue("ar_SA")
    AR_SA("ar_SA"),
    @XmlEnumValue("el_GR")
    EL_GR("el_GR"),
    @XmlEnumValue("cs_CZ")
    CS_CZ("cs_CZ"),
    @XmlEnumValue("bg_BG")
    BG_BG("bg_BG"),
    @XmlEnumValue("ro_RO")
    RO_RO("ro_RO"),
    @XmlEnumValue("tr_TR")
    TR_TR("tr_TR"),
    @XmlEnumValue("fi_FI")
    FI_FI("fi_FI"),
    @XmlEnumValue("nb_NO")
    NB_NO("nb_NO"),
    @XmlEnumValue("ar_EG")
    AR_EG("ar_EG"),
    @XmlEnumValue("es_MX")
    ES_MX("es_MX");
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
