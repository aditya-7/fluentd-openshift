/*
 * Copyright (c) 2020,L&T Technology Services.
 * All Rights Reserved.
 */
package com.ltts;

import org.fluentd.logger.FluentLogger;

import java.util.HashMap;
import java.util.Map;

public class FileUploaderApp {

    private static FluentLogger LOG = FluentLogger.getLogger("app", "fluentd-sbx-v33648.sbx2apps.paasdev.delta.com", 24224);

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
        LOG.close();
    }

}