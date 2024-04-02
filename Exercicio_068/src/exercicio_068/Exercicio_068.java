package exercicio_068;

import java.util.Scanner;

public class Exercicio_068 {

    public static void main(String[] args) {
        /*Ler dois valores para variáveis A e B, efetuar a troca dos valores de forma que a 
         variável A possa ter o valor da variável B e que a variável B possa ter o valor da
        variável A. Apresentar os valores trocados. Utilizar o recurso de troca de conteúdo.*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double a, b, aux;
        
        //Entrada de dados
        System.out.println("Informe o A: ");
        a = teclado.nextDouble();
        System.out.println("Informe o B: ");
        b = teclado.nextDouble();
        
               //Processamento
                 aux = a;
                 a = b;
                 b = aux;
               
                //Saida de dados
         System.out.println("A = " + a);
          System.out.println("B = " + b);
    }
    
}
