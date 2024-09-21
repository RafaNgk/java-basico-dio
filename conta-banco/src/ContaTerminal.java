import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner -> Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o usuário     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da conta: ");
        String numeroDaConta = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        int saldo = scanner.nextInt();
        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada!
    }
}
