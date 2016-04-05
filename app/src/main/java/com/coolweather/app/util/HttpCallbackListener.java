package com.coolweather.app.util;

/**
 * Created by Frost on 2016/4/3.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);


}
