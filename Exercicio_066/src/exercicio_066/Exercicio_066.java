package exercicio_066;

  import java.util.Scanner;

public class Exercicio_066 {
    
    public static void main(String[] args) {
        /*Efetuar o calculo da quantidade de litros consumidos de combustivel
        gastos em uma viagem, sabendo-se que o carro faz 12km/ com um litro.
        Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
        Saída  de dados com 2 casas decimais. Utilizar as seguintes formulas:
        distancia = tempo * velocidade
        litros usados = distancia / 12
        O algoritmo deverá apresentar os valores da velocidade média,
        tempo gasto na viagem, distãncia percorrida e a quantidade de 
        litros utilizados na viagem*/
        
        //Variaveis
         Scanner teclado = new Scanner(System.in);
         double tempo, velocidade, distancia, litrosUsados;
         
          //Entrada de dados
        System.out.println("Informe o tempo gasto na viagem: ");
        tempo = teclado.nextDouble();
                 System.out.println("Informe a velocidade média gasto na viagem: ");
        velocidade = teclado.nextDouble();
        
         //Processamento
         distancia = tempo * velocidade;
         litrosUsados = distancia / 12;
         
         //Saida de dados
         System.out.println("Tempo gasto: " + tempo + " Horas" );
          System.out.println("Velocidade média: " + velocidade + " KM/H" );
           System.out.println("Distãncia percorrida: " + distancia + " KM");
            System.out.println("Litros utilizados na viagem: " + litrosUsados );
         
         
    }
    
}
