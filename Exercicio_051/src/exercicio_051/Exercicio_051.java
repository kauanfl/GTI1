package exercicio_051;

import java.util.Scanner;

public class Exercicio_051 {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double raio, perimetro, area;
        
        //Entrada de dados
        System.out.println("Informe o raio: ");
        raio = teclado.nextDouble();
        
        //processamento
        perimetro = Math.PI*(raio + raio);
        area = Math.PI*raio;
        
         //Saida de dados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Àrea: " + area);
    }
    
}
