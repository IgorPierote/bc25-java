import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
      /*  int[] numeros = {1,2,3,4,5};
        System.out.println(numeros.length); //tamanho do array

        for(int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; // 0..49
        numeros2[0] =678;
        numeros[49] = -220;

        double[] notas= new double[5];
        String[] nomes = {"José", "Igor"};

        System.out.println("Digite um número: ");
    */
        /*
        boolean[] valores = new boolean[quantidade];*/


        //Exemplo
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for(int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota " + i);
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota: notasProva){
            soma += nota;
        }

        double media = soma / notasProva.length;

        //condição ternária

        String mensagem = (media < 7 )? "Você está reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        //Wrapper classes

        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean test2 = false;

    }
}
