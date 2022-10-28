package exercicios.biblioteca;

/*
* 4) Crie uma classe Livro que possui:
    Atributos: nome, autor, preco;
    Construtores:
    - Cria livros com base nos parâmetros nome,
    * autor (objeto da classe Autor), preco;
* */

import java.util.ArrayList;

public class Livro {
    private String nome;
    private Autor autor;
    // Composição passar um objeto como parametro de váriavel
    private double preco;

    public Livro(String nome, Autor autor,double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args){
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("HR: A pedra filosofal", jk, 30);
        System.out.println(pedraFilosofal.autor.getEmail());
        System.out.println(pedraFilosofal.autor.getNome());

        Livro camaraSecreta = jk.escreveLivro("HR: A camara secreta",30);
        System.out.println(camaraSecreta.autor.getNome());

        Livro prisoneiroAzk = jk.escreveLivro("Hr:Prisioneiro de Azkaban", 40);
        System.out.println(prisoneiroAzk.autor.getNome());

        ArrayList<Livro> livrosJk = new ArrayList<>();
        livrosJk.add(pedraFilosofal);
        livrosJk.add(prisoneiroAzk);

    }

}
