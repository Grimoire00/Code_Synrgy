package com.binar.batch7.CH4.TASK_CH4.controller;

import com.binar.batch7.CH4.TASK_CH4.dto.BaseResponse;
import com.binar.batch7.CH4.TASK_CH4.dto.MerchantRequest;
import com.binar.batch7.CH4.TASK_CH4.service.MerchantService;
import com.binar.batch7.CH4.TASK_CH4.sp.QuerySPMerchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/merchants")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @Autowired
    private QuerySPMerchant merchantQuerySP;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody MerchantRequest merchantRequest) {
        jdbcTemplate.execute(merchantQuerySP.create);
        return ResponseEntity.ok(BaseResponse.success(merchantService.create(merchantRequest), "Success Create Merchant"));
    }

    @GetMapping
    public ResponseEntity<?> findAll(@RequestParam(required = false) Boolean isOpen) {
        return ResponseEntity.ok(BaseResponse.success(merchantService.findAll(isOpen), "Success Get All Merchants"));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> findById(@PathVariable UUID id) {
        jdbcTemplate.execute(merchantQuerySP.readById);
        return ResponseEntity.ok(BaseResponse.success(merchantService.findById(id), "Success Get Detail Merchant"));
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody MerchantRequest merchantRequest) {
        jdbcTemplate.execute(merchantQuerySP.update);
        return ResponseEntity.ok(BaseResponse.success(merchantService.update(id, merchantRequest), "Success Update Merchant"));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        jdbcTemplate.execute(merchantQuerySP.delete);
        return ResponseEntity.ok(BaseResponse.success(merchantService.delete(id), "Success Delete Merchant"));
    }
}
