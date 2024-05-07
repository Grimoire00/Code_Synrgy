package com.binar.batch7.CH5_Pertemuan1.service;

import com.binar.batch7.CH5_Pertemuan1.entity.Employee;

import java.util.Map;

public interface EmployeeService {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

    Object pagination(int i, int i1);
}
