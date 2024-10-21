import br.edu.fatecfranca.exe2.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setP1(6.7f);
        aluno.setP2(7.8f);
        aluno.NotaFinal();
        aluno.setNumeroAluno(123456);
        System.out.println(aluno.dadosAluno() + " a nota final do aluno é: " + aluno.NotaFinal());
        
    }
}
