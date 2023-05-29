package exercicioEstruturaDeDecisao;

//Faça um programa que receba o preço de três produtos e
// informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        double produto1 = entrada.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        double produto2 = entrada.nextDouble();

        System.out.println("Digite o valor do terceiro produto: ");
        double produto3 = entrada.nextDouble();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("O produto com menor preço é o 1, custando R$" + produto1);
        }else if (produto2 < produto1 && produto2 < produto3){
            System.out.println("O produto com menor preço é o 2, custando R$" + produto2);
        }else {
            System.out.println("O produto com menor preço é o 3, custando R$" + produto3);
        }

    }
}
