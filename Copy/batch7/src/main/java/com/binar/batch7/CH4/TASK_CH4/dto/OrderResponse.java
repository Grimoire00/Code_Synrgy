package com.binar.batch7.CH4.TASK_CH4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private UUID id;
    private LocalDateTime orderTime;
    private String destinationAddress;
    private Boolean isComplete;
}
