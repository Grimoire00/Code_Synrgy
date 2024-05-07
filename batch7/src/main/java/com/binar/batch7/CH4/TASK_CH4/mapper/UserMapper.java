package com.binar.batch7.CH4.TASK_CH4.mapper;


import com.binar.batch7.CH4.TASK_CH4.dto.UserResponse;
import com.binar.batch7.CH4.TASK_CH4.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .emailAddress(user.getEmailAddress())
                .build();
    }
}