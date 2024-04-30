package exercicio_184;

import java.util.Scanner;

public class Exercicio_184 {

    public static void main(String[] args) {
       //Entrar com 5 numeros e para cada numero imprimir logaritmo na base 10
        
        //Variaveis 
        Scanner teclado = new Scanner(System.in);
        int num1,
                num2,
                    num3, 
                        num4,  
                            num5;
        
        //Entrada de dados
       System.out.println("Informe o primeiro numero: ");
       num1 = teclado.nextInt();
   
       System.out.println("Informe o segundo numero: ");
       num2 = teclado.nextInt();
   
       System.out.println("Informe o terceiro numero: ");
       num3 = teclado.nextInt();
       
       System.out.println("Informe o quarto numero: ");
       num4 = teclado.nextInt();
       
       System.out.println("Informe o quinto numero: ");
       num5 = teclado.nextInt();
      
      System.out.println("------------------------------------------------");
      
      //Processamento e saida
      System.out.println("Numero 1: " + Math.log10(num1));
      System.out.println("Numero 2: " + Math.log10(num2));
      System.out.println("Numero 3: " + Math.log10(num3));
      System.out.println("Numero 4: " + Math.log10(num4));
      System.out.println("Numero 5: " + Math.log10(num5));
      
    }
    
}
