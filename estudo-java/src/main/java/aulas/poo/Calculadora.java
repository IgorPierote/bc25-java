package aulas.poo;

import java.awt.*;

public class Calculadora {

    //final = impeede a alteração do valor da variavel
    public static final double PI=3.14;

    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a-b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }
    public static double divisao(double a, double b){
        return a/b;
    }

    public static void main(String[] args){
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(5, 3);
        double resultadoMult = Calculadora.multiplicacao(10,2);
        double resultadoDiv = Calculadora.divisao(20,2);
    }
}
