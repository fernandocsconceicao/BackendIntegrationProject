package com.ti89.feign.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CovidDTO {
    public Integer uid;
    public String uf;
    public String state;
    public Integer cases;
    public Integer deaths;
    public Integer suspects;
    public Integer refuses;
    public String datetime;
}
