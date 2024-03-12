package aula5;

public class Prova {
    private double notaParte1;
    private double notaParte2;

    public Prova() {
        notaParte1 = 0.0;
        notaParte2 = 0.0;
    }

    public double getNotaParte1() {
        return notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        this.notaParte1 = notaParte1;
    }

    public double getNotaParte2() {
        return notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal() {
        if (notaParte1 + notaParte2 > 10.0) {
            return 10.0;
        } else {
            return notaParte1 + notaParte2;
        }
    }
}
