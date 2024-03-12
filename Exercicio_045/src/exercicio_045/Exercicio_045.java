package exercicio_045;

import java.util.Scanner;

public class Exercicio_045 {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double num;
        double quadrado;
        double raiz;
        
        //Entrada de dados 
        System.out.println("informe o numero: ");
        num = teclado.nextDouble();
        
       //processamento
       quadrado = Math.pow(num, 2);
               raiz  = Math.sqrt(num);
       
       //Saida de dados
      System.out.println("numero: " + num);
          System.out.println("Quadrado: " + quadrado);
              System.out.println("Raiz quadrada: " + raiz);
    }
    
}
