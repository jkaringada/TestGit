package com.git.testgit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Store {

    private long storeId;
    private String storeName;
    private String postCode;
}
