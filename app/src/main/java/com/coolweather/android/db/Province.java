package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 徐小杰 on 2017/11/23.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;//记录省的名字

    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
