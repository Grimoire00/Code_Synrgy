package com.binar.batch7.CH4_Pertemuan3.service;

import com.binar.batch7.CH4_Pertemuan3.entity.Employee;

import java.util.Map;

public interface EmployeeService {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

}
