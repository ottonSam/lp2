package aula2;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculaIMCView {
    public static void main(String[] args) {
    
        Pessoa pessoa = new Pessoa();
        
        System.out.print("Digite o Peso: ");
        Scanner input01 = new Scanner(in);
        double inputPeso = input01.nextDouble();
        pessoa.setPeso(inputPeso);
        
        System.out.print("Digite a Altura: ");
        Scanner input02 = new Scanner(in);
        double inputAltura = input02.nextDouble();
        pessoa.setAltura(inputAltura);
        
        double imc = pessoa.calcularIMC();
        System.out.println("Peso => " + String.format("%.2f", pessoa.getPeso()));
        System.out.println("Altura => " + String.format("%.2f", pessoa.getAltura()));
        System.out.println("IMC => " + String.format("%.2f", imc));
        pessoa.informarIMC(imc);
    }
}