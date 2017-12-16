package com.example.a15616.douweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hungryao on 12/10/2017.
 */

/**
 * 县的实体类，包含四个字段
 * id 默认
 * countyName 县名称
 * weatherId 天气查询Id
 * cityId 城市Id
 */
public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    /**
     * id的setter
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * id的getter
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * countyName的setter
     * @param countyName
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /**
     * countyName 的getter
     * @return
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * weatherId的setter
     * @param weatherId
     */
    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    /**
     * weatherId的getter
     * @return
     */
    public String getWeatherId() {
        return weatherId;
    }

    /**
     * cityId的setter
     * @param cityId
     */
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    /**
     * cityId的getter
     * @return
     */
    public int getCityId() {
        return cityId;
    }

}
