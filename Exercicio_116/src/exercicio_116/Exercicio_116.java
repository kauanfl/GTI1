package exercicio_116;

import java.util.Scanner;

public class Exercicio_116 {

    
    public static void main(String[] args) {
        // Entrar com três numeros e imprimir o maior numero
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
       
        
        //Entrada de dados
        System.out.println("Informe o primeiro numero: ");
        num1 = teclado.nextInt();
          System.out.println("Informe o segundo numero: ");
        num2 = teclado.nextInt();
          System.out.println("Informe o terceiro numero: ");
        num3 = teclado.nextInt();
        
        //processamento 
        if (num1 > num2 && num1 > num3) 
        {
          System.out.println("Maior número é o primeiro: " + num1);
        } else if (num2 > num3){
          System.out.println("Maior número é o segundo: " + num2);
        } else {
                    System.out.println("Maior número é o terceiro: " + num3);
        }
        
    }
    
}
