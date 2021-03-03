package com.study.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 10:28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperApplication.class,args);
    }

}
