package exercicio_186;

import java.util.Scanner;

public class Exercicio_186 {

    public static void main(String[] args) {
        /*Entrar com 3 numeros e imprimir o cubo e a raiz cubica de cada numero
        (formatar com 3 casas )*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double num1,
                   num2,
                       num3;
        double cubo1,
                    cubo2,
                         cubo3;
        double raiz1,
                    raiz2, 
                         raiz3;
        
        //Entrada de dados
        System.out.println("Informe o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Informe o terceiro numero: ");
        num3 = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        
        //Processamento 
        cubo1 = Math.pow(num1, 3);
        cubo2 = Math.pow(num2, 3);
        cubo3 = Math.pow(num3, 3);
        
        raiz1 = Math.cbrt(num1);
        raiz2 = Math.cbrt(num2);
        raiz3 = Math.cbrt(num3);
        
        //Saida de dados
        System.out.print("O cubo de " + num1 + " é: " + cubo1);
        System.out.println(" e a raiz cubica é: "     + raiz1);
        
        System.out.println("-----------------------------------------------");
        
        System.out.print("O cubo de " + num2 + " é: " + cubo2);
        System.out.println(" e a raiz cubica é: "     + raiz2);
        
        System.out.println("-----------------------------------------------");
        
        System.out.print("O cubo de " + num3 + " é: " + cubo3);
        System.out.println(" e a raiz cubica é: "     + raiz3);
        
    }

        
    
    
}
