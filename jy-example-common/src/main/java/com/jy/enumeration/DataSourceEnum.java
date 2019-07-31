package com.jy.enumeration;

/**
 * @description: 数据源枚举
 * @author: huyu
 * @create: 2019-07-30 21:31
 */
public enum DataSourceEnum {
    DB1("db1"),
    DB2("db2");

    private String value;

    DataSourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
