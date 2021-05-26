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
        return "======Hello World!\nfrom gateway";
    }

}