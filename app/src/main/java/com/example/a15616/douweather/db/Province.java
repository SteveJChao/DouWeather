package com.example.a15616.douweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hungryao on 12/10/2017.
 */

/**
 * 省的数据库实体类，包含三个字段
 * id 默认
 * provinceName 省名
 * ProvinceCode 省Id
 */
public class Province extends DataSupport{

    private int id;
    private String provinceName;
    private int provinceCode;

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
     * provinceName的setter
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * provinceName的getter
     * @return
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * provinceCode的getter
     * @param provinceCode
     */
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * provinceCode的getter
     * @return
     */
    public int getProvinceCode() {
        return provinceCode;
    }
}
