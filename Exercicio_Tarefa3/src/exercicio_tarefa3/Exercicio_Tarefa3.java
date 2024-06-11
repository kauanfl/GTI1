package exercicio_tarefa3;

import java.util.Scanner;

public class Exercicio_Tarefa3 {

    public static void main(String[] args) {
        /*Criar um algoritmo que entre vários números inteiros e positivos e imprimir 
        a média dos números mútiplos de 3 e também múltiplos de 7. Encerra quando o número é ZERO*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int contador;
        double soma;
        int num;
        double media;
        
        //Objetivo do programa
        System.out.println("Media dos numeros multiplos de 3 e multiplos de 7");
        System.out.println("-----------------------------------------------");
         System.out.print(" ");
         
        //Entrada de dados
         contador = 0;
         soma = 0;
        System.out.println("Entre com numeros maiores que 0 ");
         System.out.print(" ou entrar com 0 para encerrar: ");
        num = teclado.nextInt();
    
        //Processamento
        while(num > 0) {
             if(num % 3 == 0 || num % 7 == 0  ) {
             soma = soma + num;
             contador ++;
             }
             
        //Entrada de dados 
         System.out.println("Entre com numeros maiores que 0 ");
         System.out.print(" ou entrar com 0 para encerrar: ");
        num = teclado.nextInt();
        }
        
        //Saida de dados
        if(contador > 0){
           media = soma / contador;
           System.out.println("Media: " + media);
        }
    

    }
    
}
