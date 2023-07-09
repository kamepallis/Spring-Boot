package com.sudhir.paymentservice.controller;

import com.sudhir.paymentservice.entity.Payment;
import com.sudhir.paymentservice.repository.PaymentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentRespository paymentRespository;

    @PostMapping("/doPayment")
    public Payment payment(@RequestBody Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRespository.save(payment);
    }

    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable("paymentId") Integer paymentId) {
        return paymentRespository.findById(paymentId).get();
    }

    @GetMapping("/test")
    public String test() {
        return "Hello, payment";
    }

}
