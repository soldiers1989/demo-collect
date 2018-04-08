package com.maimieng.model;

public class MpcArithmeticUserRel {
    private Integer app_id;

    private Integer user_id;

    private String room_name;

    private String app_name;

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

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name == null ? null : room_name.trim();
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name == null ? null : app_name.trim();
    }
}