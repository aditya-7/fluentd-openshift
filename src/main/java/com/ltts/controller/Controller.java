/*
 * Copyright (c) 2020,L&T Technology Services.
 * All Rights Reserved.
 */
package com.ltts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/")
public class Controller {
    @GetMapping("test")
    public ResponseEntity<Map<String, Object>> getAuditLogs(
    ) {
        return new ResponseEntity("Response", HttpStatus.OK);
    }
}