package com.windmt.filter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yibo
 **/
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public String fallback() {
        System.err.println("===========后端服务异常,进行服务降级===========");
        return "======服务降级Hello World!\r\nfrom gateway=====";
    }

}