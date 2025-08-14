package com.example.inventory.models;

public class Stocktransaction {
        private Integer id;
        private int productId;
        private String txType; // "IN" | "OUT"
        private int quantity;
        private String note;
        private String createdAt;

        public Stocktransaction(Integer id, int productId, String txType, int quantity, String note, String createdAt) {
            this.id = id;
            this.productId = productId;
            this.txType = txType;
            this.quantity = quantity;
            this.note = note;
            this.createdAt = createdAt;
        }
}
