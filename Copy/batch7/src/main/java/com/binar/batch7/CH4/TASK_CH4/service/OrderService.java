package com.binar.batch7.CH4.TASK_CH4.service;

import com.binar.batch7.CH4.TASK_CH4.dto.OrderDetailRequest;
import com.binar.batch7.CH4.TASK_CH4.dto.OrderDetailResponse;
import com.binar.batch7.CH4.TASK_CH4.dto.OrderRequest;
import com.binar.batch7.CH4.TASK_CH4.dto.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    OrderResponse create(OrderRequest request);

    List<OrderResponse> findAll();

    OrderResponse update(UUID id, OrderRequest request);

    OrderResponse delete(UUID id);

    Page<OrderDetailResponse> findAllDetails(Pageable pageable);

    OrderDetailResponse createDetail(OrderDetailRequest request);
}
