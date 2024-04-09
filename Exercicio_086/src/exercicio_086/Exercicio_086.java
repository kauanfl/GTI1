package exercicio_086;

import java.util.Scanner;

public class Exercicio_086 {

    
    public static void main(String[] args) {
        // Imprimir se um numero é positivo, negativo ou zero
        
        //Variavel 
          Scanner teclado = new Scanner(System.in);
         int num;
         
        //Entrada de dados 
         System.out.println("Informe o número: ");
         num = teclado.nextInt();
         
        //Processamento
         if (num > 0) {
               System.out.print("É positivo ");
         } else if (num < 0){
               System.out.print("É negativo ");
         } else {
               System.out.print("É igual a 0 ");
         }
    }
    
}
