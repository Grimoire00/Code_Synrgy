package com.binar.batch7.CH4.TASK_CH4.controller;

import com.binar.batch7.CH4.TASK_CH4.dto.BaseResponse;
import com.binar.batch7.CH4.TASK_CH4.dto.ProductRequest;
import com.binar.batch7.CH4.TASK_CH4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProductRequest request) {
        return ResponseEntity.ok(BaseResponse.success(productService.create(request), "Success Create Product"));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(BaseResponse.success(productService.findAll(), "Success Get All Products"));
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody ProductRequest request) {
        return ResponseEntity.ok(BaseResponse.success(productService.update(id, request), "Success Update Product"));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        return ResponseEntity.ok(BaseResponse.success(productService.delete(id), "Success Delete Product"));
    }
}
