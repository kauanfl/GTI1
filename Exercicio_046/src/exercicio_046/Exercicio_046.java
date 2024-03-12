package exercicio_046;

import java.util.Scanner;

public class Exercicio_046 {

    public static void main(String[] args) {
    /*Exercicio_046
Fazer um algoritmo que possa entrar o saldo de uma aplicação e imprimir o novo saldo
considerando o reajuste 1%.
Exemplo:
Saldo R$: 1000
Novo Saldo R$ : 1010*/
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double saldo;
        double novoSaldo;
        
        //Entrada de dados
        System.out.println("informe o saldo: ");
        saldo = teclado.nextDouble();
        
        //Processamento
        novoSaldo = saldo + saldo * 0.01;
        
        //Saida de dados 
        System.out.print("Novo saldo: " + novoSaldo);
        
    }
    
}