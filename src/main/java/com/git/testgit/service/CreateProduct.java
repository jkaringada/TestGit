package com.git.testgit.service;


import com.git.testgit.model.Product;
import org.springframework.stereotype.Service;

@Service
public class CreateProduct {

    public Product getProduct() {
        return Product.builder()
                .productId("12345")
                .productCode("MCD")
                .description("Rice Crisps")
                .brand("Kellogs")
                .build()
                ;
    }

}
