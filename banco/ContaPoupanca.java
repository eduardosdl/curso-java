package banco;

/**
 * Classe ContaPoupanca - representa uma conta poupança no banco.
 */
public class ContaPoupanca extends Conta {
    
    private static final double TAXA_RENDIMENTO = 0.05; // 5% ao ano
    
    /**
     * Construtor da conta poupança.
     * 
     * @param cliente Cliente titular da conta poupança
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }
    
    /**
     * Aplica o rendimento anual na conta poupança.
     */
    public void aplicarRendimento() {
        double rendimento = this.saldo * TAXA_RENDIMENTO;
        this.saldo += rendimento;
        System.out.println(String.format("Rendimento anual de R$ %.2f aplicado com sucesso.", rendimento));
    }
}
