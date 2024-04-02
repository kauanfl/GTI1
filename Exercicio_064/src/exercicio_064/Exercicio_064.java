package exercicio_064;

import java.util.Scanner;

public class Exercicio_064 {

    public static void main(String[] args) {
        /*Ler a temperatura em graus centigrados e apresentá-la convertida em graus
        fahrenheit. A formula é F = (9*C+160)/5. Onde F é a temperatura em fahrenheit 
        e C e a temperatura em centigrados 
                Exemplo: C = 100 logo F = 212
                           C = 0 logo F = 32*/
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        int c, f;
        
         //Entrada de dados
        System.out.println("Informe a temperatura em graus centígrados: ");
        c = teclado.nextInt();
        
        //Processamento
          f = (9 * c + 160) / 5;
          
        //Saida de dados
         System.out.println("A conversão para fahrenheit fica: " + f);
        
    }
    
}
