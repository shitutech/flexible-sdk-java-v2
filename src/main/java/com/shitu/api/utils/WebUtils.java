package com.shitu.api.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.shitu.api.ApiRequest;
import com.shitu.api.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;

/**
 * @author andrew
 * @date 2021-10-27 5:55 PM
 */
public enum WebUtils {
    ;
    private static final Logger LOGGER = LoggerFactory.getLogger(WebUtils.class);
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String METHOD_POST = "POST";
    private static final String SCHEMA_HTTPS = "https";

    private static SSLContext ctx = null;
    private static HostnameVerifier verifier = null;
    private static SSLSocketFactory socketFactory = null;

    static {
        try {
            ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[]{new NoOpTrustManager()},
                    new SecureRandom());

            ctx.getClientSessionContext().setSessionTimeout(15);
            ctx.getClientSessionContext().setSessionCacheSize(1000);

            socketFactory = ctx.getSocketFactory();
        } catch (Exception e) {
            // ignored
        }

        verifier = (hostname, session) -> {
            return false; //不允许URL的主机名和服务器的标识主机名不匹配的情况
        };
    }


    public static String postJson(String url,
                                             ApiRequest request,
                                             int connectTimeout,
                                             int readTimeout,
                                             Map<String, String> headers) throws Exception {
        String contentType = "application/json;charset=UTF-8";
        String jsonStr = JSON.toJSONString(request);

        return doPost(url, contentType, jsonStr, connectTimeout, readTimeout, headers);
    }

    private static String doPost(String url, String contentType, String content,
                                 int connectTimeout,
                                 int readTimeout,
                                 Map<String, String> headers) throws Exception {
        URL u = new URL(url);
        HttpURLConnection conn = null;
        OutputStream out = null;
        String resp;
        try {
            try {
                conn = getConnection(u, METHOD_POST, contentType, headers);
                conn.setConnectTimeout(connectTimeout);
                conn.setReadTimeout(readTimeout);
            } catch (IOException e) {
                LOGGER.error("Request Error: ", e);
                throw e;
            }

            try {
                out = conn.getOutputStream();
                out.write(content.getBytes(DEFAULT_CHARSET));
                resp = getResponseAsString(conn);
            } catch (IOException e) {
                LOGGER.error("Request Error: ", e);
                throw e;
            }
        } finally {
            if (out != null) {
                out.close();
            }

            if (conn != null) {
                conn.disconnect();
            }
        }

        return resp;
    }

    private static String getResponseAsString(HttpURLConnection conn) throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        InputStream es = conn.getErrorStream();
        if (null == es) {
            return getStreamAsString(conn.getInputStream(), charset);
        } else {
            String msg = getStreamAsString(es, charset);
            if (StringUtil.isEmpty(msg)) {
                throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
            } else {
                throw new IOException(msg);
            }
        }
    }

    private static String getStreamAsString(InputStream is, String charset) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, charset))) {
            StringWriter writer = new StringWriter();
            char[] chars = new char[256];
            int count;
            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }

            return writer.toString();
        }
    }

    private static String getResponseCharset(String ctype) {
        String charset = DEFAULT_CHARSET;

        if (!StringUtil.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!StringUtil.isEmpty(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }

        return charset;
    }

    private static HttpURLConnection getConnection(URL url, String method, String contentType,
                                                   Map<String, String> headers) throws IOException {
        HttpURLConnection conn;
        if (SCHEMA_HTTPS.equals(url.getProtocol())) {
            HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
            connHttps.setSSLSocketFactory(socketFactory);
            connHttps.setHostnameVerifier(verifier);

            conn = connHttps;
        } else {
            conn = (HttpURLConnection) url.openConnection();
        }

        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("User-Agent", "flexible-sdk-java");
        conn.setRequestProperty("Content-Type", contentType);
        conn.setRequestProperty("Accept", "text/plain,text/xml,text/javascript,text/html,application/json");
        if (headers != null) {
            headers.forEach(conn::setRequestProperty);
        }

        return conn;
    }

    /**
     * 跳过ssl服务端证书认证.
     */
    private static class NoOpTrustManager implements X509TrustManager {

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s) {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }
}
