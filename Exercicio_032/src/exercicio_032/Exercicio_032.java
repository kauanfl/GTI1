package exercicio_032;

//Importa biblioteca 
import java.util.Scanner;

public class Exercicio_032 {

    public static void main(String[] args) {
        //Ler um numero inteiro e imprimi-lo
        
        //Variaveis
       Scanner teclado = new Scanner(System.in);
       int numb;
       
       //Entrada de dados
       System.out.print("Informe um numero inteiro: ");
        numb = teclado.nextInt();
        
        //Saida de dados
        System.out.println("Numero inteiro "+ numb);
       
    }
    
}