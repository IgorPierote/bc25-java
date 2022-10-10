public class variaveis {
    public static void main(String[] args) {
        System.out.println("Hello World"); //Equivale ao console.log do JS


        // Variáveis no JAVA
        // Fortemente e estaticamente tipado

        int idade = 20; //inteiro
        double salario = 4656.95; // Números quabrados, double significa dupla precisão
        float nota = 7.5f; // sufixo para float
        long populacaoterra = 7_900_000_000l; //sufixo para long
        boolean tarefaconcluida = false; // (true ou false)
        int i = 1, j = 0, k = 1000; //multiplas variáveis
        String nomeCompleto = "Igor Pierote"; // sempre aspas duplas

        int teste = 10;
        teste = 9; // Reatribuição de variáveis

        final int teste2 = 200; //impossível mudar o valor
        //teste2 = 1000;

        int a =10;
        int b = 5;
        int soma = a + b;
        int subtracao = a-b;
        int multiplicacao = a / b;
        int divisao = a / b;

        System.out.println("O resultado soma é " + soma);

        int set= 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = set/dois;
        System.out.println(resultado);
        double resultado2 = set / dois2;
        System.out.println(resultado2);

        //math
        double x = Math.sqrt(144); //12
        double y = Math.pow(5, 2); //25

        System.out.print(Math.PI);

        //casting

        int pi2 = (int) Math.PI;



    }
}
