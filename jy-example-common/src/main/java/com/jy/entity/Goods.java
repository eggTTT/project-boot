package com.jy.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huyu
 * @since 2019-07-16
 */
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @Excel(name = "id", width = 50)
    private Long id;

    @Excel(name = "名称", orderNum = "1", width = 50)
    private String name;

    @Excel(name = "价格", orderNum = "2", width = 50)
    private BigDecimal price;

    @Excel(name = "数量", orderNum = "3", width = 50)
    private Integer num;

    @Excel(name = "颜色", orderNum = "4", width = 50)
    private String color;

    @Excel(name = "供应商", orderNum = "5", width = 50)
    private String supplier;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "id=" + id +
        ", name=" + name +
        ", price=" + price +
        ", num=" + num +
        ", color=" + color +
        ", supplier=" + supplier +
        "}";
    }
}
