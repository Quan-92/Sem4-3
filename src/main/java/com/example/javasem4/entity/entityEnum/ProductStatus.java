package com.example.javasem4.entity.entityEnum;

public enum ProductStatus {
    active(1),
    deactive(0),
    deleted(-1),
    undefined(2);
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ProductStatus of(int value) {
        for (ProductStatus productStatus : ProductStatus.values()) {
            if(productStatus.getValue() == value) {
                return productStatus;
            }
        }
        return ProductStatus.undefined;
    }
}