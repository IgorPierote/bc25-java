import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o total de valores: ");
        int totalV = entrada.nextInt();

        double[] valores = new double[totalV];

        for(int i = 0; i < totalV; i++){
            System.out.println("Digite o valor a ocupar a " + i + " posição");
            valores[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota: valores){
            soma += nota;
        }

        double media = soma / valores.length;

        System.out.println("A soma total dos valores é de: " + soma);
        System.out.println("A média total dos valores é de: " + media);

    }
}
