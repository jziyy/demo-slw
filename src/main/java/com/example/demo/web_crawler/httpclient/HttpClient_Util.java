package com.example.demo.web_crawler.httpclient;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
@Slf4j
public class HttpClient_Util {

    public static String getPageContent(String url) {
        // 创建一个客户端，类似于打开一个浏览器
        DefaultHttpClient httpClient = new DefaultHttpClient();
        // 创建一个GET方法，类似在浏览器地址栏中输入一个地址
        HttpGet httpGet = new HttpGet(url);
        String content = "";
        try {
            // 类似与在浏览器地址栏中输入回车,获得网页内容
            HttpResponse response = httpClient.execute(httpGet);
            // 查看返回内容
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content += EntityUtils.toString(entity, "utf-8");
                EntityUtils.consume(entity);// 关闭内容流
            }
        } catch (Exception e) {
            log.error("网页获取内容失败:" + e);
        }
        httpClient.getConnectionManager().shutdown();
        return content;
    }
}
