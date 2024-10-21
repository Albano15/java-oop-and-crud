package br.edu.fatecfranca.teste;

public class Carro {

    // Declara os atributos
    public String marca, modelo, cor;
    public int ano;
    public float vel_atual;

    public Carro(){
        this.marca = "";
        this.modelo = "";
    }

    // Construtor da classe
    public Carro(String marca, String modelo, String cor, int ano, float vel_atual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.vel_atual = vel_atual;
    }

    // Método para acelerar
    public void acelerar(float vel) {
        this.vel_atual += vel;
    }

    // Método para frear
    public void frear(float vel) {
        if ((this.vel_atual - vel) >= 0){
          this.vel_atual -= vel;
        } else {
            System.out.println("Velocidade não pode ser negativa");
        }
    }

    //Converte um obj para string

    public String toString(){
        return "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Cor: " + this.cor + ", Ano: " + this.ano + ", Velocidade: " + this.vel_atual;
    }
}
