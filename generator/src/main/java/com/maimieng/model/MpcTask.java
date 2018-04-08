package com.maimieng.model;

import java.util.Date;

public class MpcTask {
    private Integer id;

    private Date begin_time;

    private Date end_time;

    private Integer status;

    private String mpc_room_name;

    private String mpc_app_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMpc_room_name() {
        return mpc_room_name;
    }

    public void setMpc_room_name(String mpc_room_name) {
        this.mpc_room_name = mpc_room_name == null ? null : mpc_room_name.trim();
    }

    public String getMpc_app_name() {
        return mpc_app_name;
    }

    public void setMpc_app_name(String mpc_app_name) {
        this.mpc_app_name = mpc_app_name == null ? null : mpc_app_name.trim();
    }
}