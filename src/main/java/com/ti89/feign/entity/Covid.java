package com.ti89.feign.entity;

import java.util.Date;

public class Covid {
    public Integer uid;
    public String uf;
    public String state;
    public Integer cases;
    public Integer deaths;
    public Integer suspects;
    public Integer refuses;
    public Date datetime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getSuspects() {
        return suspects;
    }

    public void setSuspects(Integer suspects) {
        this.suspects = suspects;
    }

    public Integer getRefuses() {
        return refuses;
    }

    public void setRefuses(Integer refuses) {
        this.refuses = refuses;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
