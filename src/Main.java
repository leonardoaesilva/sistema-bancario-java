import java.util.Scanner;

public class Main {
    /*
    Sistema Bancário
    - Deposito
    - Sacar
    - Transferir

    - Transferir apenas se tiver saldo
    - Sacar apenas se tiver saldo

    - Todos os atributos tem que ser privados
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta contaPoupanca = new Conta("123", "poupança");
        Conta contaCorrente = new Conta("456", "corrente");

        /*contaPoupanca.depositar(400);
        System.out.println("Saldo: R$ " + contaPoupanca.getSaldo());
        contaPoupanca.transferir(120, contaCorrente);
        System.out.println("Saldo: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo: R$ " + contaPoupanca.getSaldo());*/

        boolean operando = true;
        while (operando) {
            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Transferir");
            System.out.println("0 - Deslogar");
            System.out.print("> ");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 0:
                    operando = false;
                    System.out.println("Tchau!");
                    break;
                case 1:
                    System.out.println("Informe o valor:");
                    System.out.print("> ");
                    double valorSaque = scanner.nextDouble();
                    contaCorrente.sacar(valorSaque);
                    break;
                case 2:
                    System.out.println("Informe o valor:");
                    System.out.print("> ");
                    double valorDeposito = scanner.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saldo: R$ " + contaCorrente.getSaldo());
                    break;
                case 4:
                    System.out.println("Informe o valor:");
                    System.out.print("> ");
                    double valorTransferencia = scanner.nextDouble();
                    contaCorrente.transferir(valorTransferencia, contaPoupanca);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }
}