package exercicio_082;

import java.util.Scanner;
public class Exercicio_082 {

    public static void main(String[] args) {
               /*Ler um numero inteiro e informar se ele e menor que 20 */
        //Variaveis
         Scanner teclado = new Scanner(System.in);
         int num;
         
         //Entrada de dados 
         System.out.print("Informe o número: ");
         num = teclado.nextInt();
         
         //Processamento
         if (num < 20) {
               System.out.print("È menor que 20! ");
         } else {
               System.out.print("Não é menor que 20! ");
         }
    }
    
}
