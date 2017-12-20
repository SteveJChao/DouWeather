package com.example.a15616.douweather.gson;

/**
 * Created by hungryao on 12/16/2017.
 */

import com.google.gson.annotations.SerializedName;

/**
 * 三日内预报之一类的实体
 */
public class Forecast {

    public String date;

    @SerializedName("astro")
    public Astronomical astronomical;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public Wind wind;

    /**
     * 相对湿度
     */
    @SerializedName("hum")
    public String humidity;

    /**
     * 降水量
     */
    @SerializedName("pcpn")
    public String precipitation;

    /**
     * 气压
     */
    @SerializedName("pres")
    public String pressure;

    /**
     * 能见度
     */
    @SerializedName("vis")
    public String visibility;

    /**
     * 降水概率
     */
    @SerializedName("pop")
    public String probabilityOfPrep;

    /**
     * 天文指数实体类
     */
    public class Astronomical {

        /**
         * 月升时
         */
        @SerializedName("mr")
        public String moonRise;

        /**
         * 月落时
         */
        @SerializedName("ms")
        public String moonSet;

        /**
         *日升
         */
        @SerializedName("sr")
        public String sunRise;

        /**
         * 日落
         */
        @SerializedName("ss")
        public String sunSet;
    }

    /**
     * 天气状况实体类
     */
    public class More {
        /**
         * 白天天气状况
         */
        @SerializedName("txt_d")
        public String dayInfo;

        /**
         * 夜间天气状况
         */
        @SerializedName("txt_n")
        public String nightInfo;
    }

    /**
     * 温度
     */
    public class Temperature {
        public String max;
        public String min;
    }

    /**
     * 风实体类
     */
    public class Wind {
        /**
         * 风向
         */
        @SerializedName("dir")
        public String windDirection;

        /**
         * 风力等级
         */
        @SerializedName("sc")
        public String windLevel;

        /**
         * 风速
         */
        @SerializedName("spd")
        public String speed;
    }
}
