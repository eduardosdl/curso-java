package com.dio.padroes.strategy;

/**
 * Implementação concreta de uma estratégia
 * @author Eduardo
 */
public class ComportamentoDefensivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
