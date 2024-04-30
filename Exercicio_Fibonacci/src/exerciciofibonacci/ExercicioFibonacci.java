package exerciciofibonacci;

import java.util.Scanner;

public class ExercicioFibonacci {

    public static void main(String[] args) {
        /*A sequência de Fibonacci é uma sequência numérica em que cada termo
        a partir do terceiro é a soma dos dois antecessores. O primeiro termo 
        da sequência de Fibonacci é o número 1 e o segundo termo 
        também é o número 1. O terceiro termo é 2, pois 1+1=2.
        Já o quarto termo é 3, pois 1+2=3.*/

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int fim,
                i;
        int num1 = 1,
                    num2 = 0,
                            aux;

        //Entrada de dados
        System.out.println("Informe o fim do loop da sequência: ");
        fim = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("Sequência de Fibonacci: ");

        //Processamento
        for (i = 1; i <= fim; i++) {

            System.out.print(num1 + " ");
            
            aux  = num1;
            num1 = num1 + num2;
            num2 = aux;

        }

    }

}
 