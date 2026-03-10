package br.com.pedro.payment_api.controller;

import br.com.pedro.payment_api.dto.PaymentRequest;
import br.com.pedro.payment_api.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public String processPayment(@RequestBody PaymentRequest request) {

        return service.processPayment(
                request.method(),
                request.amount()
        );
    }
}
