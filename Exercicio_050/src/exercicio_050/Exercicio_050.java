package exercicio_050;

import java.util.Scanner;
        
public class Exercicio_050 {

    public static void main(String[] args) {
        /*Exercicio_050
Entrar com a base e altura de um retângulo e imprimir a seguinte saída:
Base: 3
Altura: 4
Perímetro: 14
Área: 12
Diagonal: 5
        */

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