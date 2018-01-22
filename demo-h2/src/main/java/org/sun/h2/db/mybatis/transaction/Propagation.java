package org.sun.h2.db.mybatis.transaction;

public enum Propagation{

    REQUIRED("required"),
    INDEPENDENT("independent");

    Propagation(String value) {
        this.value = value;
    }

    private String value;
}
