package com.dio.padroes.strategy;

/**
 * Implementação concreta de uma estratégia
 * @author Eduardo
 */
public class ComportamentoNormal implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
