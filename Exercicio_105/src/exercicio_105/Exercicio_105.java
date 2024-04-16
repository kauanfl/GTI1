package exercicio_105;

import java.util.Scanner;

public class Exercicio_105 {

    public static void main(String[] args) {
        //Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens: paulista, carioca, mineiro e outros estados
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String sigla;
        
        //Enunciado 
         System.out.println("Exercicio 105");
          System.out.println("Informe se a pessoa é dos estados: ");
           System.out.println("Paulista, Carioca, Mineiro ou outros estados.");
            System.out.println("--------------------------------------------------");
            
        //Entrada de dados 
         System.out.println("Informe o estado que a pessoa nasceu: ");
           System.out.println("SP - Paulista");
             System.out.println("MG - Mineiro");
               System.out.println("RJ - Carioca");
                System.out.println();
                  System.out.println("Informe o estado [SP, MG, RJ]: ");
         sigla = teclado.next().toUpperCase();
        
        //Processamento 
        if (sigla.compareTo("SP") == 0)
                  {
                  System.out.println(" Você é Paulista");  
         } 
        else if (sigla.compareTo("MG") == 0)
                  {
                  System.out.println(" Você é Mineiro");  
                
         }  
        else if (sigla.compareTo(" RJ") == 0)
                  {
                  System.out.println(" Você é Carioca");  
                
         }
        else 
                  {
                  System.out.println("Outros estados");  
                
        }
    
}
                             }