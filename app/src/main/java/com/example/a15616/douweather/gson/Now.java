package com.example.a15616.douweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hungryao on 12/16/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    /**
     * 体感温度
     */
    @SerializedName("fl")
    public String feeling;

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

    public Cond cond;
    public Wind wind;

    /**
     * cond结点实体类
     */
    public class Cond {
        public String txt;
    }

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
