package com.binar.batch7.CH4.TASK_CH4.service;

import com.binar.batch7.CH4.TASK_CH4.dto.MerchantRequest;
import com.binar.batch7.CH4.TASK_CH4.dto.MerchantResponse;

import java.util.List;
import java.util.UUID;

public interface MerchantService {

    MerchantResponse create(MerchantRequest request);

    List<MerchantResponse> findAll(Boolean isOpen);

    MerchantResponse update(UUID id, MerchantRequest request);

    MerchantResponse delete(UUID id);

    MerchantResponse findById(UUID id);

}
