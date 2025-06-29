package com.dio.padroes.facade;

/**
 * Facade que simplifica a integração com subsistemas
 * @author Eduardo
 */
public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
