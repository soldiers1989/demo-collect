package com.maimieng.model;

import java.util.Date;

public class MpcRoom {
    private Integer id;

    private String name;

    private Date initiate_time;

    private String initiate_name;

    private Integer status;

    private String app_name;

    private Integer app_id;

    private Integer user_id;

    private Integer calculated_total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getInitiate_time() {
        return initiate_time;
    }

    public void setInitiate_time(Date initiate_time) {
        this.initiate_time = initiate_time;
    }

    public String getInitiate_name() {
        return initiate_name;
    }

    public void setInitiate_name(String initiate_name) {
        this.initiate_name = initiate_name == null ? null : initiate_name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name == null ? null : app_name.trim();
    }

    public Integer getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getCalculated_total() {
        return calculated_total;
    }

    public void setCalculated_total(Integer calculated_total) {
        this.calculated_total = calculated_total;
    }
}