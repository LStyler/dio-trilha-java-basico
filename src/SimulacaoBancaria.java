
import java.util.Scanner;

public class SimulacaoBancaria {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("Qual opção deseja acessar? 1- Deposito | 2- Sacar | 3- Saldo | 0- Encerrar");
        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    //Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    saldo = deposito;
                    System.out.println("Saldo atual: " + saldo);
                }
                case 2 -> {
                    //Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Quanto você deseja sacar?");
                    double sacarValor = scanner.nextDouble();
                    if (sacarValor <= saldo){
                        saldo = saldo - sacarValor;
                        System.out.println("Saldo atual: " + saldo);}
                    else{
                        System.out.println("Saldo insuficiente.");
                    }
                }
                case 3 -> //Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                case 0 -> {
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
