package model;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf, cargo);
    }

    public String getInfo() {
        return "Funcionário: " + this.getCargo() + " - " + this.getNome() + " / " + this.getCpf() + "\n";
    }
}
