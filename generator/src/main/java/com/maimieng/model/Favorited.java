package com.maimieng.model;

import java.util.Date;

public class Favorited {
    private Integer id;

    private Integer user_id;

    private String favorited_id;

    private Integer statistics_id;

    private Date create_time;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFavorited_id() {
        return favorited_id;
    }

    public void setFavorited_id(String favorited_id) {
        this.favorited_id = favorited_id == null ? null : favorited_id.trim();
    }

    public Integer getStatistics_id() {
        return statistics_id;
    }

    public void setStatistics_id(Integer statistics_id) {
        this.statistics_id = statistics_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}