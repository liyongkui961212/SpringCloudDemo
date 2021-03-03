package com.study.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/3/1 10:37
 */
@Configuration
public class OpenFeignLogConfig {

    @Bean
    Logger.Level feignLoggerLeave() {
        return Logger.Level.FULL;
    }
}
