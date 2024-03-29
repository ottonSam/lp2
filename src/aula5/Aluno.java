package aula5;

public class Aluno {
    private Prova prova1;
    private Prova prova2;

    public Aluno(){
        prova1 = new Prova();
        prova2 = new Prova();
    }

    public double calcularMedia(){
        return (getProva1().calcularNotaTotal() + getProva2().calcularNotaTotal()) / 2;
    }

    public Prova getProva1() {
        return prova1;
    }

    public void setProva1(Prova prova1) {
        this.prova1 = prova1;
    }

    public Prova getProva2() {
        return prova2;
    }

    public void setProva2(Prova prova2) {
        this.prova2 = prova2;
    }
}
