public class Cliente {
    private String nome;
    private String cpf;
    private String senha;
    private Conta[] conta;

    public Cliente(String nome, String cpf, String senha, Conta contaTipo1, Conta contaTipo2) {
        this.conta = new Conta[2];
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.conta[0] = contaTipo1;
        this.conta[1] = contaTipo2;
    }

    public Conta getConta(int indice) {
        return conta[indice];
    }

}
