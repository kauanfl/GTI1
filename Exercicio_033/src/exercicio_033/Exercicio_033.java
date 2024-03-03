package exercicio_033;

import java.util.Scanner;

public class Exercicio_033 {

    public static void main(String[] args) {
        //Ler dois numeros inteiros e imprimi-los
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int numb1, numb2;
        
        //Entrada de dados
        System.out.println("Informe o primeiro numero: ");
        numb1 = teclado.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        numb2 = teclado.nextInt();
        
        //Saida de dados
        System.out.println("Os numeros informados foram: "+ numb1 + " e "+ numb2);
    }
    
}
