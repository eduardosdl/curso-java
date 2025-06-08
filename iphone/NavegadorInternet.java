package iphone;


/**
 * Interface que define o comportamento de um navegador de internet
 */
public interface NavegadorInternet {
    
    /**
     * Exibe uma página da web
     * @param url Endereço da página a ser exibida
     */
    void exibirPagina(String url);
    
    /**
     * Adiciona uma nova aba no navegador
     */
    void adicionarNovaAba();
    
    /**
     * Atualiza a página atualmente em exibição
     */
    void atualizarPagina();
}
