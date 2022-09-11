package com.jaewoo.mapstruct.record;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Product {
    private String productName;
    private Double price;

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }
}
