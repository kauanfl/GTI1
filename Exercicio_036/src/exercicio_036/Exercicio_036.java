package exercicio_036;

import java.util.Scanner;
        
public class Exercicio_036 {

    public static void main(String[] args) {
        /*Ler dois numeros inteiros e imprimir a soma.
       Antes do resultado devera aparecer a mensagem: "Soma"*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int numb1;
        int numb2;
        int result;
        
       //Entrada de dados
       System.out.print("Informe o primeiro numero: ");
       numb1 = teclado.nextInt();
       
        System.out.print("Informe o segundo numero: ");
       numb2 = teclado.nextInt();
       
       //Processamento 
       result = numb1 + numb2;
       
       //Saida de dados
       System.out.println("O resultado da soma é: "+ result);
                
       
       
    }
    
}