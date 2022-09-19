package com.store.model;

public class Product {
    private final String serialProduct;
    private String name;
    private String description;
    private String category;
    private String label;
    private Double price;

    public Product(String serialProduct, String name, String description, String category, String label, Double price) {
        this.serialProduct = serialProduct;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.label = label;
    }

    public String getSerialProduct() {
        return serialProduct;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialProduct='" + serialProduct + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", label='" + label + '\'' +
                ", price=" + price +
                '}';
    }
}
