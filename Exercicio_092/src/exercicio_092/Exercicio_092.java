package exercicio_092;

import java.util.Scanner;

public class Exercicio_092 {

    public static void main(String[] args) {
        /*Construir um algoritmo que leia dois numeros e efetue sua adiçã.
         Caso o valo somado seja maior que 2, este deverá ser apresentado 
         somando-se a el mais8; caso o valor semado seja menor ou igual a 20
         este deverá ser apresentado subtraindo-se de 5. Utilizar números reais.*/
        
        //Variavel 
        Scanner teclado = new Scanner(System.in);
         int num1, 
                 num2,
                    soma,
                       result;
         
        //Entrada de dados 
         System.out.println("Informe o primeiro número: ");
         num1 = teclado.nextInt();
          System.out.println("Informe o segundo número: ");
         num2 = teclado.nextInt();
         
        //Processamento
        soma = num1 + num2;
        if (soma <= 20){
            result = soma - 5;
               System.out.println("Resultado: " + result);
         } else {
                    result = soma + 8;
               System.out.println("Resultado: " + result);
         }
        
          
         
    }
    
}
