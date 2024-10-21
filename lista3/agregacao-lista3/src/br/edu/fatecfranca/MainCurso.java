package br.edu.fatecfranca;

import br.edu.fatecfranca.exe2.Aluno;
import br.edu.fatecfranca.exe2.Curso;
import br.edu.fatecfranca.exe2.Professor;

public class MainCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Paulo", "paulo123");
        Aluno aluno2 = new Aluno(2, "Pedro", "pedro123");
        Aluno aluno3 = new Aluno(3, "Maria", "maria123");

        Professor professor1 = new Professor(10, "Carlão", "carlão123");
        Curso curso1 = new Curso(100, "ADS", "Exatas");
        curso1.addDisciplina(50, "Engenharia de Software", "ES1", professor1);

        curso1.addAlunoDisciplina(50, aluno1);
        curso1.addAlunoDisciplina(50, aluno2);
        curso1.addAlunoDisciplina(50, aluno3);

        System.out.println(curso1.toString());
    }
}
