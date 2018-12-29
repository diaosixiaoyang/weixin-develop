package com.weixin.domain;

public class City {
    private Integer id;

    private String cityCode;

    private String cityName;

    private String fkProvinceCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getFkProvinceCode() {
        return fkProvinceCode;
    }

    public void setFkProvinceCode(String fkProvinceCode) {
        this.fkProvinceCode = fkProvinceCode;
    }
}