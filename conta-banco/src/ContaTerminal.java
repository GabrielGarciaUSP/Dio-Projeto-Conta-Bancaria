import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de uma instância da classe Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        // Funções para inserir os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();


        scanner.nextLine(); // Função para ler toda a linha e encontrar um delimitador (inicio de uma nova linha)
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();

        // Fechamento do scanner
        scanner.close();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
