package br.edu.fatecfranca;

import br.edu.fatecfranca.teste.Carro;

import javax.swing.*;

public class TestaCarro {
    public static void main(String[] args) {
        // Instancia os objetos da classe, os parâmetros representam os valores do usuário que serão atribuídos ao objeto
        Carro obj1 = new Carro("Toyota", "Corolla", "Cinza", 2008, 0f);
        Carro obj2 = new Carro("Ferrari", "Enzo", "Vermelha", 2005, 0f);
        obj1.acelerar(100f);
        System.out.println(obj1.toString());
        obj1.frear(50f);
        System.out.println(obj1.toString());
        obj1.frear(60f);
        System.out.println(obj1.toString());
        obj2.acelerar(80f);
        System.out.println(obj2.toString());
        obj2.frear(60f);
        System.out.println(obj2.toString());

        JOptionPane.showMessageDialog(null, obj1.toString());

    }
}


