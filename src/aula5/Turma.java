package aula5;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public double calcularMedia() {
        double somaNotasAlunos = 0.0;
        for(Aluno aluno: alunos){
            somaNotasAlunos += aluno.calcularMedia();
        }

        return somaNotasAlunos/alunos.size();
    }

}
