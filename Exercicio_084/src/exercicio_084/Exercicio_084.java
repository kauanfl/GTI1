package exercicio_084;

import java.util.Scanner;

public class Exercicio_084 {

    public static void main(String[] args) {
        /*Ler um numero e imprimir se ele e par ou impar*/
        //Variaveis 
         Scanner teclado = new Scanner(System.in);
         int num;
         
          //Entrada de dados 
         System.out.println("Informe o número: ");
         num = teclado.nextInt();
         //Processamento
         if (num % 2 == 0) {
               System.out.print("È par ");
         } else {
               System.out.print("È impar ");
         }
    }
    
}
