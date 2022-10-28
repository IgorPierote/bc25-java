package exercicios.tamagochi;

import java.util.ArrayList;

/*
* 5.1) Crie uma classe Bichinho:
    Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
    Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
    Métodos:
        - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
       - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
       - acordar() => altera o boolean estaDormindo p/ false
* */
public class Bichinho {

    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>(); //Buchin vazio
        this.estaDormindo = false; // Acordado
    }

    public void comer(Comida comida){
        if(this.estaDormindo){
            System.out.println("Zzzzzzzzzz");
        } else{ //está acordado
            if(this.bucho.contains(comida)){
                System.out.println("Já comi "+ comida.getNome() + " quero outra comida!");
            } else{ // a comida é nova
                this.bucho.add(comida);
                this.peso += comida.getPeso();
                System.out.println("Que "+ comida.getNome() + " gostosa!");
            }
        }
    }

    public void dormir(int horas){
        double porcentagemPeso = this.peso * 0.1;
        double quilosPeridos = horas * porcentagemPeso;
        this.peso += quilosPeridos;
    }

    public void acordar(){
        this.estaDormindo = false;
    }

    public static void main(String[] args){
        Bichinho pou = new Bichinho("Happy", 5,40);
        Comida batata = new Comida("Batata", 15.0);
                pou.comer(batata);
                pou.comer(batata);
                pou.comer(batata);

    }
}
