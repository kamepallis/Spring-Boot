package com.sudhir.orderservice.common;

import lombok.Data;

@Data
public class Payment {
    private String status;
    private String transactionId;
    private int orderId;
}
