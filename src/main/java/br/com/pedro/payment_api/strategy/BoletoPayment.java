package br.com.pedro.payment_api.strategy;

import org.springframework.stereotype.Component;

@Component
public class BoletoPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Pagamento de " + amount + " realizado via Boleto";
    }

}
