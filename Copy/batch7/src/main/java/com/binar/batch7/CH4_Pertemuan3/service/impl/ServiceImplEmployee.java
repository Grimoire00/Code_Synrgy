package com.binar.batch7.CH4_Pertemuan3.service.impl;

import com.binar.batch7.CH4_Pertemuan3.entity.Employee;
import com.binar.batch7.CH4_Pertemuan3.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceImplEmployee implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImplEmployee.class);
    @Override
    public Map save(Employee request) {
        try {
            logger.info("Request:",request);
            return null;
        }catch (Exception e){
            logger.error("Eror save:",e.getMessage());
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
