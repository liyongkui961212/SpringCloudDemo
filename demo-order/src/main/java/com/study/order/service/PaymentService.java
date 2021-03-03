package com.study.order.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.study.common.entity.Payment;
import com.study.common.result.CommonResult;
import com.study.order.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/3/1 10:08
 */
//@Component
@FeignClient(value = "PAYMENT-SERVICE/payment",fallback = PaymentServiceImpl.class )
public interface PaymentService {

    @PostMapping("/set")
    public CommonResult set(@RequestBody Payment payment);

    @GetMapping("/list")
    public CommonResult list();
}
