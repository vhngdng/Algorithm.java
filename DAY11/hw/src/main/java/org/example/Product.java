package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;


public class Product {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
    private String name;
    private String description;
    private String color;

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    private String[] category;
    private String brand;
    private double price;
    private String status;

    public Product() {
    }

    public Product(Integer id, String name, String description, String color, String[] category, String brand, double price, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", category='" + Arrays.toString(category) + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
