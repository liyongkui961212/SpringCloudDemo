package com.study.payment.respository;

import com.study.common.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 11:09
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>, CrudRepository<Payment,Long> {

}
