package com.windmt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yibo
 **/
@RequestMapping("/hello")
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${server.port}")
    private Integer port;

    @GetMapping("")
    public String hello(@RequestParam String name) {
        logger.error("======hello服务的端口==========="+port);
        return "Hello, " + name + "!";
    }

}
