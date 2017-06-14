package com.livtrip.web.framework.ds;

public class DBContextHolder {

	public static final String					DATA_SOURCE_MASTER	= "master";

	public static final String					DATA_SOURCE_SLAVER	= "slaver";

	private static final ThreadLocal<String>	CONTEXT_HOLDER				= new ThreadLocal<String>();

	public static void setDBType(String dbType) {
		CONTEXT_HOLDER.set(dbType);
	}

	public static String getDBType() {
		return CONTEXT_HOLDER.get();
	}

	public static void clearDBType() {
		CONTEXT_HOLDER.remove();
	}

}
