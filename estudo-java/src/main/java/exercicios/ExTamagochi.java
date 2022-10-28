package exercicios;

import java.util.ArrayList;

public class ExTamagochi {

    private String nome; // acessível apenas dentro da classe

    private int idade;

    private double peso;

    private boolean dormindo = false;

    ArrayList<ExTamagochi> Bucho= new ArrayList<>();


    ExTamagochi(String nome, int idade, double peso, boolean dormindo ){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dormindo = dormindo;
    }

    public void mimir(){

        if(this.dormindo == false){
            this.dormindo = true;
            System.out.println(this.nome + " Está dormindo agora, faça silêncio!");
        } else if (this.dormindo == true) {
            this.dormindo = false;
            System.out.println(this.nome + " Está dormindo agora, faça silencio!");

        }
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }
}
