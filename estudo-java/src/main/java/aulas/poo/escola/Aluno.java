package aulas.poo.escola;

public class Aluno extends Pessoa{

    private double media;

    // Chamada do super deve vir em primeiro
    public Aluno(String nome, String email, String cpf, double media){
        super(nome, email, cpf); // Estou chamando o construtor Pessoa
        this.media = media;
    }

    @Override
    public void seApresentar(){ // Na sobrescrita mudamos o comportamento (Apenas)
        super.seApresentar(); // super = Pessoa
        System.out.println("Eu sou um aluno com média = " + this.media);
    }

    public double getMedia(){
        return this.media;
    }

}

