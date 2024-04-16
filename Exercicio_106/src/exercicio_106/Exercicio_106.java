package exercicio_106;

import java.util.Scanner;

public class Exercicio_106 {

    public static void main(String[] args) {
        /*Entrar com um nome de uma pessoa e imprimi-lo se começar com as vogais do alfabeto.
        (Considerar letra minúscula e letra maiúscula)*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        char vogal;
        
        //Entrada de dados 
         System.out.println("Informe o seu nome: ");
        nome = teclado.next().toUpperCase();
        vogal = nome.charAt(0);
        
        //Processamento
        if (vogal == 'A' || vogal == 'E' || vogal == 'I' || vogal == 'O' || vogal == 'U')
        {
            System.out.println("O nome começa com vogal");
        } else
        {
                System.out.println("O nome não começa com vogal");
                }
    }
    
}
