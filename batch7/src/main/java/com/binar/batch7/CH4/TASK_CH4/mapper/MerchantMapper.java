package com.binar.batch7.CH4.TASK_CH4.mapper;

import com.binar.batch7.CH4.TASK_CH4.dto.MerchantResponse;
import com.binar.batch7.CH4.TASK_CH4.entity.Merchant;
import org.springframework.stereotype.Component;

@Component
public class MerchantMapper {
    public MerchantResponse toMerchantResponse(Merchant merchant) {
        return MerchantResponse.builder()
                .id(merchant.getId().toString())
                .name(merchant.getName())
                .location(merchant.getLocation())
                .isOpen(merchant.getIsOpen())
                .build();
    }
}
