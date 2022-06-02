package model;

public class Empresa {

    private String nome;
    private String cnpj;
    private Pessoa funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFuncionarios() {
        if (this.funcionarios == null) {
            throw new NullPointerException("Ops. Não há funcionários cadastrados para esta empresa.");
        }
        return this.funcionarios.getInfo();
    }

    public void setFuncionarios(Pessoa funcionarios) {
        this.funcionarios = funcionarios;
    }
}
