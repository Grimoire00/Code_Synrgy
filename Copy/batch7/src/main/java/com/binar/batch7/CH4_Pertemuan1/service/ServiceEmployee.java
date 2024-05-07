package com.binar.batch7.CH4_Pertemuan1.service;

import com.binar.batch7.CH4_Pertemuan1.entity.Employee;

import java.util.Map;

public interface ServiceEmployee {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

}
