package com.maimieng.model;

public class FileRel {
    private Integer id;

    private String owner_id;

    private String owner_type;

    private String group_name;

    private String remote_file_name;

    private String path;

    private String file_name;

    private String local_file_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id == null ? null : owner_id.trim();
    }

    public String getOwner_type() {
        return owner_type;
    }

    public void setOwner_type(String owner_type) {
        this.owner_type = owner_type == null ? null : owner_type.trim();
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name == null ? null : group_name.trim();
    }

    public String getRemote_file_name() {
        return remote_file_name;
    }

    public void setRemote_file_name(String remote_file_name) {
        this.remote_file_name = remote_file_name == null ? null : remote_file_name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name == null ? null : file_name.trim();
    }

    public String getLocal_file_name() {
        return local_file_name;
    }

    public void setLocal_file_name(String local_file_name) {
        this.local_file_name = local_file_name == null ? null : local_file_name.trim();
    }
}