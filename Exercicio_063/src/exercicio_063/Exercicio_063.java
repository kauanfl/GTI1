package exercicio_063;

import java.util.Scanner;

public class Exercicio_063 {

    public static void main(String[] args) {
       //Variaveis
        Scanner teclado = new Scanner(System.in);
        double valorHora, horasTrabalhadas, descontoInss, descontoInss2, salarioBruto, salarioLiquido;
        
        //Entrada de dados
        System.out.println("Informe o valor da hora trabalhada: ");
        valorHora = teclado.nextDouble();
        System.out.println("Informe o número de horas trabalhadasno mês: ");
        horasTrabalhadas = teclado.nextDouble();
        System.out.println("Informe o percentual de desconto do INSS: ");
        descontoInss = teclado.nextDouble();
        
        //Processamento
        salarioBruto = valorHora * horasTrabalhadas;
        descontoInss2 = ( salarioBruto * descontoInss)/100;
        salarioLiquido = salarioBruto - descontoInss2;
        
        System.out.println("Salário liquido: "+ salarioLiquido);
    }
    
}

