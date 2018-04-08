package com.maimieng.model;

import java.util.Date;

public class MpcPartyRel {
    private Integer id;

    private Integer node_id;

    private Integer room_id;

    private Date party_time;

    private Integer party_status;

    private Integer calculated_total;

    private Integer app_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNode_id() {
        return node_id;
    }

    public void setNode_id(Integer node_id) {
        this.node_id = node_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Date getParty_time() {
        return party_time;
    }

    public void setParty_time(Date party_time) {
        this.party_time = party_time;
    }

    public Integer getParty_status() {
        return party_status;
    }

    public void setParty_status(Integer party_status) {
        this.party_status = party_status;
    }

    public Integer getCalculated_total() {
        return calculated_total;
    }

    public void setCalculated_total(Integer calculated_total) {
        this.calculated_total = calculated_total;
    }

    public Integer getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }
}