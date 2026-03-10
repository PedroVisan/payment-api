package br.com.pedro.payment_api.service;

import br.com.pedro.payment_api.factory.PaymentStrategyFactory;
import br.com.pedro.payment_api.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentStrategyFactory factory;

    public PaymentService(PaymentStrategyFactory factory) {
        this.factory = factory;
    }

    public String processPayment(String method, double amount) {

        PaymentStrategy strategy = factory.getStrategy(method);

        return strategy.pay(amount);
    }
}