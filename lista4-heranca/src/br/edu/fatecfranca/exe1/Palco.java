package br.edu.fatecfranca.exe1;

public class Palco {
    private Ator ator1 = new AtorFeliz();

    public void altera(){
        if (ator1 instanceof AtorFeliz){
            ator1 = new AtorTriste();
        } else {
            ator1 = new AtorFeliz();
        }
    }

    public void atua(){
        this.ator1.ato();
    }
}
