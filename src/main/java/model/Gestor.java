package model;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends Pessoa {

    private List<Pessoa> pessoas;

    public Gestor(String nome, String cpf, String cargo) {
        super(nome, cpf, cargo);
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void addSubordinado(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public String getInfo() {
        String output;
        output = "Gestor: " + this.getCargo() + " - " + this.getNome() + " / " + this.getCpf() + "\n";

        for (Pessoa pessoa : pessoas) {
            output = output.concat(pessoa.getInfo());
        }
        return output;
    }
}
