package com.binar.batch7.CH4_Pertemuan2.service;

import com.binar.batch7.CH4_Pertemuan2.entity.Employee;

import java.util.Map;

public interface ServiceEmployee {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

}
