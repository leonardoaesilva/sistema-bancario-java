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
        Conta contaPoupanca = new Conta("123", "poupança");
        Conta contaCorrente = new Conta("456", "corrente");

        contaPoupanca.depositar(400);
        System.out.println("Saldo: R$ " + contaPoupanca.getSaldo());
        contaPoupanca.transferir(120, contaCorrente);
        System.out.println("Saldo: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo: R$ " + contaPoupanca.getSaldo());
    }
}