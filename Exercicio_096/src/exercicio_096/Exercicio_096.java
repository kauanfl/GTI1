package exercicio_096;

import java.util.Scanner;

public class Exercicio_096 {

    public static void main(String[] args) {
      /*Entrar com um número e informar se ele é divisível por
        3 e por 7(simultaneamente)*/
        
        //Variavel 
        Scanner teclado = new Scanner(System.in);
         int num;
         
        //Entrada de dados 
         System.out.println("Informe o número: ");
         num = teclado.nextInt();
         
         //Processamento
        if (num % 3 == 0 && num % 7 == 0){
               System.out.println("É divisivel por 3 e por 7");
         } else {
               System.out.println("Não é divisivel por 3 e por 7");
         }
    }
    
}
