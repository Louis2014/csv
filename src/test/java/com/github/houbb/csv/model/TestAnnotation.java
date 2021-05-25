package com.github.houbb.csv.model;

import com.github.houbb.csv.annotation.Csv;

/**
 * 基于注解的测试案例
 * @author binbin.hou
 * @since 0.0.2
 */
public class TestAnnotation {

    @Csv(label = "SPT ID")
    private String spId;

    @Csv(label = "Brand")
    private String brand;

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TestAnnotation{" +
                "spId='" + spId + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
