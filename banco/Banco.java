package banco;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Banco - representa o banco e gerencia suas contas.
 */
public class Banco {
    
    private String nome;
    private List<Conta> contas;
    
    /**
     * Construtor do banco.
     * 
     * @param nome Nome do banco
     */
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    /**
     * Adiciona uma conta ao banco.
     * 
     * @param conta Conta a ser adicionada
     */
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
    
    /**
     * Lista todas as contas do banco.
     */
    public void listarContas() {
        System.out.println("=== Lista de Contas do " + this.nome + " ===");
        
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
            return;
        }
        
        for (Conta conta : contas) {
            String tipoConta = conta instanceof ContaCorrente ? "Conta Corrente" : "Conta Poupança";
            System.out.println(String.format("Tipo: %s | Titular: %s | Agência: %d | Número: %d", 
                tipoConta, conta.getCliente().getNome(), conta.getAgencia(), conta.getNumero()));
        }
    }
    
    /**
     * Busca uma conta pelo número.
     * 
     * @param numero Número da conta
     * @return A conta encontrada ou null se não encontrar
     */
    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
}
