package exercicio_050;

import java.util.Scanner;
        
public class Exercicio_050 {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double base, altura, perimetro, area, diagonal;
        
        //Entrada de dados
        System.out.println("Informe a base: ");
        base = teclado.nextDouble();
         System.out.println("Informe a altura: ");
        altura = teclado.nextDouble();
        
        //Processamento 
        perimetro = (base + base) + (altura + altura);
        area = base * altura;
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        //Saida de dados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Àrea: " + area);
        System.out.println("Diagonal: " + diagonal);
        
    }
    
}
