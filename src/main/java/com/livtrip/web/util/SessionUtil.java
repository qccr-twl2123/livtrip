package com.livtrip.web.util;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SessionUtil {

	/** 登录成功时存放session信息属性KEY */
	private static final String USER_LOGON_INFO = "USER_LOGON_INFO";

	private SessionUtil() {

	}

	/**
	 * 用户退出时使用
	 * 
	 */
	public static final void invalidSession() {
		getHttpSession().invalidate();
	}

	/**
	 * 返回登录信息
	 * 
	 * @return
	 */
	public static final Serializable getUserLogonInfo() {
		return getAttribute(USER_LOGON_INFO);
	}

	/**
	 * 存放登录信息
	 * 
	 * @param uid
	 */
	public static final void setUserLogonInfo(Serializable uid) {
		setAttribute(USER_LOGON_INFO, uid);
	}

	public static final void setAttribute(String key, Serializable value) {
		HttpSession session = getHttpSession();
		session.setAttribute(key, value);
	}

	public static final Serializable getAttribute(String key) {
		return (Serializable) getHttpSession().getAttribute(key);
	}

	private static final HttpSession getHttpSession() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		HttpSession session = ((ServletRequestAttributes) requestAttributes).getRequest().getSession();
		return session;
	}

}
