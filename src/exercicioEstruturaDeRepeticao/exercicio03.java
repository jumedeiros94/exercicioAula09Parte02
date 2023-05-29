package exercicioEstruturaDeRepeticao;

//Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        int cont = 1;
        int soma = 0;

        while (cont <= 5) {
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            soma = soma + num;
            cont++;

        }

        System.out.println("A soma dos números digitados é: " + soma);

    }
}
