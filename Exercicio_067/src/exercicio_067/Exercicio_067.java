package exercicio_067;

import java.util.Scanner;

public class Exercicio_067 {

    public static void main(String[] args) {
        /*Efetuar cálculo do valor de uma prestação em atraso, utilizando a formula:
        prestacao = valor + (valor * (taxa / 100) * tempo)
        Exemplo: valor R$ 1000
                 tempo 12 meses
                 taxa 1%
        
                 resposta R$ 1120
        */
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double valor, taxa, tempo, prestacao;
        
         //Entrada de dados
        System.out.println("Informe o valor: ");
        valor = teclado.nextDouble();
        System.out.println("Informe o tempo em atraso: ");
        tempo = teclado.nextDouble();
        
           //Processamento
           taxa = 1;
           prestacao = valor + (valor * (taxa / 100) * tempo);
           
            //Saida de dados
         System.out.println("Valor da prestação em atraso é: " + prestacao + " R$" );
           
    }
    
}
