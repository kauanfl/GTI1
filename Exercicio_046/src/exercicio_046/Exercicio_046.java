package exercicio_046;

import java.util.Scanner;

public class Exercicio_046 {

    public static void main(String[] args) {
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
