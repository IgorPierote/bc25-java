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

        System.out.println("Olá, meu nome é " +nome+ " e tenho " + idade + " anos");
        System.out.println("Este é seu IMC  = " + imc);
        System.out.printf("Este é seu IMC = %.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos! \n", nome, idade);

        if(imc <17){
            System.out.println("Muito abaixo do peso");
        } else if (imc >=17 && imc <= 18.49) {
            System.out.print("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.print("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.print("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.print("Obesidade II (Severa)");
        } else{
            System.out.println("Obesidade III (mórbida)");
        }

        // Switch-case

        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println(" 3 - Batata");
        int dieta = entrada.nextInt();

        switch(dieta){
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break; // impedir testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata");
                break;
            default:
                System.out.println("Esta dieta não existe");
        }

        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        int i = 0;
        while(i <= totalAlimentos ){
            String alimento = entrada.nextLine();
            i++;
        }
        System.out.println(i);
    }
}
