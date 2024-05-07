package com.binar.batch7.CH4.TASK_CH4.repository;

import com.binar.batch7.CH4.TASK_CH4.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<Product, UUID> {
}
