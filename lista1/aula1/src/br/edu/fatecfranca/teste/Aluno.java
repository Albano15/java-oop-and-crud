package br.edu.fatecfranca.teste;

public class Aluno {
    public int numeroAluno;
    public int idade;
    public String nome;
    public float p1;
    public float p2;


    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public void dadosAluno() {
        System.out.println("O nome do aluno é: " + this.nome + ", a idade é: " + this.idade + ", o número é: " + this.numeroAluno);
    }

    public String Passou(){
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numeroAluno= " + numeroAluno +
                ", idade= " + idade +
                ", nome= '" + nome + '\'' +
                ", média= " + this.notaFinal() +
                ", Situação= " + this.Passou() +
                '}';
    }
}
