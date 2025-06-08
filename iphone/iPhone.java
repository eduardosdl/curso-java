package iphone;


/**
 * Classe que representa o iPhone, implementando as funcionalidades de:
 * - Reprodutor Musical
 * - Aparelho Telefônico
 * - Navegador Internet
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private String numeroSerie;
    private String musicaAtual;
    private boolean reproduzindo;
    private boolean emChamada;
    private String paginaAtual;
    
    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.reproduzindo = false;
        this.emChamada = false;
        this.paginaAtual = "";
    }
    
    // Implementação dos métodos da interface ReprodutorMusical
    
    @Override
    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            reproduzindo = true;
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }
    
    @Override
    public void pausar() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música em reprodução");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
    
    // Implementação dos métodos da interface AparelhoTelefonico
    
    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Ligando para: " + numero);
        } else {
            System.out.println("Já existe uma chamada em andamento");
        }
    }
    
    @Override
    public void atender() {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Chamada atendida");
        } else {
            System.out.println("Já existe uma chamada em andamento");
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementação dos métodos da interface NavegadorInternet
    
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    @Override
    public void atualizarPagina() {
        if (paginaAtual != null && !paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar");
        }
    }
    
    // Getters e Setters
    
    public String getModelo() {
        return modelo;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    public boolean isEmChamada() {
        return emChamada;
    }
    
    public String getPaginaAtual() {
        return paginaAtual;
    }
}
