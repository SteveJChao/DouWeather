package com.example.a15616.douweather.util;

/**
 * Created by hungryao on 12/10/2017.
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 与服务器交互的Http类
 */
public class HttpUtil {

    /**
     * 向服务器发送请求的方法
     * @param address 服务器地址
     * @param callback 处理服务器响应的回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
