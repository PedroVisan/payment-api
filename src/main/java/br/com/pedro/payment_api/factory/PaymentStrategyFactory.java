package br.com.pedro.payment_api.factory;

import br.com.pedro.payment_api.strategy.*;
import org.springframework.stereotype.Component;

@Component
public class PaymentStrategyFactory {

    private final PixPayment pixPayment;
    private final CreditCardPayment creditCardPayment;
    private final BoletoPayment boletoPayment;

    public PaymentStrategyFactory(
            PixPayment pixPayment,
            CreditCardPayment creditCardPayment,
            BoletoPayment boletoPayment
    ) {
        this.pixPayment = pixPayment;
        this.creditCardPayment = creditCardPayment;
        this.boletoPayment = boletoPayment;
    }

    public PaymentStrategy getStrategy(String method) {

        switch (method.toUpperCase()) {

            case "PIX":
                return pixPayment;

            case "CARD":
                return creditCardPayment;

            case "BOLETO":
                return boletoPayment;

            default:
                throw new IllegalArgumentException("Método de pagamento inválido: " + method);
        }
    }
}