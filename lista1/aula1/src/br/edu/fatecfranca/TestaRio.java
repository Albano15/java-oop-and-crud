package br.edu.fatecfranca;

import br.edu.fatecfranca.teste.Rio;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Efíge", 10501.36f, false);
        Rio rio2 = new Rio("Ghangis", 20201.80f, true);

        rio1.chover(10.3f);
        rio1.sujar();
        rio1.ensolarar(20.56f);
        rio1.mostra();
        System.out.println("---------------------------------------------------------------<br>");
        rio2.chover(5.0f);
        rio2.ensolarar(13.5f);
        rio2.limpar();
        rio2.mostra();

    }
}
