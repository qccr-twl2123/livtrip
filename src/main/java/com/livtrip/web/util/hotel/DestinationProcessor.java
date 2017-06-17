package com.livtrip.web.util.hotel;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;



/**
 * destination 处理器
 * @author xierongli
 * @version $Id:DestinationProcessor.java v 0.1 2016年12月13日 16:19 xierongli
 */
public class DestinationProcessor {


    public static void main(String[] args) {
       // System.out.println(inputStream2String(DestinationProcessor.class.getResourceAsStream("/destination.text")));
//
//        String  json = inputStream2String(DestinationProcessor.class.getResourceAsStream("/state/NewYork.json"));
//        StateJSON stateDTO = JSON.parseObject(json,StateJSON.class);
//        System.out.println(JSON.toJSONString(stateDTO));

       // getAllFiles();

//        DestinationDTO destinationDTO = getDestinationDTO("destination.json");
//        System.out.println(JSON.toJSONString(destinationDTO));
    }



    public static List<String> getDestinations(){
        String str ="alabama.json;Alaska.json;Arizona.json;Arkansas.json;California.json;Carolina.json;Colorado.json;Columbia.json;Dakota.json;Delaware.json;Florida.text;Hampshire.json;Indiana.json;Iowa.json;Jersey.json;Kansas.json;Kentucky.json;Louisiana.json;Maine.json;Maryland.json;Massachusetts.json;Mexico.json;Michigan.json;Minnesota.json;Mississippi.json;Missouri.json;Montana.json;Nebraska.json;Nevada.json;NewYork.json;NorthCarolina.json;NorthDakota.json;Ohio.json;Oklahoma.json;Oregon.json;Pennsylvania.json;RhodeIsland.json;Tennessee.json;Texas.json;Utah.json;Vermont.json;Virginia.json;Washington.json;WestVirginia.json;Wisconsin.json;Wyoming.json;";
        String[] strArray = str.split(";");
        List<String> destinations = Lists.newArrayList();
        for(int i=0; i<strArray.length; i++){
            destinations.add(strArray[i]);
        }
        return destinations;
    }

//    public static DestinationDTO getDestinationDTO(String fileName){
//        String  json = inputStream2String(DestinationProcessor.class.getResourceAsStream("/destination/"+fileName+""));
//        DestinationDTO destinationDTO = JSON.parseObject(json, DestinationDTO.class);
//        return destinationDTO;
//    }
//
//    public static  StateJSON getStateModelByFileName(String name){
//        String  json = inputStream2String(DestinationProcessor.class.getResourceAsStream("/state/"+name+""));
//        StateJSON stateDTO = JSON.parseObject(json,StateJSON.class);
//        return stateDTO;
//    }
//

    public static List<String> getAllFiles(){
        List<String> fileNames = Lists.newArrayList();
        String path = DestinationProcessor.class.getResource("/state/").getPath();
        File file = new File(path);
        File[] listFile = file.listFiles();
        for(File file1 : listFile){
            System.out.print(file1.getName()+";");
            fileNames.add(file1.getName());
        }
        return  fileNames;
    }


    public static  String inputStream2String(InputStream is){
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        try {
            while ((line = in.readLine()) != null){
                buffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

}
