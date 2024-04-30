package exercicio_630;

import java.util.Scanner;

public class Exercicio_630 {

    public static void main(String[] args) {
        /*Criar um algoritmo que efetue o calculo do salario liquido
        de um funcionario. Os dados a serem fornecidos serao: valor da hora
        trabalhada em reais, numero de horas trabalhadas no mes real
        e percentual de desconto do inss em real*/

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        double valorHora,
                horasTrab,
                descontoInss;
        double salarioBruto,
                descontoInss2,
                salarioLiquido;

        //Entrada de dados 
        System.out.print("Informe o valor da hora trabalhada em reais: ");
        valorHora = teclado.nextInt();
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        horasTrab = teclado.nextInt();
        System.out.print("Informe o percentual de desconto do INSS: ");
        descontoInss = teclado.nextInt();
        System.out.println("-------------------------------------------------");

        //Processamento 
        salarioBruto = valorHora * horasTrab;
        descontoInss2 = (salarioBruto * descontoInss) / 100;
        salarioLiquido = salarioBruto - descontoInss2;

        System.out.println("Salário liquido: " + salarioLiquido);
    }

}
