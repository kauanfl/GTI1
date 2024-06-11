package exercicio_tarefa4;

import java.util.Scanner;

public class Exercicio_Tarefa4 {

    public static void main(String[] args) {
        /*Criar um algoritmo que entre vários números inteiros e positivos e 
        imprimir e soma dos quadrados. Encerra quando o número é ZERO*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int contador;
        int num;
        double quadrado;
        double soma;
        
         //Objetivo do programa
        System.out.println("Soma dos quadrados");
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
        quadrado = Math.pow(num, 2);
         soma = soma + quadrado;
        contador ++;
        
               //Entrada de dados 
         System.out.println("Entre com numeros maiores que 0 ");
         System.out.print(" ou entrar com 0 para encerrar: ");
        num = teclado.nextInt();
        }
        
 
        //Saida de dados
        if(contador > 0){
       
           System.out.print("Soma dos quadrados: " + soma);
        }    
    }
    
}
