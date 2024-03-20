package com.spring.user.paymentservice.userpaymentservice.paymentcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentApi {

    @GetMapping("/pay")
    public String makePayment()
    {
        return "Payment is Sucessfull";
    }
}
