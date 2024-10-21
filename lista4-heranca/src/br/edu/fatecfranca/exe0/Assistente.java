package br.edu.fatecfranca.exe0;


public class Assistente extends Funcionario {
    private float horaextra;

    public Assistente() {
        super();
        this.horaextra = 0;
    }

    public Assistente(String nome, String cpf, float salario, float horaextra) {
        super(nome, cpf, salario);
        this.horaextra = horaextra;
    }

    public float getHoraextra() {
        return horaextra;
    }

    public void setHoraextra(float horaextra) {
        this.horaextra = horaextra;
    }

    @Override //anula o método na classe pai
    public String toString() {
        return super.toString() + "\nHoraextra: " + horaextra;
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (horaextra * 40);
    }
}
