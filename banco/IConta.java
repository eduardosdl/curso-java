package banco;

/**
 * Interface IConta - define as operações básicas de uma conta bancária.
 */
public interface IConta {
    
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor, Conta contaDestino);
    
    void imprimirExtrato();
}
