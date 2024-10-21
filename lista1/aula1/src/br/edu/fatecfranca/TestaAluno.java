package br.edu.fatecfranca;

import br.edu.fatecfranca.teste.Aluno;

import javax.swing.*;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(7, 18, "Rafael A", 3.7f, 7.3f);
        aluno1.dadosAluno();
        System.out.println("A média é: " + aluno1.notaFinal());
        System.out.println("O aluno: " + aluno1.Passou());

        // JOptionPane.showInputDialog("De qual velocidade você irá acelerar");
        // JOptionPane.showMessageDialog(null, aluno1.notaFinal());

        System.out.println(aluno1.toString());
    }
}

