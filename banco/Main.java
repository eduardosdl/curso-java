package banco;

/**
 * Classe principal para testar a implementação do banco digital.
 */
public class Main {
    
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital");
        
        // Criando clientes
        Cliente jose = new Cliente("José Silva", "123.456.789-00", "jose@email.com");
        Cliente maria = new Cliente("Maria Oliveira", "987.654.321-00", "maria@email.com");
        
        // Criando contas
        ContaCorrente contaCorrenteJose = new ContaCorrente(jose);
        ContaPoupanca contaPoupancaJose = new ContaPoupanca(jose);
        ContaCorrente contaCorrenteMaria = new ContaCorrente(maria);
        
        // Adicionando contas ao banco
        banco.adicionarConta(contaCorrenteJose);
        banco.adicionarConta(contaPoupancaJose);
        banco.adicionarConta(contaCorrenteMaria);
        
        // Listando todas as contas do banco
        banco.listarContas();
        
        System.out.println("\n--- Realizando operações ---");
        
        // Operações na conta corrente do José
        contaCorrenteJose.depositar(1000);
        contaCorrenteJose.imprimirExtrato();
        
        // Transferência entre contas
        System.out.println("\n--- Transferência ---");
        contaCorrenteJose.transferir(500, contaPoupancaJose);
        
        System.out.println("\n--- Após transferência ---");
        contaCorrenteJose.imprimirExtrato();
        contaPoupancaJose.imprimirExtrato();
        
        // Cobrando taxa de manutenção da conta corrente
        System.out.println("\n--- Cobrança de taxa ---");
        contaCorrenteJose.cobrarTaxaManutencao();
        contaCorrenteJose.imprimirExtrato();
        
        // Aplicando rendimento na conta poupança
        System.out.println("\n--- Rendimento da poupança ---");
        contaPoupancaJose.aplicarRendimento();
        contaPoupancaJose.imprimirExtrato();
        
        // Tentativa de saque com valor maior que o saldo
        System.out.println("\n--- Tentativa de saque ---");
        contaCorrenteMaria.sacar(100);
    }
}
