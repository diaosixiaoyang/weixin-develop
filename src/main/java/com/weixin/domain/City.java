package com.weixin.domain;

import lombok.Data;

@Data
public class City {
    private Integer id;

    private String cityCode;

    private String cityName;

    private String fkProvinceCode;

}