public class Cliente {
    private String nome;
    private String cpf;
    private String senha;
    // um vetor de contas para que possam ser atribuídas diferentes contas, como corrente, poupança, etc.
    private Conta[] conta;

    public Cliente(String nome, String cpf, String senha, Conta contaTipo1, Conta contaTipo2) {
        this.conta = new Conta[2];
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.conta[0] = contaTipo1;
        this.conta[1] = contaTipo2;
    }

    // método de acesso criado pela IDE
    /*public Conta[] getConta() {
        return conta;
    }*/

    // método de acesso implementado por nós para acessar a conta desejada no vetor pelo índice
    public Conta getConta(int indice) {
        return conta[indice];
    }
}
