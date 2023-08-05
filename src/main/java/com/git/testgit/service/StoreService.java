package com.git.testgit.service;

import com.git.testgit.model.Store;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    public Store getStore() {
        return Store.builder().storeId(1111l).storeName("Jeff").postCode("3073").build();
    }
}
