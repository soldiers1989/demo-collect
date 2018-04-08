package com.maimieng.model;

import java.util.Date;

public class MpcApp {
    private Integer id;

    private String name;

    private String "desc";

    private String visit_url;

    private Integer type;

    private Integer status;

    private Integer party_number;

    private Date update_time;

    private String classify_code;

    private String classify_name;

    private String system_code;

    private String system_name;

    private String system_index;

    private String publish_type;

    private String publish_name;

    private Date publish_time;

    private Integer dowload_total;

    private Integer calculated_total;

    private Integer user_id;

    private String icon;

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

    public String get"desc"() {
        return "desc";
    }

    public void set"desc"(String "desc") {
        this."desc" = "desc" == null ? null : "desc".trim();
    }

    public String getVisit_url() {
        return visit_url;
    }

    public void setVisit_url(String visit_url) {
        this.visit_url = visit_url == null ? null : visit_url.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getParty_number() {
        return party_number;
    }

    public void setParty_number(Integer party_number) {
        this.party_number = party_number;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getClassify_code() {
        return classify_code;
    }

    public void setClassify_code(String classify_code) {
        this.classify_code = classify_code == null ? null : classify_code.trim();
    }

    public String getClassify_name() {
        return classify_name;
    }

    public void setClassify_name(String classify_name) {
        this.classify_name = classify_name == null ? null : classify_name.trim();
    }

    public String getSystem_code() {
        return system_code;
    }

    public void setSystem_code(String system_code) {
        this.system_code = system_code == null ? null : system_code.trim();
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name == null ? null : system_name.trim();
    }

    public String getSystem_index() {
        return system_index;
    }

    public void setSystem_index(String system_index) {
        this.system_index = system_index == null ? null : system_index.trim();
    }

    public String getPublish_type() {
        return publish_type;
    }

    public void setPublish_type(String publish_type) {
        this.publish_type = publish_type == null ? null : publish_type.trim();
    }

    public String getPublish_name() {
        return publish_name;
    }

    public void setPublish_name(String publish_name) {
        this.publish_name = publish_name == null ? null : publish_name.trim();
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getDowload_total() {
        return dowload_total;
    }

    public void setDowload_total(Integer dowload_total) {
        this.dowload_total = dowload_total;
    }

    public Integer getCalculated_total() {
        return calculated_total;
    }

    public void setCalculated_total(Integer calculated_total) {
        this.calculated_total = calculated_total;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}