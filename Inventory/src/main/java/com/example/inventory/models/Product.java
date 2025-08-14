package com.example.inventory.models;

public class Product {
    private Integer id;
    private String sku;
    private String name;
    private String category;
    private double unitCost;
    private double unitPrice;
    private int reorderLevel;
    private int currentStock;
    private String createdAt;
    private String updatedAt;

    public Product(Integer id, String sku, String name, String category, double unitCost, double unitPrice, int reorderLevel, int currentStock, String createdAt, String updatedAt) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
        this.reorderLevel = reorderLevel;
        this.currentStock = currentStock;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
