package com.example.a15616.douweather.gson;

/**
 * Created by hungryao on 12/16/2017.
 */

import com.google.gson.annotations.SerializedName;

/**
 * basic节点对应的实体类
 */
public class Basic {
    /**
     * 城市名，通过@SerializedName将字段和节点名建立映射
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 该地的weather_id
     */
    @SerializedName("id")
    public String weatherId;

    public Update update;

    /**
     * 更新时间
     */
    public class Update {
        @SerializedName("loc")
        public String updateTimeLoc;

        @SerializedName("utc")
        public String updateTimeUtc;
    }

}
