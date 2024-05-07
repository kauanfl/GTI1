package exercicio_194;

import java.util.Scanner;

public class Exercicio_194 {

    public static void main(String[] args) {
        /*Criar um algoritmo que leia um numero e imprima todos os numeros de 1
        até o numero lido e o seu produto. 
        Exemplo: número: 3 | Saida 1 2 3 | 6*/
        
        //Variaveis 
        Scanner teclado = new Scanner(System.in);
        int num;
        int i;
        int produto = 1 ;
        //Entrada de dados
        System.out.print("Informe um numero maior que 1: ");
        num = teclado.nextInt();
        
        //Laço de repetição
        for (i = 1; i <= num; i++) {
            produto *= i;
            System.out.print(i + " ");
         
           
        }
          System.out.println(" ");
         System.out.println("Produto: " + produto);
    }
    
}
