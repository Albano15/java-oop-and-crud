import br.edu.fatecfranca.exe0.Assistente;
import br.edu.fatecfranca.exe0.Diretor;
import br.edu.fatecfranca.exe0.Funcionario;
import br.edu.fatecfranca.exe0.Gerente;

import java.util.ArrayList;

public class TestaFuncionario {
    public static void calculaFolha(ArrayList<Funcionario> funcionarios) {
        float total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calculaSalario();
        }
        System.out.println("O total é: " + total);
    }

    public static void mostra(Funcionario func){
        System.out.println(func);
    }

    public static void main(String[] args){

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Gerente 1");
        gerente1.setCpf("123225454");
        gerente1.setSalario(1250f);
        gerente1.setBonus(150f);
        mostra(gerente1);

        Diretor diretor1 = new Diretor("Paulo", "45644565", 3000, 1000);
        mostra(diretor1);

        Assistente assistente1 = new Assistente("Pedro", "354453-564", 1052.7f, 4);
        mostra(assistente1);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(assistente1);
        lista.add(gerente1);
        lista.add(diretor1);

        calculaFolha(lista);


    }
}