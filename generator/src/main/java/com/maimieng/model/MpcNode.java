package com.maimieng.model;

public class MpcNode {
    private Integer id;

    private String name;

    private Integer node_status;

    private Integer node_type;

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

    public Integer getNode_status() {
        return node_status;
    }

    public void setNode_status(Integer node_status) {
        this.node_status = node_status;
    }

    public Integer getNode_type() {
        return node_type;
    }

    public void setNode_type(Integer node_type) {
        this.node_type = node_type;
    }
}