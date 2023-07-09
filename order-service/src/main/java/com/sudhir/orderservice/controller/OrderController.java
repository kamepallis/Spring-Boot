package com.sudhir.orderservice.controller;

import com.sudhir.orderservice.common.Payment;
import com.sudhir.orderservice.entity.Order;
import com.sudhir.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/placeOrder")
    public Order bookOrder(@RequestBody Order order) {
        Payment payment = new Payment();

        payment.setStatus("Failed!!");
        Order o = orderRepository.save(order);
        payment.setOrderId(o.getOrderId());
        restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
        return order;
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable("orderId") int orderId) {
        return orderRepository.findById(orderId).get();
    }

    @GetMapping("/test")
    public String getOrder() {
        return "Hello, how are you";
    }
}
