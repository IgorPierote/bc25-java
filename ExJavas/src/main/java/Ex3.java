import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double[] v1 = new double[5];
        double[] v2 = new double[5];

        int cont = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Insira um número para ocupar a posição " + i + " do v1");
            v1[i] = entrada.nextDouble();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Insira um número para ocupar a posição " + i + " do v2");
            v2[i] = entrada.nextDouble();
        }

        for(int i = 0; i < 5; i++){

            if(v1[i] == v2[i]){
                cont++;
            }
        }
        System.out.println("Existem " + cont + " váriaveis repetidas nas mesmas posições");

    }
}

/*



        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for(int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota " + i);
            notasProva[i] = entrada.nextDouble();
        }
* */