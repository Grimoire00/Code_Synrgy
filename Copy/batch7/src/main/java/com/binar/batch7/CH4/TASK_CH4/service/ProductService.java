package com.binar.batch7.CH4.TASK_CH4.service;

import com.binar.batch7.CH4.TASK_CH4.dto.ProductRequest;
import com.binar.batch7.CH4.TASK_CH4.dto.ProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    ProductResponse create(ProductRequest request);

    List<ProductResponse> findAll();

    ProductResponse update(UUID id, ProductRequest request);

    ProductResponse delete(UUID id);
}
