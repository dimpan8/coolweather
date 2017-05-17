package com.hao.coolweather.gson;

/**
 * Created by Administrator on 2017/5/15.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
