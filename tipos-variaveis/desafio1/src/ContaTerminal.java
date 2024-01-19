import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: importar a classe Scanner
        //Exibir as mensagens para o usuario
        //Obter pelo scanner os valores digitados
        //Exibir a mensagem conta criada

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência !");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite o número da Conta !");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite o seu nome !");
            String nome = scanner.next();

            System.out.println("Por favor, digite o seu saldo !");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        }

    }
}
