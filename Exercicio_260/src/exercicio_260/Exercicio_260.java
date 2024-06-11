package exercicio_260;

import java.util.Scanner;

public class Exercicio_260 {

    public static void main(String[] args) {
     
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int i;
         int n1, n2, n3;
         int maior;
         int produto;
         int soma;
         i = 0;
         do {
              System.out.println("------------------------------------------------------------");
            System.out.println("[1] - Dados três números descubra qual e o maior e imprima");
            System.out.println("[2] - Dados três números informe se são pares ou impares");
            System.out.println("[3] - Dados três números mostre o produto dos mesmos ");
            System.out.println("[4] - Dados três números mostre a soma dos mesmos");
            System.out.println("[0] - Finalizar");
              System.out.println(" ");
              //Entrada de dados
            System.out.print("Escolha a opção desejada: ");
            i = teclado.nextInt();
              System.out.println(" ");
            //Opção 1
            if (i == 1) { 
            System.out.println("------------------------------------------------------------");
            System.out.print("Entre com o número 1: ");
            n1 = teclado.nextInt();
             System.out.print("Entre com o número 2: ");
            n2 = teclado.nextInt();
             System.out.print("Entre com o número 3: ");
            n3 = teclado.nextInt();
            
            //Processamento opção 1
            maior = n1;
            if(n2 > maior ){maior = n2; }
            if(n3 > maior ){maior = n3; }
            
             //Saida de dados opção 1
             System.out.println("  ");
             System.out.println("Número maior: " + maior);
            }
            
            //Opção 2
            if (i == 2) {
             System.out.println("------------------------------------------------------------");
            System.out.print("Entre com o número 1: ");
            n1 = teclado.nextInt();
             System.out.print("Entre com o número 2: ");
            n2 = teclado.nextInt();
             System.out.print("Entre com o número 3: ");
            n3 = teclado.nextInt();
            
            //Processamento/Saida de dados opção 2
            System.out.println("  ");
            if(n1 % 2 == 0){System.out.println("O número "+ n1 +" é par"); }
             else{System.out.println("O número "+ n1 +" é impar"); }
            if(n2 % 2 == 0){System.out.println("O número "+ n2 +" é par"); }
             else{System.out.println("O número "+ n2 +" é impar"); }
            if(n3 % 2 == 0){System.out.println("O número "+ n3 +" é par"); }
             else{System.out.println("O número "+ n3 +" é impar"); }
            
            
            }
            
            //Opção 3
            if (i == 3) {
              System.out.println("------------------------------------------------------------");
            System.out.print("Entre com o número 1: ");
            n1 = teclado.nextInt();
             System.out.print("Entre com o número 2: ");
            n2 = teclado.nextInt();
             System.out.print("Entre com o número 3: ");
            n3 = teclado.nextInt();
            
            //Processamento opção 3
            produto = ((n1 * n2) * n3);
            
             //Saida de dados opção 3
             System.out.println("  ");
             System.out.println("Produto: " + produto);
            }
            
            //Opção 4
            if (i == 4) {
                 System.out.println("------------------------------------------------------------");
            System.out.print("Entre com o número 1: ");
            n1 = teclado.nextInt();
             System.out.print("Entre com o número 2: ");
            n2 = teclado.nextInt();
             System.out.print("Entre com o número 3: ");
            n3 = teclado.nextInt();
            
            //Processamento opção 4
            soma = ((n1 + n2) + n3);
            
             //Saida de dados opção 4
             System.out.println("  ");
             System.out.println("Soma: " + soma);
            }
        
         }  while ((i >= 1) && (i <= 4));
    }
   
}
