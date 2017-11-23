package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 徐小杰 on 2017/11/23.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;//记录城市的名字

    private int cityCode;//记录城市的代号

    private int provinceId;//记录当前市所属的省的id值

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
