package exercicio_109;

import java.util.Scanner;

public class Exercicio_109 {

    public static void main(String[] args) {
        /*Entrar com dois nome de pessoa e imprimi-lo em ordem alfabética.
         (Considerar letra minúscula e letra maiúscula)*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
         String nome1;
         String nome2;
         
         //Entrada de dados 
         System.out.println("Informe o primeiro nome: ");
        nome1 = teclado.next().toUpperCase();
         System.out.println("Informe o segundo nome: ");
        nome2 = teclado.next().toUpperCase();
        
        //Processamento 
        if (nome1.compareTo(nome2) > 0)
        {
           System.out.println("Nomes em ordem alfabetica: " + nome2 + ", " + nome1); 
        }
        else if(nome1.compareTo(nome2) < 0)
                {
                System.out.println("Nomes em ordem alfabetica: " + nome1 + ", " + nome2);
                }
        else 
        {
                 System.out.println(" OS nomes iguais ");
        }
    }
    
}
