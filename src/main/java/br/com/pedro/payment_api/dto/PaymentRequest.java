package br.com.pedro.payment_api.dto;

public record PaymentRequest(
        String method,
        double amount
) {
}
