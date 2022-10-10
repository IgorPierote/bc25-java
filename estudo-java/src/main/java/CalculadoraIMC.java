import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner((System.in));

        System.out.println("Qual Seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual Sua altura(M)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (KG)");
        double peso = entrada.nextDouble();

        // Calcule o IMC = peso / altura ^ 2

        double imc = peso / (altura * altura); //Math.pow(altura, 2)

        System.out.println("Olá, meu nome é " +nome " e tenho " + idade + " anos");
        System.out.println("Este é seu IMC  = " + imc);
        System.out.printf("Este é seu IMC = %.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos! \n", nome, idade);
    }


}
