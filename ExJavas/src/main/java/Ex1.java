import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner((System.in));

        System.out.println("Insira a primeira váriavel");
        double v1 = entrada.nextInt();

        System.out.println("Insira a segunda váriavel");
        double v2 = entrada.nextInt();

        System.out.println("Digite a operação que deseja executar");
        int opcao = entrada.nextInt();

        switch(opcao){
            case 1:
                double soma = v1 + v2;
                System.out.println("O resultado da soma é: " + soma);
            break;
            case 2:
                double sub = v1 - v2;
                System.out.println("O resultado da subtração é: " + sub);
            break;
            case 3:
                double mult = v1 * v2;
                System.out.println("O resultado da multiplicação é: " + mult);
            break;
            case 4:
                double div = v1 / v2;
                System.out.println("O resultado da divisão é: " + div);
            break;
            default:
                System.out.println("Esta opção não existe");
        }
    }
}
/*
*  System.out.println("Selecione uma dieta (1 a 3)");
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
* */