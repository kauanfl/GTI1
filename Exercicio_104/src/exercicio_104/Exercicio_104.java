package exercicio_104;

import java.util.Scanner;

public class Exercicio_104 {

    public static void main(String[] args) {
        /* Entrar com nome, sexo e idade de uma pessoa.
        Se a pessoa for do sexo feminino e tiver menos de 25 anos,
        imprimir o nome e a mensagem : ACEITA. Caso contrario, imprimir
        o nome e a mensagem: NAO ACEITA.*/
        
        //Variavel 
        Scanner teclado = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;
        
         //Entrada de dados 
        System.out.println("Informe o seu nome: ");
         nome = teclado.next();
              System.out.println("Informe o seu sexo (M/F): ");
         sexo = teclado.next().toUpperCase();
               System.out.println("Informe a sua idade: ");
         idade = teclado.nextInt();
         
         //Verificação
         if (sexo.equals("F") && idade <= 25){
             System.out.println(nome + " ACEITA ");
         } else {
               System.out.println(nome + " NÃO ACEITA ");
         }
                
    }
    
}
