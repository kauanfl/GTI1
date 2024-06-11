package exercicio_261;

import java.util.Scanner;

public class Exercicio_261 {

    public static void main(String[] args) {
     
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String linha;
        char opcao;
        String p1, p2, p3;
        String menorPalavra;
          String maiorPalavra;
        double num;
        double raizQuarta;
        opcao = ' ';
        
        do {
          System.out.println("MENU: Um pouco de tudo");
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("[A] - Armazena na variável menor e imprimir o nome que tiver o menor número de caracteres entre as três palavras");
            System.out.println("[B] - Armazena na variável maior e imprimir o nome que tiver o maior número de caracteres entre as três palavras");
            System.out.println("[C] - Calcular e imprimir a raiz a quarta de um número");
            System.out.println("[F] - Finalizar");
              System.out.println(" ");
             
              //Entrada de dados
            System.out.print("Escolha a opção desejada: ");
            opcao = teclado.next().toUpperCase().charAt(0);
              System.out.println(" ");   
            
            //Opção A
            if (opcao == 'A') {
            System.out.println("------------------------------------------------------------");
            System.out.print("Entre com a primeira palavra: ");
            p1 = teclado.next();
             System.out.print("Entre com a segunda palavra: ");
            p2 = teclado.next();
             System.out.print("Entre com a terceira palavra: ");
            p3 = teclado.next();
            
            //Processamento opção A 
    menorPalavra = p1;
    if (p2.length() < menorPalavra.length()) {
        menorPalavra = p2;
    }
    if (p3.length() < menorPalavra.length()) {
        menorPalavra = p3;
    }

    //Saida de dados opção A
    System.out.println("  ");
    System.out.println("A menor palavra é: " + menorPalavra);     
        System.out.println("  ");
            System.out.println("////////////////////////////////////////////////////////////////////");
            }
            
            //Opção B
            if (opcao == 'B') {
            System.out.println("------------------------------------------------------------");
            System.out.print("Entre com a primeira palavra: ");
            p1 = teclado.next();
             System.out.print("Entre com a segunda palavra: ");
            p2 = teclado.next();
             System.out.print("Entre com a terceira palavra: ");
            p3 = teclado.next();
            
            //Processamento opção A 
    maiorPalavra = p1;
    if (p2.length() > maiorPalavra.length()) {
        menorPalavra = p2;
    }
    if (p3.length() > maiorPalavra.length()) {
        menorPalavra = p3;
    }
            //Saida de dados opção A
    System.out.println("  ");
    System.out.println("A menor palavra é: " + maiorPalavra);     
        System.out.println("  ");
            System.out.println("////////////////////////////////////////////////////////////////////");
            }
            
            //Opção C
            if (opcao == 'C') {
            System.out.print("Informe o número desejado: ");
            num = teclado.nextDouble();
            
            //Processamento opção C
            raizQuarta = Math.pow(num, 1.0 / 4.0);
            
              //Saida de dados opção C
    System.out.println("  ");
    System.out.println("Raiz a quarta do número selecionado: " + raizQuarta);     
        System.out.println("  ");
            System.out.println("////////////////////////////////////////////////////////////////////");
            }
        }while (opcao != 'F');
    }
    
}
