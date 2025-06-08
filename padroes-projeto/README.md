# Projeto Padrões de Projeto em Java

Este projeto explora a implementação de padrões de projeto em Java de forma simples e prática.

## Padrões implementados

### Singleton
Garante a existência de apenas uma instância de uma classe e fornece um ponto de acesso global a ela.

Implementações:
- **Singleton Lazy**: instanciado somente quando solicitado
- **Singleton Eager**: instanciado no momento da declaração
- **Singleton LazyHolder**: thread-safe e eficiente

### Strategy
Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.

Implementações:
- Interface `Comportamento`
- Classes concretas: `ComportamentoNormal`, `ComportamentoDefensivo`, `ComportamentoAgressivo`
- Contexto: `Robo`

### Facade
Fornece uma interface unificada para um conjunto de interfaces em um subsistema, definindo uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.

Implementações:
- Subsistemas: `CrmService`, `CepApi`
- Fachada: `Facade`

## Como executar

Para executar o projeto, compile e execute a classe `Main`:

```
javac -d bin com/dio/padroes/Main.java
java -cp bin com.dio.padroes.Main
```

## Autor
Eduardo
