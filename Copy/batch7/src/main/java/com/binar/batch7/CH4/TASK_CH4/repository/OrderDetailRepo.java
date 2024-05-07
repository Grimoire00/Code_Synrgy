package com.binar.batch7.CH4.TASK_CH4.repository;

import com.binar.batch7.CH4.TASK_CH4.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, UUID> {
}
