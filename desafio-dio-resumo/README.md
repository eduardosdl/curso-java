# Resumo de Projetos Java - Bootcamp DIO

Este repositório contém o resumo das lições aprendidas durante o desenvolvimento dos laboratórios práticos do bootcamp de Java na DIO.

## Projetos Desenvolvidos

### 1. Simulação de Conta Bancária (ContaTerminal)
Um projeto simples para simular a criação de uma conta bancária pelo terminal, coletando informações como número da conta, agência, nome do cliente e saldo.

**Conceitos aplicados:**
- Entrada e saída de dados com a classe `Scanner`
- Manipulação de diferentes tipos de dados
- Formatação de strings para saída ao usuário

### 2. Sistema Bancário Digital
Um sistema completo de banco digital que implementa diversas operações bancárias utilizando conceitos avançados de Programação Orientada a Objetos.

**Conceitos aplicados:**
- **Abstração**: Utilizando classe abstrata `Conta` e interface `IConta`
- **Encapsulamento**: Atributos privados com métodos getters/setters
- **Herança**: `ContaCorrente` e `ContaPoupanca` herdam de `Conta`
- **Polimorfismo**: Através da implementação da interface e sobrescrita de métodos
- **Composição**: Relacionamento entre as classes `Banco`, `Conta` e `Cliente`

**Funcionalidades implementadas:**
- Criação de diferentes tipos de contas
- Operações de depósito, saque e transferência
- Impressão de extrato
- Aplicação de regras específicas para cada tipo de conta

### 3. Contador com Tratamento de Exceções
Um programa que recebe dois números como parâmetros e realiza uma contagem, implementando tratamento de exceções personalizadas.

**Conceitos aplicados:**
- Tratamento de exceções (try-catch)
- Criação de exceções personalizadas
- Controle de fluxo com estruturas condicionais
- Loops para iteração

### 4. Modelagem do iPhone
Uma implementação de modelagem em Java baseada no lançamento do iPhone de 2007, utilizando interfaces para representar os diferentes comportamentos do dispositivo.

**Conceitos aplicados:**
- **Interfaces**: Definição de contratos para diferentes funcionalidades
- **Implementação múltipla**: A classe iPhone implementa múltiplas interfaces
- **Coesão e baixo acoplamento**: Separação clara de responsabilidades
- **Encapsulamento**: Gerenciamento do estado interno do objeto

**Funcionalidades modeladas:**
- Reprodutor Musical
- Aparelho Telefônico
- Navegador de Internet

### 5. Padrões de Projeto em Java
Implementação de padrões de projeto clássicos demonstrando boas práticas de desenvolvimento e soluções elegantes para problemas comuns.

**Padrões implementados:**
- **Singleton**: Três variações diferentes (Lazy, Eager e LazyHolder)
- **Strategy**: Implementação com interfaces e classes concretas
- **Facade**: Simplificação de subsistemas complexos

**Conceitos aplicados:**
- Criação de objetos com instância única
- Encapsulamento de algoritmos intercambiáveis
- Simplificação de interfaces complexas

## Principais Lições Aprendidas

1. **Fundamentos da Linguagem Java**
   - Sintaxe básica e avançada
   - Tipagem forte e estática
   - Estruturas de controle e coleções

2. **Programação Orientada a Objetos**
   - Pilares da POO (Abstração, Encapsulamento, Herança e Polimorfismo)
   - Modelagem de classes e interfaces
   - Relações entre objetos

3. **Boas Práticas de Programação**
   - Clean Code
   - Princípios SOLID
   - Padrões de design eficientes

4. **Tratamento de Erros**
   - Uso de exceções para controle de fluxo
   - Criação de exceções personalizadas
   - Estratégias de tratamento de erros

5. **Arquitetura de Software**
   - Separação de responsabilidades
   - Padrões arquiteturais
   - Modularização de código

## Conclusão

Os projetos desenvolvidos durante o bootcamp proporcionaram uma jornada completa através dos principais conceitos de programação Java, desde aplicações básicas de terminal até sistemas complexos utilizando padrões de projeto avançados. A aplicação prática desses conceitos solidificou o aprendizado e preparou para desafios reais de desenvolvimento de software.

## Autor
Eduardo

## Agradecimentos
- Digital Innovation One (DIO) pelo excelente bootcamp
- Instrutores pelos conteúdos de qualidade
- Comunidade de desenvolvedores pelo suporte
