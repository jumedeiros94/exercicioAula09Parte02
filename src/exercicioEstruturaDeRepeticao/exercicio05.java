package exercicioEstruturaDeRepeticao;//Faça um programa para zerar a fila de um banco.

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos zerar a fila do banco");
        System.out.println("----------------------------");
        System.out.println("Qual sua posição na fila?");
        int senha = entrada.nextInt();

        for (int finalDaFila = senha; finalDaFila >=0; finalDaFila--) {
            System.out.println(finalDaFila + " - Por favor, próximo!");
        }

    }
}
