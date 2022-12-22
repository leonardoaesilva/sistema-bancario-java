public class Conta {
    private String numConta;
    private String agencia;
    private double saldo;
    private String tipoDeConta;

    public Conta(String numConta, String tipoDeConta) {
        this.numConta = numConta;
        this.agencia = "1";
        this.saldo = 0;
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação inválida!");
            return false;
        } else if (valor > saldo) {
            System.out.println("Saldo indisponível!");
            return false;
        }

        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação inválida!");
        } else {
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
        } else {
            System.out.println("Não foi possível efetuar a operação, tente novamente.");
        }
    }
}
