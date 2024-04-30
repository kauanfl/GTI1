package exercicio_188;

public class Exercicio_188 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Criar um algoritmo que imprima uma tabela de conversao de
        polegadas para centimetros. Deseja-se que a tabela conste valores 
        desde 1 polegada ate 20 polegadas.*/
        
        //Variaveis
        double polegada;
        double cm;
        
        //Processamemto
        for (polegada = 1; polegada <= 20; polegada++) {
             cm = polegada * 2.54;
             System.out.println( polegada + " | " + cm);
        }
    }
    
}
