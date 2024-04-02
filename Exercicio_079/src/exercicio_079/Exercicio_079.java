package exercicio_079;

import java.util.Scanner;

public class Exercicio_079 {

    public static void main(String[] args) {
        /* Uma pessoa resolveu fazer uma aplicação em poupança programada.
        para calcular seu rendimento, ela deverá fornecer o valor constante da aplicação mensal,
           a taxa e o número de meses. Sabendo-se que a fomrula usada para este cálculo é:
           valor acumulado = p * ((1 + i) elevado n - 1)/i
                   onde   i = taxa               1
                          p = aplicacao mensal  100
                          n = numero de meses    12
                          
                          valor acumulado R$   +- 1268.25 */
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double p, i, n, valorAcumulado;
        
         //Entrada de dados
        System.out.println("Informe o valor constante da aplicação mensal: ");
        p = teclado.nextDouble();
        System.out.println("Informe a taxa: ");
        i = teclado.nextDouble();
         System.out.println("Informe o número de meses: ");
        n = teclado.nextDouble();
        
        //Processamento
        valorAcumulado = p * ((Math.pow(1 + i, n) - 1) / i);
        
        //Saida de dados
         System.out.println("Valor acumulado: R$" +  valorAcumulado);
        
    }
    
}
