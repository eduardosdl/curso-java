package com.dio.padroes.singleton;

/**
 * Singleton "thread safe" - Seguro para uso em ambientes multi-thread
 * @author Eduardo
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    // Construtor privado
    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
