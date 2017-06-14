package com.livtrip.web.util;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ezmorph.ObjectMorpher;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultDefaultValueProcessor;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.JSONUtils;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 有关json工具类
 * 
 * 
 * @author shentuwy
 * @date 2012-7-26
 * 
 */
public final class JsonUtils {

	private static final Logger	LOG	= LoggerFactory.getLogger(JsonUtils.class);
	
	private static final JsonConfig DEFAULT_JSON_CONFIG = new JsonConfig();
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**只显示年月日*/
	private static final DateFormat DATE_FORMAT_SHORT = new SimpleDateFormat("yyyy-MM-dd");
	
	private static final Map<String, Field> CLASS_FIELD_CASH = new HashMap();

	private static final ThreadLocal<DateFormat> DateFormat_ThreadLocal = new ThreadLocal<DateFormat>();
	public static DateFormat getDateFormat() {
		DateFormat dateFormat = DateFormat_ThreadLocal.get();
		if (dateFormat == null) {
			dateFormat = DATE_FORMAT;
		}
		return dateFormat;
	}
	public static void setDateFormat(DateFormat dateFormat) {
		DateFormat_ThreadLocal.set(dateFormat);
	}
	
	static{
		DEFAULT_JSON_CONFIG.registerDefaultValueProcessor(BigDecimal.class, new DefaultDefaultValueProcessor(){
			 @SuppressWarnings("rawtypes")
			public Object getDefaultValue( Class type ) {
				 if (BigDecimal.class.isAssignableFrom(type)) {
					 return "";
				 }
				 return super.getDefaultValue(type);
			 }
		});
		DEFAULT_JSON_CONFIG.registerJsonValueProcessor(Date.class, new JsonValueProcessor() {
			
			@Override
			public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
				if (value != null) {
					if (value instanceof Date) {
						return DATE_FORMAT.format((Date)value);
					}else{
						return value;
					}
				}
				return null;
			}
			
			@Override
			public Object processArrayValue(Object value, JsonConfig jsonConfig) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		DEFAULT_JSON_CONFIG.registerJsonValueProcessor(java.sql.Date.class, new JsonValueProcessor() {
			
			@Override
			public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
				if (value != null) {
					if (value instanceof java.sql.Date) {
						return DATE_FORMAT.format((Date)value);
					}else{
						return value;
					}
				}
				return null;
			}
			
			@Override
			public Object processArrayValue(Object value, JsonConfig jsonConfig) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		DEFAULT_JSON_CONFIG.registerJsonValueProcessor(Timestamp.class, new JsonValueProcessor() {
			
			@Override
			public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
				if (value != null) {
					if (value instanceof Timestamp) {
						return DATE_FORMAT.format((Date)value);
					}else{
						return value;
					}
				}
				return null;
			}
			
			@Override
			public Object processArrayValue(Object value, JsonConfig jsonConfig) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		JSONUtils.getMorpherRegistry().registerMorpher(new ObjectMorpher() {

			@Override
			public Class<Date> morphsTo() {
				return Date.class;
			}

			@Override
			public boolean supports(Class clazz) {
				return true;
			}

			@Override
			public Object morph(Object value) {
				Object ret = value;  
				if (value != null && value instanceof String) {
					try{
						ret = getDateFormat().parse((String)value);
					}catch(Exception ex){
						ex.printStackTrace();
					}
				}
				return ret;
			}
		
		});
	}
	
	
	private static final JsonConfig getJsonConfig(Class<?> beanClass){
		JsonConfig result = DEFAULT_JSON_CONFIG.copy();
		result.setRootClass(beanClass);
		if (beanClass != null) {
			try{
				Map classMap = new HashMap();
				PropertyDescriptor[] pdArray = Introspector.getBeanInfo(beanClass).getPropertyDescriptors();
				for (PropertyDescriptor pd : pdArray) {
					if (List.class.isAssignableFrom(pd.getPropertyType())) {
						Field field = getBeanField(beanClass, pd.getName());
						if (ParameterizedType.class.isAssignableFrom(field.getGenericType().getClass())) {
							Class<?> genericType = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
							classMap.put(pd.getName(), genericType);
						}
					}
				}
				if (!classMap.isEmpty()) {
					result.setClassMap(classMap);
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return result;
	}
	 public static final Field getBeanField(Class<?> cls, String propertyName) {
		 Field field = null;
		 if ((cls != null) && (StringUtils.isNotBlank(propertyName))) {
			 String key = cls.getName() + "@" + propertyName;
			 if (CLASS_FIELD_CASH.containsKey(key))
			 field = (Field)CLASS_FIELD_CASH.get(key);
			 else {
				 try {
					 field = cls.getDeclaredField(propertyName);
				 } catch (NoSuchFieldException ex) {
					 Class superCLs = cls.getSuperclass();
					 field = getBeanField(superCLs, propertyName);
				 }
			 }
		 }
		 return field;
	 }
	
	public static String objectToJsonString(Object obj) {
		String ret = null;
		if (obj != null) {
			Object jsonObj = null;
			if (obj instanceof JSON) {
				jsonObj = obj;
			} else if (obj instanceof Collection<?> || obj.getClass().isArray()) {
				jsonObj = JSONArray.fromObject(obj,DEFAULT_JSON_CONFIG);
			} else {
				try {
					if (JSONUtils.isNumber( obj ) || JSONUtils.isBoolean( obj )
				            || JSONUtils.isString( obj )) {
						ret = String.valueOf(obj);
					}else{
						jsonObj = JSONObject.fromObject(obj,DEFAULT_JSON_CONFIG);
					}
				} catch (Exception e) {
//					log.error(e.getMessage(), e);
					ret = String.valueOf(obj);
				}
			}
			if (jsonObj != null) {
				ret = jsonObj.toString();
			}
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public static Collection<Map<String, Object>> stringToCollection(String str) {
		Collection<Map<String, Object>> ret = null;
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			if (jsonStr.startsWith("[")) {
				JSONArray ja = JSONArray.fromObject(jsonStr);
				JsonConfig jsonConfig = DEFAULT_JSON_CONFIG.copy();
				jsonConfig.setRootClass(HashMap.class);
				ret = JSONArray.toCollection(ja, jsonConfig);
			}
		}
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Collection<T> stringToCollection(String str, Class<T> clazz) {
		Collection<T> ret = null;
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			if (jsonStr.startsWith("[")) {
				JSONArray ja = JSONArray.fromObject(jsonStr);
				JsonConfig jsonConfig = DEFAULT_JSON_CONFIG.copy();
				jsonConfig.setRootClass(clazz);
				ret = JSONArray.toCollection(ja, jsonConfig);
			}
		}
		return ret;
	}
	/**
	 * json转集合类，时间格式为yy-MM-dd
	 * @author cxn
	 * @date 2015年2月11日 下午1:41:52
	 */
	@SuppressWarnings("unchecked")
	public static <T> Collection<T> stringToCollectionWithShortTime(String str, Class<T> clazz) {
		Collection<T> ret = null;
		//将时间格式改成短的
		setDateFormat(DATE_FORMAT_SHORT);
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			if (jsonStr.startsWith("[")) {
				JSONArray ja = JSONArray.fromObject(jsonStr);
				JsonConfig jsonConfig = DEFAULT_JSON_CONFIG.copy();
				jsonConfig.setRootClass(clazz);
				ret = JSONArray.toCollection(ja, jsonConfig);
			}
		}
		//用完后改回原样
		setDateFormat(null);
		return ret;
	}

	public static final Object stringToObject(String str, Class<?> clazz) {
		Object t = null;
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			JsonConfig jsonConfig = DEFAULT_JSON_CONFIG.copy();
			jsonConfig.setRootClass(clazz);
			if (jsonStr.startsWith("[")) {
				JSONArray jsonArray = JSONArray.fromObject(jsonStr);
				t = JSONArray.toCollection(jsonArray, jsonConfig);
			} else if (jsonStr.startsWith("{")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonStr);
				t = JSONObject.toBean(jsonObject, jsonConfig);
			}
		}
		return t;
	}
	
	public static final Object string2Object(String str, Class<?> clazz){
		Object result = null;
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			if (jsonStr.startsWith("[")) {
				JSONArray jsonArray = JSONArray.fromObject(jsonStr);
				JsonConfig jsonConfig = getJsonConfig(clazz);
				result = JSONArray.toCollection(jsonArray, jsonConfig);
			} else if (jsonStr.startsWith("{")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonStr);
				JsonConfig jsonConfig = getJsonConfig(clazz);
				result = JSONObject.toBean(jsonObject, jsonConfig);
			}
		}
		return result;
	}
	
	public static final Object stringToObject(String str, Class<?> clazz,Map<String, Class> classMap) {
		Object t = null;
		if (StringUtils.isNotBlank(str)) {
			String jsonStr = str.trim();
			if (jsonStr.startsWith("[")) {
				JSONArray jsonArray = JSONArray.fromObject(jsonStr);
				Object[] objs = (Object[])JSONArray.toArray(jsonArray, clazz, classMap);
				List ls = new ArrayList(objs.length);
				for(int i=0;i<objs.length;i++)
				{
					ls.add(objs[i]);
				}
				return ls;
			} else if (jsonStr.startsWith("{")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonStr);
				t = JSONObject.toBean(jsonObject, clazz,classMap);
			}
		}
		return t;
	}
}
