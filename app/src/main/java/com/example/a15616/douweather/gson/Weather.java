package com.example.a15616.douweather.gson;

/**
 * Created by hungryao on 12/16/2017.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 所有天气内容的实体类
 */
public class Weather {
    public String status;
    public AQI aqi;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
