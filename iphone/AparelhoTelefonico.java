package iphone;


/**
 * Interface que define o comportamento de um aparelho telefônico
 */
public interface AparelhoTelefonico {
    
    /**
     * Realiza uma chamada para o número especificado
     * @param numero Número de telefone para o qual ligar
     */
    void ligar(String numero);
    
    /**
     * Atende uma chamada telefônica recebida
     */
    void atender();
    
    /**
     * Inicia o serviço de correio de voz
     */
    void iniciarCorreioVoz();
}
