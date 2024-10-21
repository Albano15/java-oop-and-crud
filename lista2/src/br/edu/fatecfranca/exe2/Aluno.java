package br.edu.fatecfranca.exe2;

public class Aluno {
    private int NumeroAluno;
    private String nome;
    private int Idade;
    private float p1;
    private float p2;

    public Aluno() {
        this.NumeroAluno = 0;
        this.Idade = 0;
        this.nome = "Não Definido";
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(float p2, float p1, int idade, String nome, int numeroAluno) {
        this.p2 = p2;
        this.p1 = p1;
        Idade = idade;
        this.nome = nome;
        NumeroAluno = numeroAluno;
    }

    public int getNumeroAluno() {
        return NumeroAluno;
    }

    public void setNumeroAluno(int NumeroAluno) {
        if (NumeroAluno < 100000 || NumeroAluno > 999999) {
            System.out.println("O número máximo de dígitos é 6");
        } else {
            this.NumeroAluno = NumeroAluno;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("O número máximo de carateres é 30");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 < 0 ){
            System.out.println("P1 não pode ser negativo");
            this.p1 = 0;
        } else {
            this.p1 = p1;
        }
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade não pode ser negativa");
            this.Idade = 0;
        } else {
            this.Idade = idade;
        }

    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 < 0 ){
            System.out.println("P2 não pode ser negativa");
            this.p2 = 0;
        } else {
            this.p2 = p2;
        }
    }

    public float NotaFinal (){
        float notaFinal = (this.p1 + this.p2) / 2;
        return notaFinal;
    }

    public String dadosAluno() {
        return "Aluno{" +
                "NumeroAluno=" + NumeroAluno +
                ", nome='" + nome + '\'' +
                ", Idade=" + Idade + '}';
    }
}
