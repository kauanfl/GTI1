package exercicio_107;

import java.util.Scanner;

public class Exercicio_107 {
    public static void main(String[] args) {
        /*Entrar com um nome de uma pessoa e imprimi-lo se for igual a "AMANDA" ou "DORIVAL".
         (Considerar letra minúscula e letra maiúscula)*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        //Entrada de dados 
         System.out.println("Informe o seu nome: ");
        nome = teclado.next().toUpperCase();
        
        //Processamento
        if (nome.compareTo("AMANDA")== 0)
        {
        System.out.println(" Nome aceito AMANDA");
        } 
        else if (nome.compareTo("DORIVAL")== 0)
        {
        System.out.println(" Nome aceito DORIVAL");
        }
        else
        {
             System.out.println("Nome diferente " + nome);
        }
        
    }
    
}
