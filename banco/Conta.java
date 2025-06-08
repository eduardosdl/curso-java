package banco;

/**
 * Classe abstrata Conta - representa a abstração de uma conta bancária.
 */
public abstract class Conta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    /**
     * Construtor da conta.
     * 
     * @param cliente Cliente titular da conta
     */
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    /**
     * Realiza um saque na conta.
     * 
     * @param valor Valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }
        this.saldo -= valor;
    }
    
    /**
     * Realiza um depósito na conta.
     * 
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    /**
     * Realiza uma transferência para outra conta.
     * 
     * @param valor Valor a ser transferido
     * @param contaDestino Conta destino da transferência
     */
    public void transferir(double valor, Conta contaDestino) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    /**
     * Método abstrato para impressão do extrato da conta.
     */
    public abstract void imprimirExtrato();
    
    /**
     * Método para imprimir informações comuns a todas as contas.
     */
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}
