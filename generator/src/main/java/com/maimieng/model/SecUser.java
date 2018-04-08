package com.maimieng.model;

import java.util.Date;

public class SecUser {
    private Integer id;

    private String LOGIN_NAME;

    private String PASSWORD;

    private String name;

    private Integer org_id;

    private Boolean sex;

    private String mail;

    private String mobile;

    private String salt;

    private String token_seed;

    private Integer status;

    private Boolean password_status;

    private String description;

    private Date create_time;

    private Date update_time;

    private String user_address;

    private Boolean valid_mail_status;

    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLOGIN_NAME() {
        return LOGIN_NAME;
    }

    public void setLOGIN_NAME(String LOGIN_NAME) {
        this.LOGIN_NAME = LOGIN_NAME == null ? null : LOGIN_NAME.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Integer org_id) {
        this.org_id = org_id;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getToken_seed() {
        return token_seed;
    }

    public void setToken_seed(String token_seed) {
        this.token_seed = token_seed == null ? null : token_seed.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getPassword_status() {
        return password_status;
    }

    public void setPassword_status(Boolean password_status) {
        this.password_status = password_status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address == null ? null : user_address.trim();
    }

    public Boolean getValid_mail_status() {
        return valid_mail_status;
    }

    public void setValid_mail_status(Boolean valid_mail_status) {
        this.valid_mail_status = valid_mail_status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}