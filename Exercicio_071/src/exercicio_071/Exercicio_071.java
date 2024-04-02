package exercicio_071;

import java.util.Scanner;

public class Exercicio_071 {

    public static void main(String[] args) {
        /*Criar um algoritmo que leia um valor de hora inteira e informe 
        quantos minutos se passaram desde o inicio do dia. 
        Se for 12:00h resultado 720 minutos
        Se for 24:00h resultado 1440 minutos*/
        
         //Variaveis
        Scanner teclado = new Scanner(System.in);
        int hora, minutos;
        
        
        //Entrada de dados
        System.out.println("Informe a hora atual inteira: ");
        hora = teclado.nextInt();
        
        //Processamento
        minutos = hora * 60;
        
        //Saida de dados
         System.out.println("Se for " + hora + " Horas" + " Resultado é "
         + minutos + " Minutos");
        
    }
    
}
