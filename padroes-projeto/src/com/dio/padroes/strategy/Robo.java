package com.dio.padroes.strategy;

/**
 * Classe que usa a estratégia de comportamento
 * @author Eduardo
 */
public class Robo {
    
    private Comportamento comportamento;
    
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void mover() {
        comportamento.mover();
    }
}
