package exercicio_198;

import java.util.Scanner; 

public class Exercicio_198 {

    public static void main(String[] args) {
        /*Criar um algoritmo que leia os limites inferior e superior de um 
        intervalo e imprima todos os numeros naturais no intervalo fechado.
        Supoha que os dados digitados sao para um intervalo crescente.
        Exemplo: 
        Limite  inferio: 5 | Limite superior: 13 | Saida: 6 7 8 9 10 11 12*/
        
        //Variaveis
         Scanner teclado = new Scanner(System.in);
        int limInf, limSup;
        
        //Entrada de dados
        System.out.print("Informe o limite inferior: ");
        limInf = teclado.nextInt();
        System.out.print("Informe o limite superior: ");
        limSup = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("Numeros naturais: ");
        
        //Processamento e saida de dados
        for (int i = limInf; i <= limSup; i++) {
            if (i >= 0) {
              System.out.print(i + " ");
            }  
            
        }
        
    }
    
}
