# Banco Digital em Java

## Descrição
Este projeto implementa um sistema bancário digital utilizando Programação Orientada a Objetos (POO) em Java. O sistema permite a criação de diferentes tipos de contas bancárias, gerenciamento de clientes e realização de operações bancárias como depósito, saque e transferência.

## Estrutura do Projeto
- `Banco.java`: Representa o banco e gerencia as contas
- `Cliente.java`: Classe para representar os clientes do banco
- `Conta.java`: Classe abstrata que define a estrutura básica de uma conta bancária
- `IConta.java`: Interface que define as operações que uma conta deve implementar
- `ContaCorrente.java`: Implementação específica para conta corrente
- `ContaPoupanca.java`: Implementação específica para conta poupança
- `Main.java`: Classe principal com método main para testar a implementação

## Conceitos de POO aplicados
- **Abstração**: Utilizando classe abstrata `Conta` e interface `IConta`
- **Encapsulamento**: Atributos privados com métodos getters/setters
- **Herança**: `ContaCorrente` e `ContaPoupanca` herdam de `Conta`
- **Polimorfismo**: Através da implementação da interface e sobrescrita de métodos

## Funcionalidades
- Criação de diferentes tipos de contas
- Depósito em conta
- Saque em conta
- Transferência entre contas
- Impressão de extrato
- Cobrança de taxa de manutenção (Conta Corrente)
- Aplicação de rendimento (Conta Poupança)

## Como executar
1. Compile os arquivos Java:
```
javac *.java
```

2. Execute a classe principal:
```
java Main
```
