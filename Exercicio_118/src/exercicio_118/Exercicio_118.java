package exercicio_118;

import java.util.Scanner;

public class Exercicio_118 {

    public static void main(String[] args) {
        // Entrar com três numeros e imprimi-los em ordem crescente 
        
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
       
        //Processamento
        if (num1 <= num2 && num1 <= num3 )
        {
            if (num2 <= num3) {
               System.out.println("Numeros em ordem");
               System.out.println(num1);
               System.out.println(num2);
               System.out.println(num3);
            }
            else {
            System.out.println("Numeros em ordem");
             System.out.println(num1);
             System.out.println(num3);
             System.out.println(num2);
            } 
        }else if (num2 <= num1 && num2 <= num3)
        {
            if (num1 <= num3) {
               System.out.println("Numeros em ordem");
               System.out.println(num2);
               System.out.println(num1);
               System.out.println(num3);
            } else {
            System.out.println("Numeros em ordem");
             System.out.println(num2);
             System.out.println(num3);
             System.out.println(num1);
            } 
        } else {
        if (num1 <= num2) { 
                System.out.println("Numeros em ordem");
             System.out.println(num3);
             System.out.println(num1);
             System.out.println(num2);
            } else {
            System.out.println("Numeros em ordem");
             System.out.println(num3);
             System.out.println(num2);
             System.out.println(num1);
        }

        }
    }
}    

