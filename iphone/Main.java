package iphone;

/**
 * Classe principal para demonstração do funcionamento do iPhone
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuIPhone = new iPhone("iPhone 14", "XYZ123456");
        
        System.out.println("===== DEMONSTRAÇÃO DO IPHONE =====");
        
        // Demonstração das funcionalidades de Reprodutor Musical
        System.out.println("\n>> REPRODUTOR MUSICAL");
        meuIPhone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        // Demonstração das funcionalidades de Aparelho Telefônico
        System.out.println("\n>> APARELHO TELEFÔNICO");
        meuIPhone.ligar("(11) 99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Demonstração das funcionalidades de Navegador Internet
        System.out.println("\n>> NAVEGADOR INTERNET");
        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://github.com");
        meuIPhone.atualizarPagina();
    }
}
