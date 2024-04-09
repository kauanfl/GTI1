package exercicio_101;

import java.util.Scanner;

public class Exercicio_101 {

    public static void main(String[] args) {
         /*Construir um algoritmo que indique se o numero digitado
        esta compreendido entre 20 e 90 ou não*/
        
        //Variavel 
        Scanner teclado = new Scanner(System.in);
         int num;
         
         //Entrada de dados 
         System.out.println("Informe o número: ");
         num = teclado.nextInt();
         
         //Processamento
        if (num >= 20 && num <= 90){
               System.out.println("O número digitado está compreendido entre 20 e 90");
         } else {
               System.out.println("O número digitado não está compreendido entre 20 e 90");
         }
    }
    
}
