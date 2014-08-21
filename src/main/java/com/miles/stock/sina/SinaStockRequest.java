package com.miles.stock.sina;

import com.miles.stock.api.StockRequest;
import com.miles.stock.utils.StockCodeUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author miles
 * @datetime 2014/5/27 11:50
 */
public class SinaStockRequest implements StockRequest {
    private Logger logger = Logger.getLogger(SinaStockRequest.class);
    private static final String SINA_STOCK_URL = "http://hq.sinajs.cn/?list=";
    private HttpHost proxy;

    public SinaStockRequest() {
        Properties properties = new Properties();
        try {
            properties.load(SinaStockRequest.class.getClassLoader().getResourceAsStream("http.properties"));
            String host = properties.getProperty("http.proxy.host");
            String port = properties.getProperty("http.proxy.port");
            if (StringUtils.isNotEmpty(host) && StringUtils.isNotEmpty(port)) {
                proxy = new HttpHost(host, Integer.parseInt(port));
            }
        } catch (IOException e) {
            // NOTHING
        }

    }

    @Override
    public String get(String... codes) {
        if (codes == null || codes.length == 0) {
            throw new IllegalArgumentException("查询股票信息时,没有获得股票代码!");
        }
        StringBuilder buffer = new StringBuilder();
        for (String code : codes) {
            //根据编号，转换成对应的sh,sz等代码
            buffer.append(StockCodeUtils.getWrappedCode(code));
            //将编号添加到buffer中
            buffer.append(",");
        }
        //根据url地址+buffer列表查询股票信息
        String url = SINA_STOCK_URL + buffer.substring(0, buffer.length() - 1);
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        if (proxy != null) {
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        }
        logger.info("GET : " + url);
        String result = null;
        try {
            HttpResponse response = httpClient.execute(httpget);
            int status = response.getStatusLine().getStatusCode();
            if (status == 200) {
                InputStream input = response.getEntity().getContent();
                result = IOUtils.toString(input, "GBK");//新浪股票接口使用的是GBK编码
//                logger.info("GET请求响应结果:" + result);
                input.close();
            } else {
                logger.info("请求[" + url + "]失败:" + status);
            }
            httpClient.getConnectionManager().shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
