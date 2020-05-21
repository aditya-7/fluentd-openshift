/*
 * Copyright (c) 2020,L&T Technology Services.
 * All Rights Reserved.
 */
package com.ltts;

import org.fluentd.logger.FluentLogger;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FluentdApp {

    private static FluentLogger LOG = FluentLogger.getLogger("app", "fluentd", 24224);

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
        SpringApplication.run(FluentdApp.class, args);
    }

}