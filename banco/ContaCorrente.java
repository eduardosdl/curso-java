package banco;

/**
 * Classe ContaCorrente - representa uma conta corrente no banco.
 */
public class ContaCorrente extends Conta {
    
    private static final double TAXA_MANUTENCAO = 20.0;
    
    /**
     * Construtor da conta corrente.
     * 
     * @param cliente Cliente titular da conta corrente
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }
    
    /**
     * Cobra a taxa de manutenção mensal da conta corrente.
     */
    public void cobrarTaxaManutencao() {
        this.saldo -= TAXA_MANUTENCAO;
        System.out.println(String.format("Taxa de manutenção de R$ %.2f cobrada com sucesso.", TAXA_MANUTENCAO));
    }
}
