package exercicio_1160;

import java.util.Scanner;

public class Exercicio_1160 {

    public static void main(String[] args) {
        /*Entrar com tres numeros e imprimir o menor numero
        (suponha numeros diferentes)*/

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int num1,
                num2,
                num3;

        //Entrada de dados
        System.out.print("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        num3 = teclado.nextInt();
        System.out.println("-----------------------------------------------");

        //Processamento
        if (num1 < num2 && num1 < num3) {
            System.out.println("Entre numero 1: " + num1);
            System.out.println("Entre numero 2: " + num2);
            System.out.println("Entre numero 3: " + num3);
            System.out.println(" ");
            System.out.println("Menor numero: " + num1);
        } else if (num2 < num3) {
            System.out.println("Entre numero 1: " + num1);
            System.out.println("Entre numero 2: " + num2);
            System.out.println("Entre numero 3: " + num3);
            System.out.println(" ");
            System.out.println("Menor numero: " + num2);
        } else {
            System.out.println("Entre numero 1: " + num1);
            System.out.println("Entre numero 2: " + num2);
            System.out.println("Entre numero 3: " + num3);
            System.out.println(" ");
            System.out.println("Menor numero: " + num3);
        }
    }

}
