package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private String sigla;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina() {
    }

    public Disciplina(int id, String nome, String sigla, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Disciplina(int id, String nome, String sigla, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

    public void addAluno(Aluno al) {
        this.alunos.add(al);
    }
}
