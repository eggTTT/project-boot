package com.jy.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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
@ApiModel(description = "商品测试实体")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(name = "id", value = "主键", hidden = true)
    @Excel(name = "id", width = 50)
    private Long id;

    @ApiModelProperty(name = "name", value = "商品名称")
    @Excel(name = "名称", orderNum = "1", width = 50)
    private String name;

    @ApiModelProperty(name = "price", value = "商品单价")
    @Excel(name = "价格", orderNum = "2", width = 50)
    private BigDecimal price;

    @ApiModelProperty(name = "num", value = "商品数量")
    @Excel(name = "数量", orderNum = "3", width = 50)
    private Integer num;

    @ApiModelProperty(name = "color", value = "商品颜色")
    @Excel(name = "颜色", orderNum = "4", width = 50)
    private String color;

    @ApiModelProperty(name = "supplier", value = "商品供应商")
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
