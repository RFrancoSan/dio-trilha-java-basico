import java.util.Scanner;
import java.util.Locale;
      //to do: Conhecer e importar a classe scanner
      //Exibir as mensagens para o nosso usuario
      //Obter pela classe scanner os valores digitados no terminal
      //Exibir a mensagem da conta criada


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Declaração de Variáveis
        int numero_conta;
        String agencia, nome_cliente;
        Double saldo;


        //Definição de localidade para formatação do double        
        Locale.setDefault(Locale.US);

        //criação do scanner
        Scanner scanner = new Scanner(System.in);

        //Atribuição de valores pelo scanner e utilização de "scanner.nextLine" para limpeza de Buffer
        System.out.println("Por favor, digite o número da Conta...");
        numero_conta = scanner.nextInt();
        scanner.nextLine(); //Limpeza de buffer

        System.out.println("Digite o número da Agência...");
        agencia = scanner.next();
        scanner.nextLine(); //Limpeza de buffer

        System.out.println("Digite o nome do Cliente...");
        nome_cliente = scanner.nextLine();
        
        System.out.println("Informe o valor a ser depositado...");
        saldo = scanner.nextDouble();


        //Mensagem de conta criada
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
