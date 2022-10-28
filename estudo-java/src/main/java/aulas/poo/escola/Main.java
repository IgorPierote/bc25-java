package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        Aluno aluno =  new Aluno("Justo Belomonte", "Justo@gmail.com", "050565060", 10.0);
        aluno.seApresentar();

        Professor prof = new Professor("Renatows", "Renatows@gmail.com", "124124532", "T.I");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria", "Maria@gmail.com", "4325325");
        p1.seApresentar();

        //Aluno é uma Pessoa
        Pessoa p2 = new Aluno("janjao", "janjao@gmail.com", "1215512", 6.0);
        // Professor é uma Pessoa
        Pessoa p3 = new Professor("Almiro", "Almiro@gmail.com", "12345135", "Ciência Da Computação");
        System.out.println("============================");
        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo

        System.out.println("=== PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas){
            //O método seApresentar se comporta diferente dependendo da classe
            pessoa.seApresentar();
        }



    }
}
