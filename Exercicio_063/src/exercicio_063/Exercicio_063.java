package exercicio_063;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio_063 {

public static void main(String[] args) {
/*Criar um algoritmo que efetue o cálculo do salário líquido de um funcionário. Os dados
fornecidos serão:
Valor da hora trabalhada
Número de horas trabalhadas no mês
Percentual de desconto do INSS.
Exemplo:
Valor hora trabalhada R$: 10.00
Número de hora trabalhadas no mês: 220 hr
Percentual de desconto do INSS: 9%
R$ 2200 - R$ 198 = R$ 2002*/

   //Variaveis
    Scanner teclado = new Scanner(System.in);
    double valorHora,
            horasTrabalhadas,
                descontoInss, 
                  descontoInss2, 
                      salarioBruto,
                         salarioLiquido;

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