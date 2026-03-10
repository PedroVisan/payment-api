# Payment API - Strategy Pattern

API REST desenvolvida com **Java e Spring Boot** para demonstrar a aplicação de **Design Patterns** na prática, principalmente o **Strategy Pattern** combinado com **Factory Pattern**.

O projeto simula um sistema simples de **processamento de pagamentos**, onde diferentes métodos de pagamento são aplicados dinamicamente.

---

# 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Maven
* Swagger (documentação da API)
* Programação Orientada a Objetos

---

# 🧠 Design Patterns aplicados

## Strategy Pattern

Permite definir uma família de algoritmos (estratégias) e torná-los intercambiáveis em tempo de execução.

No projeto, cada método de pagamento possui sua própria estratégia:

* PixPayment
* CreditCardPayment
* BoletoPayment

Todas implementam a interface:

```
PaymentStrategy
```

---

## Factory Pattern

Centraliza a escolha da estratégia de pagamento.

A classe responsável por isso é:

```
PaymentStrategyFactory
```

Ela retorna a estratégia correta com base no método de pagamento informado.

---

# 📂 Estrutura do projeto

```
src/main/java/br/com/pedro/payment_api

controller
 └─ PaymentController

dto
 └─ PaymentRequest

enums
 └─ PaymentMethod

factory
 └─ PaymentStrategyFactory

service
 └─ PaymentService

strategy
 ├─ PaymentStrategy
 ├─ PixPayment
 ├─ CreditCardPayment
 └─ BoletoPayment

PaymentApiApplication
```

---

# 🔁 Fluxo da aplicação

```
Request HTTP
     ↓
Controller
     ↓
Service
     ↓
Factory
     ↓
Strategy
     ↓
Resposta da API
```

---

# 📡 Endpoint da API

## Processar pagamento

**POST**

```
/payments
```

### Body da requisição

```json
{
  "method": "PIX",
  "amount": 100
}
```

### Métodos disponíveis

```
PIX
CARD
BOLETO
```

### Resposta esperada

```
Pagamento de 100 realizado via PIX
```

---

# 📖 Documentação da API

Com a aplicação rodando, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

Lá é possível testar os endpoints diretamente pela interface.

---

# ▶️ Como executar o projeto

### 1. Clonar o repositório

```
git clone https://github.com/PedroVisan/payment-api.git
```

### 2. Entrar na pasta

```
cd payment-api
```

### 3. Executar a aplicação

```
./mvnw spring-boot:run
```

ou rodar a classe:

```
PaymentApiApplication
```

---

# 🎯 Objetivo do projeto

Este projeto foi desenvolvido com fins de estudo para:

* Praticar **Spring Boot**
* Aplicar **Design Patterns em Java**
* Demonstrar boas práticas de organização em APIs REST

---

# 👨‍💻 Autor

Pedro Viana
Desenvolvedor em formação focado em Backend Java.
