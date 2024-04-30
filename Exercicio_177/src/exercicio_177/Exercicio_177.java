package exercicio_177;

public class Exercicio_177 {

    public static void main(String[] args) {
        //Imprimir os multiplos de 5, no intervalo de 1 a 500 
        
        //Variaveis
        int i;
        
        //Processamento
        for (i = 1; i <= 500; i++) {
            if (i % 5 == 5 || i % 5 == 0) {
               System.out.println(i);
            }   
        }
    }
    
}
