package br.com.pedro.payment_api.strategy;

import org.springframework.stereotype.Component;

@Component
public class PixPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Pagamento de " + amount + " realizado via PIX";
    }

}