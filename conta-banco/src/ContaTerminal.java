import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner -> Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o usuário     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        String numeroDaConta = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome completo do cliente: ");
        String nomeDoCliente = scanner.next();
        String sobrenomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o o seu saldo: ");
        float saldo = scanner.nextFloat();
        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada!
        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeDoCliente, sobrenomeDoCliente, agencia, numeroDaConta, saldo);
        scanner.close();
    }
}
