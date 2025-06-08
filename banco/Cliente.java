package banco;

/**
 * Classe Cliente - representa um cliente do banco.
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String email;
    
    /**
     * Construtor padrão.
     */
    public Cliente() {
    }
    
    /**
     * Construtor com nome do cliente.
     * 
     * @param nome Nome do cliente
     */
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    /**
     * Construtor completo.
     * 
     * @param nome Nome do cliente
     * @param cpf CPF do cliente
     * @param email Email do cliente
     */
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
