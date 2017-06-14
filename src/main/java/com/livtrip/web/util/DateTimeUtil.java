package com.livtrip.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	/**
	 * 格式转换
	 * @param date		日期变量
	 * @param pattern	匹配模式
	 * @return			日期字符号串
	 */
	public static String getFormatDate(Date date,String pattern){
		if (pattern == null || pattern.length() < 1) {
			pattern = "yyyy-MM-dd";
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(date);
		return strDate;
		
		
		
	}
}
