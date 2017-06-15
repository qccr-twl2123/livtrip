package com.livtrip.web.util;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 *
 * 上传文件工具类
 * Created by xierongli on 17/6/15.
 */
public class HttpClientUtils {
    private static final Logger log = LoggerFactory.getLogger(HttpClientUtils.class);


    public static String uploadFile(InputStream is, String filename, String url){
        log.info("图片上传服务开始执行....");
        String result = null;
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(url);
        //防止文件名乱码
        InputStreamBody fileis = new InputStreamBody(is, ContentType.create("text/plain", Consts.UTF_8),filename);
        HttpEntity reqEntity = null;
        HttpResponse responses = null;
        try {
            //BROWSER_COMPATIBLE 设置浏览器为兼容模式  随便设置编码防止乱码
            reqEntity = MultipartEntityBuilder.create().setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
                    .addPart("file", fileis).setCharset(CharsetUtils.get("utf-8")).build();
            httppost.setEntity(reqEntity);
            responses = httpclient.execute(httppost);
            HttpEntity entity = responses.getEntity();
            if(entity != null){
                result = EntityUtils.toString(entity, Charset.forName("utf-8"));
                log.info("调用图片上传服务返回结果："+result);
            }
        } catch (UnsupportedEncodingException e) {
            log.error("Error occurred when send uploadFile: " + url, e);
        } catch (ClientProtocolException e) {
            log.error("Error occurred when send uploadFile: " + url, e);
        } catch (IOException e) {
            log.error("Error occurred when send uploadFile: " + url, e);
        }

        return result;
    }

}
