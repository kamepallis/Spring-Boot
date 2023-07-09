package com.sudhir.paymentservice.repository;

import com.sudhir.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRespository extends JpaRepository<Payment, Integer> {

    @Override
    Optional<Payment> findById(Integer integer);
}
