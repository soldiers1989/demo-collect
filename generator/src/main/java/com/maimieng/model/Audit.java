package com.maimieng.model;

import java.util.Date;

public class Audit {
    private Integer id;

    private Integer type;

    private String name;

    private String system_code;

    private String system_name;

    private Integer party_number;

    private String classify_code;

    private String classify_name;

    private Integer source;

    private String login_name;

    private String contact_phone;

    private Date apply_time;

    private Integer status;

    private String audit_desc;

    private String audit_user_name;

    private Integer audit_user_id;

    private Date audit_time;

    private Integer apply_id;

    private String apply_user_name;

    private Integer apply_user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getParty_number() {
        return party_number;
    }

    public void setParty_number(Integer party_number) {
        this.party_number = party_number;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone == null ? null : contact_phone.trim();
    }

    public Date getApply_time() {
        return apply_time;
    }

    public void setApply_time(Date apply_time) {
        this.apply_time = apply_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAudit_desc() {
        return audit_desc;
    }

    public void setAudit_desc(String audit_desc) {
        this.audit_desc = audit_desc == null ? null : audit_desc.trim();
    }

    public String getAudit_user_name() {
        return audit_user_name;
    }

    public void setAudit_user_name(String audit_user_name) {
        this.audit_user_name = audit_user_name == null ? null : audit_user_name.trim();
    }

    public Integer getAudit_user_id() {
        return audit_user_id;
    }

    public void setAudit_user_id(Integer audit_user_id) {
        this.audit_user_id = audit_user_id;
    }

    public Date getAudit_time() {
        return audit_time;
    }

    public void setAudit_time(Date audit_time) {
        this.audit_time = audit_time;
    }

    public Integer getApply_id() {
        return apply_id;
    }

    public void setApply_id(Integer apply_id) {
        this.apply_id = apply_id;
    }

    public String getApply_user_name() {
        return apply_user_name;
    }

    public void setApply_user_name(String apply_user_name) {
        this.apply_user_name = apply_user_name == null ? null : apply_user_name.trim();
    }

    public Integer getApply_user_id() {
        return apply_user_id;
    }

    public void setApply_user_id(Integer apply_user_id) {
        this.apply_user_id = apply_user_id;
    }
}