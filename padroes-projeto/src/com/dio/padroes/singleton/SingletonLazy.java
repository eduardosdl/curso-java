package com.dio.padroes.singleton;

/**
 * Singleton "preguiçoso" - Só instancia quando for solicitado
 * @author Eduardo
 */
public class SingletonLazy {
    
    private static SingletonLazy instancia;
    
    // Construtor privado - garante que ninguém vai instanciar de fora
    private SingletonLazy() {
        super();
    }
    
    // Método público que fornece a instância única
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
