package exercicioEstruturaDeDecisao;

//Faça um programa que receba dois números e imprima o maior deles.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1 + " é o maior número");
        }else {
            System.out.println(numero2 + " é o maior número");
        }


    }


}
