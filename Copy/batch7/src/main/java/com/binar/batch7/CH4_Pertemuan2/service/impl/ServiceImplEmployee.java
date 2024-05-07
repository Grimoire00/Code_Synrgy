package com.binar.batch7.CH4_Pertemuan2.service.impl;

import com.binar.batch7.CH4_Pertemuan2.entity.Employee;
import com.binar.batch7.CH4_Pertemuan2.service.ServiceEmployee;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.binar.batch7.CH4_Pertemuan2.controller.EmployeeController.logger;

@Service
public class ServiceImplEmployee implements ServiceEmployee {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImplEmployee.class);


    @Override
    public Map save(Employee request) {
        try{
            logger.info("Request",request);
            return null;
        }catch (Exception e){
            logger.error("Error save",e.getMessage());
            return null;
        }
    }

    @Override
    public Map edit(Employee request) {
        return null;
    }

    @Override
    public Map delete(Employee request) {
        return null;
    }

    @Override
    public Map list() {
        return null;
    }
}
