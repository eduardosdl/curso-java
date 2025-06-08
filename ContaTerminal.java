import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Criando o objeto Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando dados
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpando o buffer do scanner (necessário após nextInt ou nextDouble antes de nextLine)
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo mensagem final com os dados formatados
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
