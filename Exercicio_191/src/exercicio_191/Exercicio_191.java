package exercicio_191;

import java.util.Scanner;

public class Exercicio_191 {

    public static void main(String[] args) {
        /*Criar um algoritmo que leia um numero que sera o limite superior 
        de um intervalo e o incremento (incr). Imprimir os numeros naturais
        no intervalo de 0(zero) até este numero. Suponha que os dois numeros 
        lidos são maiores do que zero. 
        EXEMPLO:
        Limite Superior: 20 | Incremento: 5 | Saida 5 10 15 20 */
        
        //Variaveis 
        Scanner teclado = new Scanner(System.in);
        int limSup;
        int incr;
        int i; 
        
        //Entrada de dados 
        System.out.println("Informe um Limite Superior maior que 0: ");
        limSup = teclado.nextInt();
        System.out.println("Informe um Incremento maior que 0: ");
        incr = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        
        //Processamento
        for (i = 0; i <= limSup; i += incr) {
            System.out.print(i + " ");
        }
        
    }
    
}
