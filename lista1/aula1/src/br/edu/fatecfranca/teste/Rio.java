package br.edu.fatecfranca.teste;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {

    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float valor) {
        float nivelAntigo = this.nivel;
        this.nivel += valor;
        System.out.println("O nível do Rio " + this.nome + " era " + nivelAntigo + "mm e após a chuva foi para " + this.nivel + "mm.");
    }


    public void ensolarar(float valor) {
        float nivelAntigo = this.nivel;
        this.nivel -= valor;
        System.out.println("O nível do Rio " + this.nome + " era " + nivelAntigo + "mm e após a seca foi para " + this.nivel + "mm.");
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostra(){
        String poluicao = "Limpo";
        if (this.poluido){
            poluicao = "Poluído";
        }
        System.out.println("O Rio: " + this.nome + " está com o nível de: " + this.nivel + " mm e está: " + poluicao);
    }

}
