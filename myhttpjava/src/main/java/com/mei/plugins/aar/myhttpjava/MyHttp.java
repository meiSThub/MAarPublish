package com.mei.plugins.aar.myhttpjava;

import android.util.Log;

/**
 * @author mxb
 * @date 2021/9/27
 * @desc 模拟网络请求
 * @desired
 */
public class MyHttp {

    private static final String TAG = "MyHttp";

    /**
     * 执行post网络请求
     *
     * @param url    url
     * @param params 参数
     */
    public void post(String url, String... params) {
        Log.i(TAG, "post: url=" + url + ";params=" + params);
    }

    /**
     * 执行get网络请求
     *
     * @param url url
     */
    public void get(String url) {
        Log.i(TAG, "get: url=" + url);
    }
}
