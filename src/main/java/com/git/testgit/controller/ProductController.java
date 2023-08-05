package com.git.testgit.controller;


import com.git.testgit.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public Product getProduct(){
        return Product.builder().productId("12345").description("chips").build();
    }
}
