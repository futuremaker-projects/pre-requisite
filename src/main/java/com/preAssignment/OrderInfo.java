package com.preAssignment;

public class OrderInfo {

    private String productName;
    private Integer amount;
    private Long createdAt;

    public OrderInfo(String productName, Integer amount, Long createdAt) {
        this.productName = productName;
        this.amount = amount;
        this.createdAt = createdAt;
    }

}
