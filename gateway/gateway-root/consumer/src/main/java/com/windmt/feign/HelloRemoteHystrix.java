package com.windmt.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: yibo
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${server.port}")
    private Integer port;

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        System.err.println("=======服务降级HelloRemoteHystrix服务的端口========="+port);
        logger.error("=======服务降级HelloRemoteHystrix服务的端口========="+port);
        return "%%%%%%%%%%%%%%%%服务降级Hello World!%%%%%%%%%%%%%%";
    }

}