package com.tutorial.api.models;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Product {
    private Long id;
    private String productName;
    private int year;
    private Double price;
    private String url;

    @Override
    public String toString() {
        return this.getProductName() + ',' + this.getUrl() + ',' + this.getPrice() + ',' + this.getClass();
    }

    public String Hello() {
        return "Hello spring";
    }

}
