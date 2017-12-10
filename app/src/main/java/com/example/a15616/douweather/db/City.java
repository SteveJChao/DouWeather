package com.example.a15616.douweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hungryao on 12/10/2017.
 */

/**
 * 城市的数据库实体类，包含四个字段
 * id 默认
 * cityName 城市名
 * cityCode 城市Id
 * provinceCode 所在省的Id
 */
public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

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
     * cityName的setter
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * cityName的getter
     * @return
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * cityCode的setter
     * @param cityCode
     */
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * cityCode的getter
     * @return
     */
    public int getCityCode() {
        return cityCode;
    }

    /**
     *provinceId的setter
     * @param provinceId
     */
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * provinceId的getter
     * @return
     */
    public int getProvinceId() {
        return provinceId;
    }
}
