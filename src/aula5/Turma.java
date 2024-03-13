package aula5;

import java.util.ArrayList;

public class Turma {
    private final ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public double calcularMedia() {
        double somaNotasAlunos;
        somaNotasAlunos = alunos.stream().mapToDouble(Aluno::calcularMedia).sum();

        return somaNotasAlunos/alunos.size();
    }

}
