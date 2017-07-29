package com.livtrip.web.validator;

import com.livtrip.web.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }

    public static void isTrue(boolean expression, String message) {
        if (expression) {
            throw new RRException(message);
        }
    }

    public static void hasText(String text, String message) {
        if(!org.springframework.util.StringUtils.hasText(text)) {
            throw new RRException(message);
        }
    }

    public static void doesNotContain(String textToSearch, String substring, String message) {
        if(org.springframework.util.StringUtils.hasLength(textToSearch) && org.springframework.util.StringUtils.hasLength(substring) && textToSearch.contains(substring)) {
            throw new RRException(message);
        }
    }

    public static void doesNotContain(String textToSearch, String substring) {
        doesNotContain(textToSearch, substring, "[Assertion failed] - this String argument must not contain the substring [" + substring + "]");
    }
}
