package br.com.pedro.payment_api.strategy;

public interface PaymentStrategy {
    String pay(double amount);
}