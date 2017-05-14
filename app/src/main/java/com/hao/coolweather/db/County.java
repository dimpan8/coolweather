package com.hao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/14.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherCode;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }
}
