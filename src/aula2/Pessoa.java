package aula2;

public class Pessoa {
    //Atributos
    private double peso;
    private double altura;

    public Pessoa () {
        peso = 0.0;
        altura = 0.0;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return (this.peso / (this.altura * this.altura));
    }
    
    public String informarIMC(double imc) {
        if (imc < 18.5) {
            return "Pessoa a baixo do peso";
        } else {
            if (imc < 25.0) {
                return "Pessoa com peso normal";
            } else {
                if (imc < 30.0){
                    return "Pessoa com pre obesidade";
                } else {
                    if (imc < 35.0){
                        return "Pessoa com obesidade grau I";
                    } else {
                        if (imc < 40){
                            return "Pessoa com obesidade grau II";
                        } else {
                            return "Pessoa com obesidade grau III";
                        }
                    }
                }
            }
        }
    }
}