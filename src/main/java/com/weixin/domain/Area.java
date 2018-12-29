package com.weixin.domain;

import lombok.Data;

@Data
public class Area {
    private Integer id;

    private String areaCode;

    private String areaName;

    private String fkCityCode;

}