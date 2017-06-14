package com.livtrip.web.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 操作一些Map的方法
 * 
 * @author AMARKY
 * @date 2016-5-17
 * @Description
 */
public class MapUtil {

	/**
	 * 将这个对象中的get方法放入Map Map中的键值对
	 * <Key,value>---><传入的对象的属性名称(去掉get,全部转成大写),该对象的属性方法返回的数据(没有就是"")>
	 * 
	 * @param c
	 * @return
	 */
	public static Map<String, Object> getMapByClassAttributeValue(Object c) {
		Map<String, Object> classAttributeValue = new HashMap<String, Object>();
		return getMapByClassAttributeValue(classAttributeValue,c);
	}
	
	/**
	 * 需要传入的map
	 * @param classAttributeValue
	 * @param c
	 * @return
	 */
	public static Map<String, Object> getMapByClassAttributeValue(Map<String, Object> classAttributeValue,Object c) {
		try {
			Class<? extends Object> clazz = c.getClass();
			Method[] methods = clazz.getMethods();
			for (int i = 0; i < methods.length; i++) {
				if (methods[i].getName().startsWith("get")
						&& !methods[i].getName().equals("getClass")) {
					String methodName = methods[i].getName().substring(3);
					//转成大写
					methodName = methodName.toUpperCase();
					Object o = methods[i].invoke(c);// 执行get方法返回一个Object
					classAttributeValue.put(methodName, o);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classAttributeValue;
	}
	
	/**
	 * 对map按照key值进行排序
	 * @param map
	 * @return　Map.Entry[]
	 */
	public static Map.Entry[] getSortedHashtableByValue(Map<String, Object> map) {  
		Set set = map.entrySet();  
		Map.Entry[] entries = (Map.Entry[]) set.toArray(new Map.Entry[set.size()]);  
	    Arrays.sort(entries, new Comparator() {  
	        public int compare(Object arg0, Object arg1) {  
	            String key1 = ((Map.Entry) arg0).getKey().toString();
	            String key2 = ((Map.Entry) arg1).getKey().toString();  
                return key1.compareTo(key2);  
	        }  
	    });  
	  
	    return entries;  
	}     	
	
	/**
	 * 按属性－值组装Map
	 * @param objects
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getMapFromObject(Object...objects) throws Exception{
		Map map = new HashMap();
		for(Object obj:objects){
			Class cls = obj.getClass();
			getBeanFields(cls,obj,map);
		}		
		
		return map;
	}
	
	private static void getBeanFields(Class cls, Object obj, Map map) throws IllegalArgumentException, IllegalAccessException {
		
		
		for(Field field:cls.getDeclaredFields()) {
			String fieldName = field.getName();

			field.setAccessible(true);
			Type type = field.getGenericType();

			map.put(field.getName(), field.get(obj));
		}
		if(cls.getSuperclass()!=null) {
			getBeanFields(cls.getSuperclass(), obj, map);
		}
	}
}
