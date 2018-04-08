package com.maimieng.model;

import java.util.Date;

public class MpcArithmetic {
    private Integer id;

    private String name;

    private String "desc";

    private String character;

    private Integer source;

    private Integer status;

    private Date update_time;

    private String classify_code;

    private String classify_name;

    private String publish_type;

    private String publish_name;

    private Date publish_time;

    private Integer download_total;

    private Integer install_total;

    private Integer calculated_total;

    private Integer favorited_count;

    private Integer user_id;

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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getDownload_total() {
        return download_total;
    }

    public void setDownload_total(Integer download_total) {
        this.download_total = download_total;
    }

    public Integer getInstall_total() {
        return install_total;
    }

    public void setInstall_total(Integer install_total) {
        this.install_total = install_total;
    }

    public Integer getCalculated_total() {
        return calculated_total;
    }

    public void setCalculated_total(Integer calculated_total) {
        this.calculated_total = calculated_total;
    }

    public Integer getFavorited_count() {
        return favorited_count;
    }

    public void setFavorited_count(Integer favorited_count) {
        this.favorited_count = favorited_count;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}