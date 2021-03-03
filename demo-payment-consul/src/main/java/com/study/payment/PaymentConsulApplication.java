package com.study.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/3/1 9:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication.class,args);
    }
}
