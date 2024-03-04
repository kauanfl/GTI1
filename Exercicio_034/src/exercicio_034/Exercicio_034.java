package exercicio_034;

//Importa bibliteca
import java.util.Scanner;

public class Exercicio_034 {

    public static void main(String[] args) {
        //Ler um numero inteiro e imprimir o seu antecessor e sucessor
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int numb, last, next;
        
        //Entrada de dados
        System.out.println("Informe o numero: ");
        numb = teclado.nextInt();
        
        //Processamento
        last = numb - 1;
        next = numb + 1;
        
        //Saida de dados
        System.out.println("O numero antecessor ao numero informado é "+ last +" e o Sucessor é "+next);
    }
    
}
