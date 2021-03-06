package com.study.payment.controller;

import com.study.common.result.CommonResult;
import com.study.common.entity.Payment;
import com.study.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 11:12
 */
@RestController
@RequestMapping("/payment")
@Slf4j
@RefreshScope
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${test.port}")
    private String serverPort;

    @GetMapping("/port")
    public CommonResult port(){
        return CommonResult.builder().code(200).message("端口：" + serverPort).build();
    }

    @PostMapping("/set")
    public CommonResult set(@RequestBody Payment payment){
        Payment save = paymentService.set(payment);
        return CommonResult.builder()
                .code(200)
                .message("添加成功")
                .data(save)
                .build();
    }

    @GetMapping({"/list","/list/{id}"})
    public CommonResult list(@PathVariable(required = false) Long id){
        List<Payment> result = paymentService.list(id);
        return CommonResult.builder()
                .code(200)
                .message("查询成功")
                .data(result)
                .build();
    }

}
