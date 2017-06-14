package com.livtrip.web.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import org.apache.log4j.Logger;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.StringUtils;

/**
 * 经纬度 地址转换工具类
 * @author l46001
 *
 */
public class PositionUtil {

	private static final Logger LOG = Logger.getLogger(PositionUtil.class);
	/** 
     * 输入经纬度返回地址
     * key lng(经度),lat(纬度) 
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
     */
    public static JsonNode getposition(String latitude,String longitude) throws UnsupportedEncodingException, IOException{
    	BufferedReader in = null;
    	URL tirc = new URL("http://api.map.baidu.com/geocoder?location="+ latitude+","+longitude+"&output=json&key="+"E4805d16520de693a3fe707cdc962045");  
    	LOG.info(String.format("经纬度转换地址信息参数latitude:%s,longitude:%s", latitude,longitude));
    	in = new BufferedReader(new InputStreamReader(tirc.openStream(),"UTF-8"));
		String res;  
        StringBuilder sb = new StringBuilder("");  
        while((res = in.readLine())!=null){  
            sb.append(res.trim());  
        }  
        String str = sb.toString();
        ObjectMapper mapper = new ObjectMapper();
        if(!StringUtils.isNullOrEmpty(str)){  
         JsonNode jsonNode = mapper.readTree(str);
         LOG.info(String.format("经纬度转换地址结果："+jsonNode.toString()));
         return jsonNode;
       }else{
    	   return null; 
       }

    }
    
    /** 

     * 输入地址返回经纬度坐标 
     * key lng(经度),lat(纬度) 
     */  
    public  void getGeocoderLatitude(String address){  
        BufferedReader in = null;  
        try {  
            address = URLEncoder.encode(address, "UTF-8");  
            URL tirc = new URL("http://api.map.baidu.com/geocoder?address="+ address +"&output=json&key="+"7d9fbeb43e975cd1e9477a7e5d5e192a");  
            in = new BufferedReader(new InputStreamReader(tirc.openStream(),"UTF-8"));  
            String res;  
            StringBuilder sb = new StringBuilder("");  
            while((res = in.readLine())!=null){  
                sb.append(res.trim());  
            }  
            String str = sb.toString();  
            if(!StringUtils.isNullOrEmpty(str)){  
                int lngStart = str.indexOf("lng\":");  
                int lngEnd = str.indexOf(",\"lat");  
                int latEnd = str.indexOf("},\"precise");  
                if(lngStart > 0 && lngEnd > 0 && latEnd > 0){  
                    String lng = str.substring(lngStart+5, lngEnd);  
                    String lat = str.substring(lngEnd+7, latEnd);  
                }  
            }  
        }catch (Exception e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    } 

}
