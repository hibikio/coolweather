package com.wxic.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
    private String contryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContryName() {
        return contryName;
    }

    public void setContryName() {
        this.contryName = contryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
