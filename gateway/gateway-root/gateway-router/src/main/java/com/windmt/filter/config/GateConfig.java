package com.windmt.filter.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        // @formatter:off
        return builder.routes()
                .route(
                        r -> r.path("/fluent/customer/**")
                                .filters(f -> f.stripPrefix(2)
//                                        .filter(new ElapsedFilter())
                                        .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                                .uri("lb://CONSUMER")
                                .order(0)
                                .id("fluent_customer_service")
                )
                .build();
//        // @formatter:on
    }


}
