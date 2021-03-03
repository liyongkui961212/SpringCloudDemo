package com.study.order.controller;

import com.study.common.entity.Payment;
import com.study.common.result.CommonResult;
import com.study.order.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 15:59
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public CommonResult listPayment(){
        return restTemplate.getForObject("http://PAYMENT-SERVICE:8081/payment/list",CommonResult.class);
    }

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/test")
    public CommonResult test(){
        return paymentService.list();
    }

}
