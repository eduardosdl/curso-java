package com.dio.padroes.singleton;

/**
 * Singleton "apressado" - Já instancia no momento da declaração
 * @author Eduardo
 */
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();
    
    // Construtor privado
    private SingletonEager() {
        super();
    }
    
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
