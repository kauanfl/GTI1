package exercicio_041;

import java.util.Scanner;

public class Exercicio_041 {

    public static void main(String[] args) {
    /*Entrar 4 números e imprimir a média ponderada, sabendo-se que os pesos são
respectivamente 1, 2, 3 e 4.
Exemplo:
Números: 10, 20, 30, 40
Média: 30*/
    
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, num4, media;
        
        //Entrada de dados 
        System.out.print("Informe o primeiro numero: ");
        num1 = teclado.nextDouble();
           System.out.print("Informe o segundo numero: ");
        num2 = teclado.nextDouble();
           System.out.print("Informe o terceiro numero: ");
        num3 = teclado.nextDouble();
           System.out.print("Informe o quarto numero: ");
        num4 = teclado.nextDouble();
       
        //processamento
        media = ((num1*1) + (num2*2) + (num3*3) + (num4*4))/10;
        
        //Saida de dados
        System.out.println("Média ponderada: " + media);
        
        
    }
    
}