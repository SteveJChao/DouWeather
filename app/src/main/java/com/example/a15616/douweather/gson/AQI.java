package com.example.a15616.douweather.gson;

/**
 * Created by hungryao on 12/16/2017.
 */

import com.google.gson.annotations.SerializedName;

/**
 * aqi节点的实体类
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        /**
         * 空气质量指数
         */
        public String aqi;

        /**
         * 空气质量
         */
        public String qlty;

        /**
         * PM2.5
         */
        public String pm25;

        /**
         * NO2
         */
        public String no2;

        public String so2;

        public String No;

        public String O3;
    }
}
