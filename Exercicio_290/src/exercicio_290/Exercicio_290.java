package exercicio_290;

import java.util.Scanner;

public class Exercicio_290 {

    public static void main(String[] args) {
         /*Criar um algoritmo que entre varios numeros inteiros e positivos
        e imprimir o produto dos numeros impares digitados e a soma dos pares*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int produto;
        int soma;
        int num;
        
        //Objetivo
        System.out.println("Imprimir o produto dos numeros impares"
        + " digitados e a soma dos pares");
           System.out.println("--------------------------------------------");
              System.out.println(" ");
        
        //Entrada de dados
        produto = 1;
        soma = 0;
          System.out.println("Entre com numeros maiores que 0 ");
         System.out.print("ou entrar com 0 para encerrar: ");
        num = teclado.nextInt();
        System.out.println(" ");
        //Processamento
        while(num > 0){
            if(num % 2 == 0 ) {
                soma = soma + num;
        } else {
                produto = produto * num;
                }
               //Entrada de dados
      
          System.out.println("Entre com numeros maiores que 0 ");
         System.out.print("ou entrar com 0 para encerrar: ");
        num = teclado.nextInt();
        System.out.println(" ");
        }
       System.out.println("Produto dos numeros impares: " + produto);    
       System.out.println("Soma dos numeros pares: " + soma); 
    }
    
}
