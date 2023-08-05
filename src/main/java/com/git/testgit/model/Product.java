package com.git.testgit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String productId;
    private String description;
    private String productCode;
    private String brand;
}
