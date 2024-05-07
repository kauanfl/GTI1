package exercicio_190;

import java.util.Scanner;

public class Exercicio_190 {

    public static void main(String[] args) {
        /*Entrar com um nome, idade e sexo de 20; imprimir o nome se a pessoa
        for do sexo feminino e tiver mais de 21 anos*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        int  idade;
        char sexo;
        int i;
        int tam = 4;
        
        //Laço de repetição
          for (i = 1; i <= tam; i++) {
          
        //Entrada de dados
         System.out.println("-----------------------------------------------");
        System.out.println("Informe o nome ["+i+"]: ");
        nome = teclado.next();
        System.out.println("Informe a idade: ");
        idade = teclado.nextInt();
        System.out.println("Informe o sexo (M/F): ");
        sexo = teclado.next().toUpperCase().charAt(0);
       
       //Processamento
           if ((sexo == 'F') && (idade > 21) ) {
              System.out.println("Nome: " + nome);
              System.out.println("Idade: " + idade);
              System.out.println("Sexo: " + sexo);
           } else {
              System.out.println(" Não se aplica");
           }
          }
    }   
    
}
