package com.study.payment.service.impl;

import com.study.common.entity.Payment;
import com.study.payment.respository.PaymentRepository;
import com.study.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 11:12
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment set(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> list(Long id) {
        List<Payment> result = new ArrayList<>();
        if(id == null){
            result = paymentRepository.findAll();
        }else {
            Optional<Payment> optional = paymentRepository.findById(id);
            if(optional.isPresent()){
                result.add(optional.get());
            }
        }
        return result;
    }
}
