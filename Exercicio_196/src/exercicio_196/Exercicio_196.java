package exercicio_196;

import java.util.Scanner;

public class Exercicio_196 {

    public static void main(String[] args) {
        /*Criar um algoritmo que leia um numero(num) e imprima a soma dos
        numeros(num) e imprima todos os numeros de 1 até o numero lido
        e seu produto. Exemplo: 
        Limite superior: 15 | Saida: 15 | (5 10)-multiplos de 5*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int num;
        int produto = 0 ;
        int i; 
        
      //Entrada de dados 
        System.out.println("Informe um Limite Superior maior que 0: ");
        num = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        
        //Processamento
        for (i = 0; i < num; i ++) {
            if (i % 5 == 0) {
               System.out.print(i + " ");
               produto += i;
            }
          
        }
          System.out.println(" ");
         System.out.println( produto);
    }
    
}
