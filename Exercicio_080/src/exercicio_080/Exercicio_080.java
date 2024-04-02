package exercicio_080;

import java.util.Scanner;

public class Exercicio_080 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double valor, acervo, faturamento;
        double novoAcervo, multa;
        
         //Entrada de dados
        System.out.println("Informe o Acervo da locadora: ");
        acervo = teclado.nextDouble();
        System.out.println("Informe o Custo do aluguel da fita R$: ");
        valor = teclado.nextDouble();
       
        
        //Processamento
        faturamento = (acervo / 3) * 10.00 * 12;
        
        multa = ((acervo / 3) * 0.1) * valor;
        
        novoAcervo = acervo * 0.98 * 1.1;
        novoAcervo = acervo * (100-2) * 1.1;
        novoAcervo = (acervo - (acervo * 0.02)) * 1.1;
        
        //Saida de dados
         System.out.println("Faturamento anual R$ " +  faturamento);
         System.out.println("Recebimento de multas no mes R$ " + multa );
         System.out.println("Total de fitas no final do ano: " +  novoAcervo);
        

        
    }
    
}
