package br.edu.fatecfranca.exe0;

public class Diretor extends Funcionario {
    private float acoes;

    public Diretor() {
        super();
        this.acoes = 0;
    }

    public Diretor(String nome, String cpf, float salario, float acoes) {
        super(nome, cpf, salario);
        this.acoes = acoes;
    }

    public float getAcoes() {
        return acoes;
    }

    public void setAcoes(float acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return super.toString() + "Diretor{" + "acoes=" + acoes + '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (this.acoes * 2)/12;
    }
}
