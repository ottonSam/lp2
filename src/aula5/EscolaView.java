package aula5;

public class EscolaView {
    public static void main(String[] args) {
        // Definindo variaveis
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        Prova prova1 = new Prova();
        Prova prova2 = new Prova();
        Prova prova3 = new Prova();
        Prova prova4 = new Prova();
        Prova prova5 = new Prova();
        Prova prova6 = new Prova();

        // Passando valores para as provas
        prova1.setNotaParte1(3.0);
        prova1.setNotaParte2(3.5);

        prova2.setNotaParte1(4.0);
        prova2.setNotaParte2(4.0);

        prova3.setNotaParte1(4.0);
        prova3.setNotaParte2(5.5);

        prova4.setNotaParte1(0.0);
        prova4.setNotaParte2(3.0);

        prova5.setNotaParte1(2.0);
        prova5.setNotaParte2(5.5);

        prova6.setNotaParte1(4.0);
        prova6.setNotaParte2(5.0);

        // Instanciando as provas aos alunos
        aluno1.setProva1(prova1);
        aluno1.setProva2(prova2);

        aluno2.setProva1(prova3);
        aluno2.setProva2(prova4);

        aluno3.setProva1(prova5);
        aluno3.setProva2(prova6);

        // Instanciando os alunos a turma
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);

        // Exibindo informações
        System.out.println("Media aluno1 => " + String.format("%.2f", aluno1.calcularMedia()));
        System.out.println("Media aluno2 => " + String.format("%.2f", aluno2.calcularMedia()));
        System.out.println("Media aluno3 => " + String.format("%.2f", aluno3.calcularMedia()));

        System.out.println("Media turma => " + String.format("%.2f", turma.calcularMedia()));

    }
}
