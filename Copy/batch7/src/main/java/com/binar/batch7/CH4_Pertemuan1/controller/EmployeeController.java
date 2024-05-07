package com.binar.batch7.CH4_Pertemuan1.controller;

import com.binar.batch7.CH4_Pertemuan1.config.Config;
import com.binar.batch7.CH4_Pertemuan1.entity.Employee;
import com.binar.batch7.CH4_Pertemuan1.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    //CURD : method CURD ada dimana?
    @Autowired
    private ServiceEmployee serviceEmployee;

    Config config = new Config(); // tampa DI -> Depedency injection

    //JIKa pake DI
    @Autowired
    private Config configWithDI;

//    public  EmployeeController (ServiceEmployee serviceEmployee){
//
//    }


    @PostMapping(value = "/save")
    public Map hello(@RequestBody Employee request){
        Map map = new HashMap();
        map =  serviceEmployee.save(request);
        return map;
    }
}

