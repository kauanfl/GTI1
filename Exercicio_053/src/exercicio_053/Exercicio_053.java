package exercicio_053;

import java.util.Scanner;

public class Exercicio_053 {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double largura, comprimento, altura, diagonal;
        
        //Entrada de dados
        System.out.println("Informe a largura: ");
        largura = teclado.nextDouble();
        System.out.println("Informe o comprimento: ");
        comprimento = teclado.nextDouble();
        System.out.println("Informe a altura: ");
        altura = teclado.nextDouble();
        
        //Processamento 
        diagonal = Math.sqrt(Math.pow(largura, 2) +
                     Math.pow(comprimento, 2) +
                     Math.pow(altura, 2));
        
        //Saida de dados
        System.out.println("Diagonal: " + diagonal);
    }
    
}
