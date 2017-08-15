package com.oneone.uuu.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by uuu on 17-8-14.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public String setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return  provinceCode;
    }

    public int setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
