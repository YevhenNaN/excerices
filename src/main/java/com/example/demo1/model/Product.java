package com.example.demo1.model;

import java.util.List;

public class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    public static List<Product> getMockProducts() {
        return List.of(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Phone", "Electronics", 800.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Shoes", "Clothing", 100.0),
                new Product("Jacket", "Clothing", 200.0),
                new Product("Watch", "Accessories", 250.0)
        );
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
