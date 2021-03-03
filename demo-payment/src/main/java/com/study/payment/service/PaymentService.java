package com.study.payment.service;

import com.study.common.entity.Payment;

import java.util.List;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 11:11
 */
public interface PaymentService {

    Payment set(Payment payment);

    List<Payment> list(Long id);
}
