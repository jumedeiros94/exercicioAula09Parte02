package exercicioEstruturaDeDecisao;//Faça um Programa que receba um número e exiba o dia correspondente da semana. (1-Domingo,
// 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido”.

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 1 - 7:");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}
