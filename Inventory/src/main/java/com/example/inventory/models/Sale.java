package com.example.inventory.models;

public class Sale {
        private Integer id;
        private int productId;
        private int quantity;
        private double unitPrice;
        private double discount;
        private double tax;
        private String createdAt;

        public Sale(Integer id, int productId, int quantity, double unitPrice, double discount, double tax, String createdAt) {
            this.id = id;
            this.productId = productId;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.discount = discount;
            this.tax = tax;
            this.createdAt = createdAt;
        }
}
