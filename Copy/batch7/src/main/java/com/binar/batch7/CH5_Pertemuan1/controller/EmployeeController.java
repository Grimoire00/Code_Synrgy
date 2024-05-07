package com.binar.batch7.CH5_Pertemuan1.controller;


import com.binar.batch7.CH5_Pertemuan1.entity.Employee;
import com.binar.batch7.CH5_Pertemuan1.config.Config;
import com.binar.batch7.CH5_Pertemuan1.service.EmployeeService;
import com.binar.batch7.CH5_Pertemuan1.config.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/employee")//BCA
public class EmployeeController {

    //CURD : method CURD ada dimana?
    @Autowired
    private EmployeeService EmployeeService;

    Config config = new Config(); // tampa DI -> Depedency injection
    @Autowired
    private Response response;

    //JIKa pake DI
    @Autowired
    private Config configWithDI;

    @GetMapping(value = "")
    public String hello() {
        return "Hello Word";

    }

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping(value = {"/list-employee", "/list-employee/"})
    public ResponseEntity<Map> getListEmpoyee() {

        return new ResponseEntity<Map>(response.sukses(EmployeeService.pagination(0, 1)), HttpStatus.OK);
    }

//    @GetMapping(value = {"/list-employee", "/list-employee/"})
//    public ResponseEntity<Map> getListEmpoyee() {
//        return new ResponseEntity<Map>(response.sukses(EmployeeService.pagination(0,10)), HttpStatus.OK);
//    }
//
//    @PostMapping(value = {"/save", "/save/"})
//    public ResponseEntity<Map> saveEmployee(@RequestBody Employee request) {
//        return new ResponseEntity<Map>(response.sukses(request), HttpStatus.OK);
//    }
//
//    @PutMapping(value = {"/update", "/update/"})
//    public ResponseEntity<Map> updateEmployee(@RequestBody Employee request) {
//        return new ResponseEntity<Map>(response.sukses(request), HttpStatus.OK);
//    }@DeleteMapping(value = {"/deleted", "/deleted/"})
//    public ResponseEntity<Map> deleteEmployee(@RequestBody Employee request) {
//        return new ResponseEntity<Map>(response.sukses(request), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = {"/deleted/{id}", "/deleted/{id}"})
//    public ResponseEntity<Map> deleteEmployeeById(@PathVariable Long id) {
//        return new ResponseEntity<Map>(response.sukses(id), HttpStatus.OK);
//    }
//
//    @GetMapping(value = {"/get-data/{id}", "/get-data/{id}"})
//    public ResponseEntity<Map> getById(@PathVariable Long id) {
//        return new ResponseEntity<Map>(response.sukses(id), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = {"/deleted", "/deleted/"})
//    public ResponseEntity<Map> deleteEmployee(@RequestBody Employee request) {
//        return new ResponseEntity<Map>(response.sukses(request), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = {"/deleted/{id}", "/deleted/{id}"})
//    public ResponseEntity<Map> deleteEmployeeById(@PathVariable Long id) {
//        return new ResponseEntity<Map>(response.sukses(id), HttpStatus.OK);
//    }
//
//    @GetMapping(value = {"/get-data/{id}", "/get-data/{id}"})
//    public ResponseEntity<Map> getById(@PathVariable Long id) {
//        return new ResponseEntity<Map>(response.sukses(id), HttpStatus.OK);
//    }
}