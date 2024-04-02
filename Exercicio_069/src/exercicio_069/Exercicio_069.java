package exercicio_069;

import java.util.Scanner;

public class Exercicio_069 {

    public static void main(String[] args) {
        /* Criar  um algoritmo que leia o numerador e o denominador de uma fração 
        e transforma-lo em número decimal
        */
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double numerador, denominador, decimal;
        
        //Entrada de dados
        System.out.println("Informe o numerador: ");
        numerador = teclado.nextDouble();
        System.out.println("Informe o denominador: ");
        denominador = teclado.nextDouble();
        
        //Processamento
        decimal = numerador / denominador;
        
         //Saida de dados
         System.out.println("O número decimal da fração " + numerador + 
                 " sobre " + denominador + " é igual a : " + decimal);
        
        
    }
    
}
