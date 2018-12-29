package com.weixin.domain;

public class Area {
    private Integer id;

    private String areaCode;

    private String areaName;

    private String fkCityCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getFkCityCode() {
        return fkCityCode;
    }

    public void setFkCityCode(String fkCityCode) {
        this.fkCityCode = fkCityCode;
    }
}