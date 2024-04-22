package exercicio_120;

import java.util.Scanner;
public class Exercicio_120 {

    public static void main(String[] args) {
        /*Entrar com tres numeros e armazena-los em tres variaveis com os 
        seguintes nomes: maior, intermediario e menor*/
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int num1, num2 ,num3;
        int maior, intermediario, menor;
        
        //Entrada de dados
        System.out.println("Informe o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Informe o terceiro numero: ");
        num3 = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        //Processamento
        if (num1 >= num2 && num1 >= num3) {
                    if (num2 >= num3) {
                        maior = num1;
                        intermediario = num2;
                        menor = num3;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
                    } else {
                         maior = num1;
                        intermediario = num3;
                        menor = num2;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
                    }
        } else if (num2 >= num1 && num2 >= num3) {
                   if (num1 >= num3) {
                          maior = num2;
                        intermediario = num1;
                        menor = num3;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
                   } else {
                        maior = num2;
                        intermediario = num3;
                        menor = num1;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
                   }
                       
         } else {
            if (num1 >= num2) {
                        maior = num3;
                        intermediario = num1;
                        menor = num2;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
            } else {
                        maior = num3;
                        intermediario = num2;
                        menor = num1;
                        
                       System.out.println("Maior: " + maior);
                       System.out.println("Intermediário: " + intermediario);
                       System.out.println("Menor: " + menor);
                   }
        }
        
    }
    
}
