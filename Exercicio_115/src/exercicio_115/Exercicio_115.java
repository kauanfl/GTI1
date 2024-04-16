package exercicio_115;

import java.util.Scanner;

public class Exercicio_115 {

    public static void main(String[] args) {
         /*Criar um algoritmo que deixe entrar com dois numeros e imprimir o quadrado
        do menor numero e a raiz quadrada do maior numero, se for possivel*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        double maior;
        double menor;
        double quadrado;
        double raiz;
        
        //Entrada de dados 
        System.out.println("informe o primeiro numero: ");
        num1 = teclado.nextDouble();
             System.out.println("informe o segundo numero: ");
        num2 = teclado.nextDouble();
        
        //Processamento 
        menor = Math.min(num1, num2); //Encontrar o menor numero
         maior = Math.max(num1, num2); //Encontrar o maior numero
         quadrado = menor * menor;
         
         if (maior >= 0) {
                  raiz = Math.sqrt(maior);
                  System.out.println("Quadrado do menor numero: " + quadrado);
                    System.out.println("Raiz Quadrado do maior numero: " + raiz);
         }
         else 
         {
             System.out.println("Não é possivel calcular a raiz quadrada do maior numero");
         }
         
         

        
    }
    
}
