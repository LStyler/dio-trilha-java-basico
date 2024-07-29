import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        //SupressWarning adicionado para retirar o alerta sobre o scanner.
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));
        //Exibir as mensagens para o nosso usuário.
                //Obter pelo scanner os valores digitados no terminal.

        System.out.println("Digite o número da sua conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor a ser depositado: ");
        double saldoCliente = scanner.nextDouble();

        //Exibir a mensagem da conta criada.

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " R$ já está disponível para saque!");
    }
}
