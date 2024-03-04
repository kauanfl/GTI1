package exercicio_035;

import java.util.Scanner;

public class Exercicio_035 {

    public static void main(String[] args) {
        //Ler nome, endereco e telefone e imprimi-los.
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        String endereco;
        String fone;
        
        //Entrada de dados
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        
        System.out.print("Informe seu endereço: ");
        endereco = teclado.nextLine();
        
        System.out.print("Informe seu telefone: ");
        fone = teclado.nextLine();
        
        //Saida de dados
        System.out.println("Nome: "+ nome);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Telefone: "+ fone);
        
    }
    
}
