package com.dio.padroes;

import com.dio.padroes.singleton.SingletonEager;
import com.dio.padroes.singleton.SingletonLazy;
import com.dio.padroes.singleton.SingletonLazyHolder;
import com.dio.padroes.strategy.Comportamento;
import com.dio.padroes.strategy.ComportamentoAgressivo;
import com.dio.padroes.strategy.ComportamentoDefensivo;
import com.dio.padroes.strategy.ComportamentoNormal;
import com.dio.padroes.strategy.Robo;
import com.dio.padroes.facade.Facade;

/**
 * Classe principal que demonstra o uso dos padrões de projeto
 * @author Eduardo
 */
public class Main {
    public static void main(String[] args) {
        
        // Teste do padrão Singleton
        System.out.println("### Padrão Singleton ###");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // Teste do padrão Strategy
        System.out.println("\n### Padrão Strategy ###");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        // Teste do padrão Facade
        System.out.println("\n### Padrão Facade ###");
        Facade facade = new Facade();
        facade.migrarCliente("Eduardo", "12345678");
    }
}
