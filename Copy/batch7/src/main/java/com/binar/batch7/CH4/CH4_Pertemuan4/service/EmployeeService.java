package com.binar.batch7.CH4.CH4_Pertemuan4.service;

import com.binar.batch7.CH4.CH4_Pertemuan4.entity.Employee;

import java.util.Map;

public interface EmployeeService {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

}
